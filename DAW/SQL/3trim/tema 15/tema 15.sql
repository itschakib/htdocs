-- =========================================
-- TEMA 15 : PL/SQL (PRÁCTICAS COMPLETAS)
-- =========================================
-- Activar salida
SET SERVEROUTPUT ON;

-- =========================================
-- BLOQUE PRINCIPAL (RESUMEN GENERAL)
-- =========================================
DECLARE
     v_nombre   VARCHAR2(50) := 'Carlos';
     v_edad     NUMBER := 20;
     v_contador NUMBER := 1;
     v_texto    VARCHAR2(50);
BEGIN
    -- IF
     IF v_edad >= 18 THEN
          v_texto := 'Mayor de edad';
     ELSE
          v_texto := 'Menor de edad';
     END IF;

     dbms_output.put_line(v_texto);

    -- CASE
     CASE v_nombre
          WHEN 'Carlos' THEN
               dbms_output.put_line('Hola Carlos');
          ELSE
               dbms_output.put_line('Nombre desconocido');
     END CASE;

    -- FOR
     FOR i IN 1..3 LOOP
          dbms_output.put_line('FOR: ' || i);
     END LOOP;

    -- WHILE
     WHILE v_contador <= 3 LOOP
          dbms_output.put_line('WHILE: ' || v_contador);
          v_contador := v_contador + 1;
     END LOOP;

    -- FUNCIONES
     dbms_output.put_line('Mayúsculas: ' || upper(v_nombre));
     dbms_output.put_line('Potencia: ' || power(2, 3));
EXCEPTION
     WHEN OTHERS THEN
          dbms_output.put_line('Error detectado');
END;
/

-- =========================================
-- EJEMPLO 1
-- =========================================
DECLARE
     identificador INTEGER := 50;
     nombre        VARCHAR2(25) := 'ROCIA';
     apodo         CHAR(10) := 'RO';
     sueldo        NUMBER(5) := 30000;
     comision      NUMBER(4, 2) := 50.20;
     fecha_actual  DATE := sysdate;
     fecha         DATE := TO_DATE ( '2020/07/09', 'yyyy/mm/dd' );
     saludo        VARCHAR2(50) DEFAULT 'Buenos dias';
BEGIN
     dbms_output.put_line(identificador);
     dbms_output.put_line(fecha_actual);
END;
/

-- =========================================
-- EJEMPLO 2 (CONSTANTES)
-- =========================================
DECLARE
     mensaje CONSTANT VARCHAR2(30) := 'BUENOS DIAS';
     numero  CONSTANT NUMBER(6) := 30000;
BEGIN
     dbms_output.put_line(mensaje);
     dbms_output.put_line(numero);
END;
/

-- =========================================
-- EJEMPLO 3
-- =========================================
DECLARE
     año_fabricacion CONSTANT NUMBER(4, 0) := 1986;
     vehiculo        VARCHAR2(20) := 'coche';
     consumo         NUMBER(4, 2) := 0;
BEGIN
     NULL;
END;
/

-- =========================================
-- EJEMPLO 4 (BLOQUES ANIDADOS)
-- =========================================
DECLARE
     cadena   VARCHAR2(30) := 'Esto es una cadena ';
     longitud NUMBER(3);
BEGIN
     longitud := length(cadena);
     dbms_output.put_line(longitud);
     BEGIN
          dbms_output.put_line(longitud + 1);
     END;
END;
/

-- =========================================
-- EJEMPLO 5 (IF)
-- =========================================
DECLARE
     a NUMBER(2) := 10;
     b NUMBER(2) := 20;
BEGIN
     IF a > b THEN
          dbms_output.put_line(a
                               || ' es mayor que '
                               || b);
     ELSE
          dbms_output.put_line(a
                               || ' es menor que '
                               || b);
     END IF;
END;
/

-- =========================================
-- EJEMPLO 6 (IF ELSIF)
-- =========================================
DECLARE
     x NUMBER(2) := 20;
BEGIN
     IF x = 10 THEN
          dbms_output.put_line('El numero x es igual a 10');
     ELSIF x = 20 THEN
          dbms_output.put_line('El numero x es igual a 20');
     ELSIF x = 30 THEN
          dbms_output.put_line('El numero x es igual a 30');
     ELSE
          dbms_output.put_line('El numero x es mayor a 30');
     END IF;
END;
/

-- =========================================
-- EJEMPLO 7 (LOOP)
-- =========================================
DECLARE
     valor NUMBER := 10;
BEGIN
     LOOP
          dbms_output.put_line(valor);
          valor := valor + 10;
          IF valor > 50 THEN
               EXIT;
          END IF;
     END LOOP;

     dbms_output.put_line('valor final = ' || valor);
END;
/

