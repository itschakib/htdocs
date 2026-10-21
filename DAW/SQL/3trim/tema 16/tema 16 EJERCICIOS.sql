/* =========================================================
   BLOQUE 1 - NIVEL FÁCIL (POKEMON PL/SQL)
   ========================================================= */

SET SERVEROUTPUT ON;

/* -------------------------------
1. REGISTRO BÁSICO
---------------------------------*/
/*
Enunciado:
Crea un registro tipo_pokemon con:
nombre, tipo, evolucion, esLegendario
Muestra Pikachu
*/

DECLARE
  TYPE tipo_pokemon IS RECORD (
    nombre VARCHAR2(50),
    tipo VARCHAR2(30),
    evolucion VARCHAR2(50),
    esLegendario BOOLEAN
  );

  v_pokemon tipo_pokemon;

BEGIN
  v_pokemon.nombre := 'Pikachu';
  v_pokemon.tipo := 'Electrico';
  v_pokemon.evolucion := 'Raichu';
  v_pokemon.esLegendario := FALSE;

  DBMS_OUTPUT.PUT_LINE('--- EJ1 ---');
  DBMS_OUTPUT.PUT_LINE(v_pokemon.nombre);
  DBMS_OUTPUT.PUT_LINE(v_pokemon.tipo);
END;
/

/* -------------------------------
2. VARRAY POKEBOLA
---------------------------------*/
/*
Enunciado:
VARRAY(10) con 4 pokemons y mostrar primero, ultimo y limite
*/

DECLARE
  TYPE pokebola_t IS VARRAY(10) OF VARCHAR2(50);
  miPokebola pokebola_t := pokebola_t();
BEGIN
  miPokebola.EXTEND(4);

  miPokebola(1) := 'Pikachu';
  miPokebola(2) := 'Charizard';
  miPokebola(3) := 'Bulbasaur';
  miPokebola(4) := 'Mewtwo';

  DBMS_OUTPUT.PUT_LINE('--- EJ2 ---');
  DBMS_OUTPUT.PUT_LINE('Primero: ' || miPokebola.FIRST);
  DBMS_OUTPUT.PUT_LINE('Ultimo: ' || miPokebola.LAST);
  DBMS_OUTPUT.PUT_LINE('Max: ' || miPokebola.LIMIT);
END;
/

/* -------------------------------
3. FOR RECORRIENDO VARRAY
---------------------------------*/
/*
Enunciado:
Recorrer con FOR
*/

DECLARE
  TYPE pokebola_t IS VARRAY(10) OF VARCHAR2(50);
  miPokebola pokebola_t := pokebola_t();
BEGIN
  miPokebola.EXTEND(4);

  miPokebola(1) := 'Pikachu';
  miPokebola(2) := 'Charizard';
  miPokebola(3) := 'Bulbasaur';
  miPokebola(4) := 'Mewtwo';

  DBMS_OUTPUT.PUT_LINE('--- EJ3 ---');

  FOR i IN 1 .. miPokebola.COUNT LOOP
    DBMS_OUTPUT.PUT_LINE(miPokebola(i));
  END LOOP;
END;
/

/* -------------------------------
4. WHILE + LEGENDARIO
---------------------------------*/
/*
Enunciado:
Recorrer con WHILE y avisar si es legendario
*/

DECLARE
  TYPE pokebola_t IS VARRAY(10) OF VARCHAR2(50);
  miPokebola pokebola_t := pokebola_t();

  i NUMBER;
BEGIN
  miPokebola.EXTEND(4);

  miPokebola(1) := 'Pikachu';
  miPokebola(2) := 'Charizard';
  miPokebola(3) := 'Bulbasaur';
  miPokebola(4) := 'Mewtwo';

  i := 1;

  DBMS_OUTPUT.PUT_LINE('--- EJ4 ---');

  WHILE i <= miPokebola.COUNT LOOP
    DBMS_OUTPUT.PUT_LINE(miPokebola(i));

    IF miPokebola(i) = 'Mewtwo' THEN
      DBMS_OUTPUT.PUT_LINE('*** LEGENDARIO ***');
    END IF;

    i := i + 1;
  END LOOP;
END;
/

