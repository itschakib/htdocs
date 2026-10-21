SET SERVEROUTPUT ON;

-- =========================================================
-- TIPOS DE DATOS COMPUESTOS
-- =========================================================

DECLARE

-- RECORD
TYPE tipo_persona IS RECORD(
    id NUMBER,
    nombre VARCHAR2(50),
    ciudad VARCHAR2(50)
);

persona tipo_persona;

-- %TYPE
v_nombre empleados.nombre%TYPE;

-- %ROWTYPE
fila_empleado empleados%ROWTYPE;

-- VARRAY
TYPE lista IS VARRAY(5) OF VARCHAR2(20);
nombres lista := lista();

-- ARRAY ASOCIATIVO
TYPE agenda IS TABLE OF VARCHAR2(20)
INDEX BY VARCHAR2(30);

contactos agenda;
i VARCHAR2(30);

-- TABLA ANIDADA
TYPE ciudades IS TABLE OF VARCHAR2(30);
lista_ciudades ciudades := ciudades();

BEGIN

-- =========================
-- RECORD
-- =========================
persona.id := 1;
persona.nombre := 'Juan';
persona.ciudad := 'Madrid';

DBMS_OUTPUT.PUT_LINE('ID: ' || persona.id);
DBMS_OUTPUT.PUT_LINE('Nombre: ' || persona.nombre);
DBMS_OUTPUT.PUT_LINE('Ciudad: ' || persona.ciudad);

-- =========================
-- %TYPE
-- =========================
v_nombre := 'Carlos';
DBMS_OUTPUT.PUT_LINE(v_nombre);

-- =========================
-- %ROWTYPE
-- =========================
fila_empleado.nombre := 'Ana';
fila_empleado.salario := 2000;

DBMS_OUTPUT.PUT_LINE(fila_empleado.nombre);

-- =========================
-- VARRAY
-- =========================
nombres.EXTEND(3);

nombres(1) := 'Juan';
nombres(2) := 'Ana';
nombres(3) := 'Carlos';

FOR j IN 1..nombres.COUNT LOOP
    DBMS_OUTPUT.PUT_LINE(nombres(j));
END LOOP;

DBMS_OUTPUT.PUT_LINE('Elementos: ' || nombres.COUNT);
DBMS_OUTPUT.PUT_LINE('Máximo: ' || nombres.LIMIT);

DBMS_OUTPUT.PUT_LINE('Primero: ' || nombres.FIRST);
DBMS_OUTPUT.PUT_LINE('Último: ' || nombres.LAST);

DBMS_OUTPUT.PUT_LINE('Next(1): ' || nombres.NEXT(1));
DBMS_OUTPUT.PUT_LINE('Prior(3): ' || nombres.PRIOR(3));

-- =========================
-- ARRAY ASOCIATIVO
-- =========================
contactos('Juan') := '612345678';
contactos('Ana') := '698765432';

i := contactos.FIRST;

WHILE i IS NOT NULL LOOP
    DBMS_OUTPUT.PUT_LINE(i || ' -> ' || contactos(i));
    i := contactos.NEXT(i);
END LOOP;

contactos.DELETE('Juan');

DBMS_OUTPUT.PUT_LINE('--- DESPUÉS DE BORRAR ---');

i := contactos.FIRST;

WHILE i IS NOT NULL LOOP
    DBMS_OUTPUT.PUT_LINE(i || ' -> ' || contactos(i));
    i := contactos.NEXT(i);
END LOOP;

-- =========================
-- TABLA ANIDADA
-- =========================
lista_ciudades.EXTEND(2);

lista_ciudades(1) := 'Madrid';
lista_ciudades(2) := 'Málaga';

DBMS_OUTPUT.PUT_LINE(lista_ciudades(1));
DBMS_OUTPUT.PUT_LINE(lista_ciudades(2));

END;
/

-- =========================================================
-- CURSORES (SIMPLIFICADOS)
-- =========================================================

-- 1. CURSOR IMPLÍCITO
DECLARE
BEGIN

    UPDATE empleados
    SET salario = salario + 100;

    DBMS_OUTPUT.PUT_LINE('Filas actualizadas: ' || SQL%ROWCOUNT);

END;
/

-- 2. CURSOR EXPLÍCITO
DECLARE

    CURSOR c_emp IS
        SELECT nombre FROM empleados;

    v_nombre empleados.nombre%TYPE;

BEGIN

    OPEN c_emp;

    LOOP
        FETCH c_emp INTO v_nombre;
        EXIT WHEN c_emp%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE(v_nombre);
    END LOOP;

    CLOSE c_emp;

END;
/

-- 3. CURSOR CON PARÁMETROS
DECLARE

    CURSOR c_emp(p_sal NUMBER) IS
        SELECT nombre
        FROM empleados
        WHERE salario >= p_sal;

    v_nombre empleados.nombre%TYPE;

BEGIN

    OPEN c_emp(30000);

    LOOP
        FETCH c_emp INTO v_nombre;
        EXIT WHEN c_emp%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE(v_nombre);
    END LOOP;

    CLOSE c_emp;

END;
/
-- =========================================
-- 9. CICLO DE VIDA DE UN CURSOR
-- =========================================

-- OPEN → abre el cursor
-- FETCH → obtiene filas
-- CLOSE → libera recursos

DECLARE

    CURSOR c_emp IS
        SELECT nombre FROM empleados;

    v_nombre empleados.nombre%TYPE;

BEGIN

    OPEN c_emp;  -- OPEN

    LOOP
        FETCH c_emp INTO v_nombre;  -- FETCH
        EXIT WHEN c_emp%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE(v_nombre);
    END LOOP;

    CLOSE c_emp;  -- CLOSE

END;
/