-- =========================================
-- EJEMPLO 8
-- =========================================
DECLARE
     nombre    VARCHAR2(30);
     direccion VARCHAR2(30);
     detalles  CLOB;
     eleccion  CHAR(1);
BEGIN
     nombre := 'Rocia Castillo';
     direccion := 'Calle Malaga';
     detalles := 'CLOB es una cadena de gran almacenamiento';
     eleccion := 'y';
     IF eleccion = 'y' THEN
          dbms_output.put_line(nombre);
          dbms_output.put_line(direccion);
          dbms_output.put_line(detalles);
     END IF;

END;
/

-- =========================================
-- EJEMPLO 9 (FUNCIONES STRING)
-- =========================================
DECLARE
     saludo VARCHAR2(20) := 'HOLA A TODOS';
BEGIN
     dbms_output.put_line(upper(saludo));
     dbms_output.put_line(lower(saludo));
     dbms_output.put_line(initcap(saludo));
     dbms_output.put_line(substr(saludo, 1, 3));
     dbms_output.put_line(substr(saludo, 2));
     dbms_output.put_line(instr(saludo, 'O'));
END;
/

-- =========================================
-- EJEMPLO 10 (TRIM)
-- =========================================
DECLARE
     saludo2 VARCHAR2(30) := '####hola a todos####';
BEGIN
     dbms_output.put_line(rtrim(saludo2, '#'));
     dbms_output.put_line(ltrim(saludo2, '#'));
     dbms_output.put_line(trim('#' FROM saludo2));
END;
/

-- =========================================
-- EJEMPLO 11 (WHILE)
-- =========================================
DECLARE
     contador NUMBER := 1;
BEGIN
     WHILE contador < 10 LOOP
          dbms_output.put_line(contador);
          contador := contador + 1;
     END LOOP;
END;
/

-- =========================================
-- EJEMPLO 12 (TABLA MULTIPLICAR WHILE)
-- =========================================
DECLARE
     contador  NUMBER := 0;
     numero    NUMBER := 3;
     resultado NUMBER;
BEGIN
     WHILE contador <= 10 LOOP
          resultado := numero * contador;
          dbms_output.put_line(numero
                               || ' X '
                               || contador
                               || ' = '
                               || resultado);

          contador := contador + 1;
     END LOOP;
END;
/

-- =========================================
-- EJEMPLO 13 (TABLA MULTIPLICAR FOR)
-- =========================================
DECLARE
     numero    NUMBER := 3;
     resultado NUMBER;
BEGIN
     FOR contador IN 0..10 LOOP
          resultado := numero * contador;
          dbms_output.put_line(numero
                               || ' X '
                               || contador
                               || ' = '
                               || resultado);

     END LOOP;
END;
/

-- =========================================
-- EJEMPLO 14 (BUCLES ANIDADOS)
-- =========================================
DECLARE
     bucle1 NUMBER := 0;
     bucle2 NUMBER;
BEGIN
     LOOP
          dbms_output.put_line('---------------------');
          dbms_output.put_line('valor bucle externo = ' || bucle1);
          dbms_output.put_line('---------------------');
          bucle2 := 0;
          LOOP
               dbms_output.put_line('valor bucle anidado = ' || bucle2);
               bucle2 := bucle2 + 1;
               EXIT WHEN bucle2 = 5;
          END LOOP;

          bucle1 := bucle1 + 1;
          EXIT WHEN bucle1 = 3;
     END LOOP;
END;
/
-- =========================================
-- EJEMPLO 15 (pokemon)
-- =========================================
SET SERVEROUTPUT ON;

DECLARE
     TYPE tipopokemon IS RECORD (
               nombre VARCHAR2(20),
               tipo   VARCHAR2(20),
               nivel  NUMBER
     );
     TYPE tipotablapokemon IS
          TABLE OF tipopokemon;
     mitablapokemon tipotablapokemon;
     i              NUMBER;
BEGIN
     mitablapokemon := tipotablapokemon();

  -- Insertar datos
     mitablapokemon.extend;
     mitablapokemon(1) := tipopokemon('Pikachu', 'Electrico', 25);
     mitablapokemon.extend;
     mitablapokemon(2) := tipopokemon('Charmander', 'Fuego', 15);
     mitablapokemon.extend;
     mitablapokemon(3) := tipopokemon('Squirtle', 'Agua', 18);

  -- Borrar elemento 2
     mitablapokemon.DELETE(2);

  -- Recorrer correctamente
     i := mitablapokemon.first;
     WHILE i IS NOT NULL LOOP
          dbms_output.put_line(mitablapokemon(i).nombre
                               || ' - '
                               || mitablapokemon(i).tipo
                               || ' - Nivel '
                               || mitablapokemon(i).nivel);

          i := mitablapokemon.next(i);
     END LOOP;

END;
/