/* -------------------------------
5. GLOSARIO POKEMON (ASSOCIATIVE ARRAY)
---------------------------------*/
/*
Enunciado:
Clave = nombre, valor = descripcion
*/

DECLARE
  TYPE glosario_t IS TABLE OF VARCHAR2(100) INDEX BY VARCHAR2(50);
  glosarioPokemon glosario_t;
  clave VARCHAR2(50);
BEGIN
  glosarioPokemon('Pikachu') := 'Electrico';
  glosarioPokemon('Charizard') := 'Fuego';
  glosarioPokemon('Bulbasaur') := 'Planta';
  glosarioPokemon('Mewtwo') := 'Legendario';

  clave := glosarioPokemon.FIRST;

  DBMS_OUTPUT.PUT_LINE('--- EJ5 ---');

  WHILE clave IS NOT NULL LOOP
    DBMS_OUTPUT.PUT_LINE(clave || ' -> ' || glosarioPokemon(clave));
    clave := glosarioPokemon.NEXT(clave);
  END LOOP;
END;
/

/* -------------------------------
6. AGENDA ENTRENADORES
---------------------------------*/
/*
Enunciado:
Array asociativo con telefonos + DELETE
*/

DECLARE
  TYPE tel_t IS TABLE OF VARCHAR2(20) INDEX BY VARCHAR2(50);
  telefonos tel_t;
  clave VARCHAR2(50);
BEGIN
  telefonos('Ash') := '6001';
  telefonos('Misty') := '6002';
  telefonos('Brock') := '6003';
  telefonos('Gary') := '6004';
  telefonos('Serena') := '6005';

  telefonos.DELETE('Gary');

  clave := telefonos.FIRST;

  DBMS_OUTPUT.PUT_LINE('--- EJ6 ---');

  WHILE clave IS NOT NULL LOOP
    DBMS_OUTPUT.PUT_LINE(clave || ' -> ' || telefonos(clave));
    clave := telefonos.NEXT(clave);
  END LOOP;
END;
/

/* -------------------------------
7. POKEDEX (REGISTROS + ARRAY)
---------------------------------*/
/*
Enunciado:
Array asociativo de registros
*/

DECLARE
  TYPE tipo_pokemon IS RECORD (
    nombre VARCHAR2(50),
    nivel NUMBER,
    esLegendario BOOLEAN
  );

  TYPE pokedex_t IS TABLE OF tipo_pokemon INDEX BY VARCHAR2(50);
  pokedex pokedex_t;

  clave VARCHAR2(50);
BEGIN
  pokedex('Pikachu').nombre := 'Pikachu';
  pokedex('Pikachu').nivel := 25;
  pokedex('Pikachu').esLegendario := FALSE;

  pokedex('Mewtwo').nombre := 'Mewtwo';
  pokedex('Mewtwo').nivel := 100;
  pokedex('Mewtwo').esLegendario := TRUE;

  clave := pokedex.FIRST;

  DBMS_OUTPUT.PUT_LINE('--- EJ7 ---');

  WHILE clave IS NOT NULL LOOP
    DBMS_OUTPUT.PUT_LINE(pokedex(clave).nombre);

    IF pokedex(clave).esLegendario THEN
      DBMS_OUTPUT.PUT_LINE('*** LEGENDARIO ***');
    END IF;

    clave := pokedex.NEXT(clave);
  END LOOP;
END;
/

/* -------------------------------
8. SOBRESCRIBIR CLAVE
---------------------------------*/
/*
Enunciado:
Ver que se sobrescribe, no se duplica
*/

DECLARE
  TYPE puntos_t IS TABLE OF NUMBER INDEX BY VARCHAR2(50);
  puntos puntos_t;
  clave VARCHAR2(50);
BEGIN
  puntos('Ash') := 100;
  puntos('Misty') := 80;
  puntos('Brock') := 90;
  puntos('Gary') := 120;

  puntos('Ash') := 999;

  clave := puntos.FIRST;

  DBMS_OUTPUT.PUT_LINE('--- EJ8 ---');

  WHILE clave IS NOT NULL LOOP
    DBMS_OUTPUT.PUT_LINE(clave || ' -> ' || puntos(clave));
    clave := puntos.NEXT(clave);
  END LOOP;
END;
/