SET SERVEROUTPUT ON;

/* =========================================================
1. ZERO_DIVIDE : Crear un bloque que divida 100 entre una variable v_numero. 
Primero hacer que v_numero valga 0 y controlar ZERO_DIVIDE. 
Después probar con v_numero igual a 5.
========================================================= */

DECLARE
    v_numbero NUMBER := 0;
    v_resultado NUMBER;
BEGIN
    v_resultado := 100 / v_numbero;
    DBMS_OUTPUT.PUT_LINE('Resultado: ' || v_resultado);
EXCEPTION
    WHEN ZERO_DIVIDE THEN
        DBMS_OUTPUT.PUT_LINE('ERROR: No se puede dividir entre cero.');
END;
/
----------------------------------------------------------
DECLARE
  v_numero NUMBER := 5;
  v_resultado NUMBER;
BEGIN
  v_resultado := 100 / v_numero;
  DBMS_OUTPUT.PUT_LINE('Resultado: ' || v_resultado);
EXCEPTION
  WHEN ZERO_DIVIDE THEN
    DBMS_OUTPUT.PUT_LINE('ERROR: No se puede dividir entre cero.');
END;
/

/* =========================================================
2. VALUE_ERROR:(VARIABLE DEMASIADO PEQUEÑA):
Recorrer el empleado con documento 22777888 y guardar su nombre en una variable VARCHAR2(3).
 Controlar VALUE_ERROR.
========================================================= */

DECLARE
  v_nombre VARCHAR2(3);
BEGIN
    SELECT nombre
    INTO v_nombre
    FROM empleados
    WHERE documento = '22777888';

    DBMS_OUTPUT.PUT_LINE('NOMBRE: ' || v_nombre);

EXCEPTION
    WHEN VALUE_ERROR THEN
        DBMS_OUTPUT.PUT_LINE('ERROR: El tamaño de la variable es demasiado pequeño.');
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('ERROR: Empleado no encontrado.');
END;
/

/* =========================================================
3. DUP_VAL_ON_INDEX(EMPLEADO DUPLICADOQ ):
Intentar insertar un libro con código 100 y controlar DUP_VAL_ON_INDEX.
========================================================= */

BEGIN
  INSERT INTO empleados
  VALUES ('700','PEREZ','Luis',300,SYSDATE);

  DBMS_OUTPUT.PUT_LINE('Empleado insertado correctamente.');

EXCEPTION
  WHEN DUP_VAL_ON_INDEX THEN
    DBMS_OUTPUT.PUT_LINE('ERROR: Ya existe un empleado con ese documento.');
END;
/

/* =========================================================
4. NO_DATA_FOUND(Buscar empleado inexistente):
Buscar un empleado por documento usando un bucle FOR. Si no se encuentra, lanzar NO_DATA_FOUND.
========================================================= */
DESC empleados;
SET SERVEROUTPUT ON;

BEGIN
    FOR emp IN (
        SELECT nombre
        FROM empleados
        WHERE id = 99999999
    ) LOOP

        DBMS_OUTPUT.PUT_LINE('Empleado encontrado: ' || emp.nombre);
        RETURN;

    END LOOP;

    RAISE NO_DATA_FOUND;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('ERROR: Empleado no encontrado');
END;
/
DESC libros;
/* =========================================================
5. TOO_MANY_ROWS (Buscar libro inexistente)
Buscar un libro por código usando un bucle FOR. Si no se encuentra, lanzar NO_DATA_FOUND.
========================================================= */
SET SERVEROUTPUT ON;

BEGIN
    FOR lib IN (
        SELECT titulo
        FROM libros
        WHERE idlibro = 999
    ) LOOP

        DBMS_OUTPUT.PUT_LINE('Libro encontrado: ' || lib.titulo);
        RETURN;

    END LOOP;

    RAISE NO_DATA_FOUND;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('ERROR: Libro no encontrado');
END;
/




































DECLARE
  v_apellido empleados.apellido%TYPE := 'Perez';
  v_contador NUMBER := 0;
BEGIN
  FOR emp IN (SELECT nombre, apellido 
              FROM empleados 
              WHERE apellido = v_apellido) LOOP
    v_contador := v_contador + 1;
    DBMS_OUTPUT.PUT_LINE(emp.nombre || ' ' || emp.apellido);
  END LOOP;

  IF v_contador = 0 THEN
    RAISE NO_DATA_FOUND;
  ELSIF v_contador > 1 THEN
    RAISE TOO_MANY_ROWS;
  END IF;

EXCEPTION
  WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('No hay empleados con ese apellido.');
  WHEN TOO_MANY_ROWS THEN
    DBMS_OUTPUT.PUT_LINE('ERROR: Hay más de un empleado con ese apellido.');
END;
/

/* =========================================================
6. EXCEPCIÓN PROPIA
========================================================= */

DECLARE
  sueldo_bajo EXCEPTION;
  v_encontrado BOOLEAN := FALSE;
BEGIN
  FOR emp IN (SELECT sueldo, documento FROM empleados WHERE documento = '22333444') LOOP
    v_encontrado := TRUE;

    IF emp.sueldo < 600 THEN
      RAISE sueldo_bajo;
    END IF;

    DBMS_OUTPUT.PUT_LINE('Sueldo correcto: ' || emp.sueldo);
  END LOOP;

  IF NOT v_encontrado THEN
    RAISE NO_DATA_FOUND;
  END IF;

EXCEPTION
  WHEN sueldo_bajo THEN
    DBMS_OUTPUT.PUT_LINE('ERROR: El sueldo es demasiado bajo.');
  WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('Empleado no encontrado.');
END;
/

/* =========================================================
7. WHEN OTHERS (CORREGIDO INSERT)
========================================================= */

BEGIN
  INSERT INTO libros (codigo, titulo, autor, editorial, precio)
  VALUES (100, 'Libro repetido', 'Autor X', 'Editorial X', 20);

EXCEPTION
  WHEN VALUE_ERROR THEN
    DBMS_OUTPUT.PUT_LINE('Error de valor.');
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('ERROR NO CONTROLADO');
    DBMS_OUTPUT.PUT_LINE('Código: ' || SQLCODE);
    DBMS_OUTPUT.PUT_LINE('Mensaje: ' || SQLERRM);
END;
/

/* =========================================================
8. RAISE_APPLICATION_ERROR
========================================================= */

DECLARE
  v_encontrado BOOLEAN := FALSE;
BEGIN
  FOR emp IN (SELECT sueldo, documento FROM empleados WHERE documento = '22333444') LOOP
    v_encontrado := TRUE;

    IF emp.sueldo < 600 THEN
      RAISE_APPLICATION_ERROR(-20001, 'El sueldo mínimo es 600€');
    END IF;

    DBMS_OUTPUT.PUT_LINE('Sueldo correcto');
  END LOOP;

  IF NOT v_encontrado THEN
    RAISE NO_DATA_FOUND;
  END IF;

EXCEPTION
  WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('Empleado no encontrado.');
END;
/