-- TABLAS
--borrar tabla empelados anterior
drop table empleados;
 
 --crear nueva tabla empleados
create table empleados (
   documento    char(8),
   nombre       varchar2(20),
   apellido     varchar2(20),
   sueldo       number(6,2),
   fechaingreso date
);

 --ingreso de datos
insert into empleados values ( '22222222',
                               'Juan',
                               'Perez',
                               300,
                               to_date('10/10/1980','dd/mm/yyyy') );
insert into empleados values ( '22333333',
                               'Luis',
                               'Lopez',
                               300,
                               to_date('12/05/1998','dd/mm/yyyy') );
insert into empleados values ( '22444444',
                               'Marta',
                               'Perez',
                               500,
                               to_date('25/08/1990','dd/mm/yyyy') );
insert into empleados values ( '22555555',
                               'Susana',
                               'Garcia',
                               400,
                               to_date('05/05/2000','dd/mm/yyyy') );
insert into empleados values ( '22666666',
                               'Jose Maria',
                               'Morales',
                               400,
                               to_date('24/10/2005','dd/mm/yyyy') );
commit;
/*=========================================================
TEMA 17 - SUBPROGRAMAS Y TRIGGERS
VERSIÓN CORREGIDA Y FUNCIONAL
=========================================================*/

/*=========================================================
LIMPIEZA (IMPORTANTE PARA EVITAR ERRORES)
=========================================================*/

DROP TABLE empleados CASCADE CONSTRAINTS;
/
DROP TABLE auditoria;
/

/*=========================================================
TABLA EMPLEADOS (CORREGIDA)
=========================================================*/

CREATE TABLE empleados(
    id NUMBER PRIMARY KEY,
    nombre VARCHAR2(30),
    salario NUMBER,
    departamento NUMBER
);
/

/* DATOS */

INSERT INTO empleados VALUES(1,'Juan',1000,1);
INSERT INTO empleados VALUES(2,'Ana',1500,1);
INSERT INTO empleados VALUES(3,'Luis',1200,2);
COMMIT;
/

/*=========================================================
PROCEDIMIENTO SALUDAR
=========================================================*/

CREATE OR REPLACE PROCEDURE saludar
IS
BEGIN
    DBMS_OUTPUT.PUT_LINE('Hola');
END;
/

BEGIN
    saludar;
END;
/

/*=========================================================
PROCEDIMIENTO NOMBRE
=========================================================*/

CREATE OR REPLACE PROCEDURE mostrarNombre(
    p_nombre VARCHAR2
)
IS
BEGIN
    DBMS_OUTPUT.PUT_LINE('Hola ' || p_nombre);
END;
/

BEGIN
    mostrarNombre('Pikachu');
END;
/

/*=========================================================
FUNCION SUMA
=========================================================*/

CREATE OR REPLACE FUNCTION suma(
    a NUMBER,
    b NUMBER
)
RETURN NUMBER
IS
BEGIN
    RETURN a + b;
END;
/

BEGIN
    DBMS_OUTPUT.PUT_LINE(suma(2,3));
END;
/

/*=========================================================
FUNCION FACTORIAL
=========================================================*/

CREATE OR REPLACE FUNCTION factorial(
    n NUMBER
)
RETURN NUMBER
IS
BEGIN
    IF n = 1 THEN
        RETURN 1;
    ELSE
        RETURN n * factorial(n-1);
    END IF;
END;
/

BEGIN
    DBMS_OUTPUT.PUT_LINE(factorial(5));
END;
/

/*=========================================================
PROCEDIMIENTO CONSULTAR EMPLEADO (FIX ID ERROR)
=========================================================*/

CREATE OR REPLACE PROCEDURE consultarEmpleado(
    p_id NUMBER
)
IS
    v_nombre empleados.nombre%TYPE;
    v_salario empleados.salario%TYPE;
BEGIN
    SELECT nombre, salario
    INTO v_nombre, v_salario
    FROM empleados
    WHERE id = p_id;

    DBMS_OUTPUT.PUT_LINE(v_nombre);
    DBMS_OUTPUT.PUT_LINE(v_salario);
END;
/

BEGIN
    consultarEmpleado(1);
END;
/

/*=========================================================
FUNCION COMPARAR SALARIO (FIX COMPLETO)
=========================================================*/

CREATE OR REPLACE FUNCTION compararSalario(
    p_id NUMBER
)
RETURN VARCHAR2
IS
    v_salario NUMBER;
    v_departamento NUMBER;
    v_media NUMBER;
