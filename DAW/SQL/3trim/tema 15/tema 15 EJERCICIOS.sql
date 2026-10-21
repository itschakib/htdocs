-- =========================================
-- TEMA 15 EJERCICIOS COMPLETOS 
-- =========================================

SET SERVEROUTPUT ON;

-- =========================================
-- BLOQUE A
-- =========================================
BEGIN
    dbms_output.put_line('Hola, PL/SQL');
END;
/

BEGIN
    -- Comentarios
    /* Comentario múltiple */
    dbms_output.put_line('Hola, PL/SQL');
END;
/

DECLARE
    mensaje VARCHAR2(50) := 'Hola, PL/SQL';
BEGIN
    dbms_output.put_line(mensaje);
END;
/

-- =========================================
-- BLOQUE B
-- =========================================
DECLARE
    nombre VARCHAR2(20) := 'Juan';
    edad   NUMBER := 20;
BEGIN
    dbms_output.put_line('Me llamo ' || nombre || ' y tengo ' || edad || ' años');
END;
/

DECLARE
    a NUMBER := 10;
    b NUMBER := 5;
BEGIN
    dbms_output.put_line('Suma: ' || (a+b));
    dbms_output.put_line('Resta: ' || (a-b));
    dbms_output.put_line('Producto: ' || (a*b));
    dbms_output.put_line('Division: ' || (a/b));
END;
/

DECLARE
    IVA CONSTANT NUMBER := 0.21;
    precio NUMBER := 100;
BEGIN
    dbms_output.put_line('Total: ' || (precio + precio*IVA));
END;
/

-- =========================================
-- BLOQUE C
-- =========================================
BEGIN
    dbms_output.put_line(SYSDATE);
    dbms_output.put_line(TO_CHAR(SYSDATE,'DD/MM/YYYY HH24:MI'));
END;
/

BEGIN
    dbms_output.put_line(TO_NUMBER('150') + 50);
END;
/

DECLARE
    fecha DATE;
BEGIN
    fecha := TO_DATE('05/04/2026','DD/MM/YYYY');
    dbms_output.put_line(TO_CHAR(fecha,'DD-MM-YYYY'));
END;
/

DECLARE
    pass VARCHAR2(20) := 'abc123';
BEGIN
    dbms_output.put_line(LENGTH(pass));
END;
/

-- =========================================
-- BLOQUE D
-- =========================================
DECLARE
    producto VARCHAR2(20) := 'Teclado';
    precio NUMBER := 20;
    unidades NUMBER := 2;
    subtotal NUMBER;
    total NUMBER;
BEGIN
    subtotal := precio * unidades;
    total := subtotal * 1.21;

    dbms_output.put_line(producto);
    dbms_output.put_line('Total: ' || total);
END;
/

BEGIN
    dbms_output.put_line(TO_NUMBER('abc'));
EXCEPTION
    WHEN OTHERS THEN
        dbms_output.put_line('Error al convertir');
END;
/

-- =========================================
-- BLOQUE E
-- =========================================
DECLARE
    edad NUMBER := 17;
BEGIN
    IF edad >= 18 THEN
        dbms_output.put_line('Acceso permitido');
    ELSE
        dbms_output.put_line('Acceso denegado');
    END IF;
END;
/

DECLARE
    nota NUMBER := 8;
BEGIN
    IF nota < 5 THEN
        dbms_output.put_line('Suspenso');
    ELSIF nota < 7 THEN
        dbms_output.put_line('Aprobado');
    ELSIF nota < 9 THEN
        dbms_output.put_line('Notable');
    ELSE
        dbms_output.put_line('Sobresaliente');
    END IF;
END;
/

DECLARE
    total NUMBER := 200;
    descuento NUMBER;
BEGIN
    IF total > 200 THEN
        descuento := 0.15;
    ELSIF total > 100 THEN
        descuento := 0.10;
    ELSIF total > 50 THEN
        descuento := 0.05;
    ELSE
        descuento := 0;
    END IF;

    dbms_output.put_line('Final: ' || (total - total*descuento));
END;
/

-- =========================================
-- BLOQUE F
-- =========================================
DECLARE
    opcion NUMBER := 2;
BEGIN
    CASE opcion
        WHEN 1 THEN dbms_output.put_line('Alta');
        WHEN 2 THEN dbms_output.put_line('Baja');
        WHEN 3 THEN dbms_output.put_line('Consulta');
        ELSE dbms_output.put_line('Opcion invalida');
    END CASE;
END;
/

DECLARE
    estado NUMBER := 3;
BEGIN
    CASE estado
        WHEN 1 THEN dbms_output.put_line('Pendiente');
        WHEN 2 THEN dbms_output.put_line('Enviado');
        WHEN 3 THEN dbms_output.put_line('Entregado');
        WHEN 4 THEN dbms_output.put_line('Cancelado');
        ELSE dbms_output.put_line('Desconocido');
    END CASE;
END;
/

-- =========================================
-- BLOQUE G
-- =========================================
DECLARE
    i NUMBER := 1;
BEGIN
    WHILE i <= 10 LOOP
        dbms_output.put_line(i);
        i := i + 1;
    END LOOP;
END;
/

BEGIN
    FOR i IN 1..10 LOOP
        dbms_output.put_line('7 x ' || i || ' = ' || (7*i));
    END LOOP;
END;
/

DECLARE
    i NUMBER := 1;
BEGIN
    LOOP
        dbms_output.put_line(i);
        i := i + 1;
        EXIT WHEN i > 10;
    END LOOP;
END;
/

-- =========================================
-- BLOQUE H
-- =========================================
BEGIN
    FOR i IN 1..5 LOOP
        FOR j IN 1..10 LOOP
            dbms_output.put_line(i || ' x ' || j || ' = ' || (i*j));
        END LOOP;
    END LOOP;
END;
/

-- =========================================
-- CASO FINAL
-- =========================================
DECLARE
    xp NUMBER := 0;
    nivel VARCHAR2(20);
BEGIN
    FOR ronda IN 1..10 LOOP
        xp := xp + 50;

        IF xp < 100 THEN
            nivel := 'Nivel 1';
        ELSIF xp < 250 THEN
            nivel := 'Nivel 2';
        ELSIF xp < 500 THEN
            nivel := 'Nivel 3';
        ELSE
            nivel := 'Nivel MAX';
        END IF;

        dbms_output.put_line('Ronda ' || ronda ||
                             ' - XP: ' || xp ||
                             ' - Nivel: ' || nivel);
    END LOOP;
END;
/