BEGIN
    SELECT salario, departamento
    INTO v_salario, v_departamento
    FROM empleados
    WHERE id = p_id;

    SELECT AVG(salario)
    INTO v_media
    FROM empleados
    WHERE departamento = v_departamento;

    IF v_salario > v_media THEN
        RETURN 'Mayor que la media';
    ELSE
        RETURN 'Menor o igual';
    END IF;
END;
/

BEGIN
    DBMS_OUTPUT.PUT_LINE(compararSalario(1));
END;
/

/*=========================================================
PAQUETE
=========================================================*/

CREATE OR REPLACE PACKAGE paquetePokemon
IS
    PROCEDURE atacar;
    FUNCTION vida RETURN NUMBER;
END;
/

CREATE OR REPLACE PACKAGE BODY paquetePokemon
IS
    PROCEDURE atacar IS
    BEGIN
        DBMS_OUTPUT.PUT_LINE('Ataque realizado');
    END;

    FUNCTION vida RETURN NUMBER IS
    BEGIN
        RETURN 100;
    END;
END;
/

BEGIN
    paquetePokemon.atacar;
    DBMS_OUTPUT.PUT_LINE(paquetePokemon.vida);
END;
/

/*=========================================================
TRIGGER EJEMPLO EN CLASES
=========================================================*/
CREATE OR REPLACE TRIGGER tr_aumentasueldo
BEFORE UPDATE ON empleados
FOR EACH ROW
WHEN (NEW.sueldo > OLD.sueldo)
BEGIN
    INSERT INTO control
    VALUES (
        :OLD.documento,
        :OLD.nombre,
        :OLD.apellido,
        :NEW.sueldo,
        SYSDATE
    );
END;
/
/*=========================================================
TRIGGER INSERT
=========================================================*/

CREATE OR REPLACE TRIGGER avisoInsert
AFTER INSERT ON empleados
BEGIN
    DBMS_OUTPUT.PUT_LINE('Empleado insertado');
END;
/

INSERT INTO empleados VALUES(4,'Mario',1400,2);
COMMIT;
/

/*=========================================================
BEFORE TRIGGER VALIDACION
=========================================================*/

CREATE OR REPLACE TRIGGER validarSalario
BEFORE INSERT ON empleados
FOR EACH ROW
BEGIN
    IF :NEW.salario < 0 THEN
        RAISE_APPLICATION_ERROR(-20001,'Salario incorrecto');
    END IF;
END;
/

/*=========================================================
AUDITORIA (OLD / NEW)
=========================================================*/

CREATE TABLE auditoria(
    nombre VARCHAR2(30),
    salario_viejo NUMBER,
    salario_nuevo NUMBER
);
/

CREATE OR REPLACE TRIGGER auditoriaSalario
AFTER UPDATE ON empleados
FOR EACH ROW
BEGIN
    INSERT INTO auditoria
    VALUES(:OLD.nombre, :OLD.salario, :NEW.salario);
END;
/

UPDATE empleados
SET salario = 2000
WHERE id = 1;

COMMIT;
/

/*=========================================================
INSERT UPDATE DELETE TRIGGER
=========================================================*/

CREATE OR REPLACE TRIGGER acciones
BEFORE INSERT OR UPDATE OR DELETE ON empleados
BEGIN
    IF INSERTING THEN
        DBMS_OUTPUT.PUT_LINE('INSERT');
    ELSIF UPDATING THEN
        DBMS_OUTPUT.PUT_LINE('UPDATE');
    ELSIF DELETING THEN
        DBMS_OUTPUT.PUT_LINE('DELETE');
    END IF;
END;
/

/*=========================================================
VISTA + INSTEAD OF
=========================================================*/

CREATE OR REPLACE VIEW vista_empleados AS
SELECT nombre, salario FROM empleados;
/

CREATE OR REPLACE TRIGGER triggerVista
INSTEAD OF INSERT ON vista_empleados
FOR EACH ROW
BEGIN
    INSERT INTO empleados(nombre, salario)
    VALUES(:NEW.nombre, :NEW.salario);
END;
/

/*=========================================================
SCHEDULER (CORREGIDO)
=========================================================*/

BEGIN
    DBMS_SCHEDULER.CREATE_JOB(
        job_name   => 'trabajo1',
        job_type   => 'PLSQL_BLOCK',
        job_action => 'BEGIN DBMS_OUTPUT.PUT_LINE(''Hola Job''); END;',
        start_date => SYSTIMESTAMP,
        enabled    => TRUE
    );
END;
/

BEGIN
    DBMS_SCHEDULER.RUN_JOB('trabajo1');
END;
/
