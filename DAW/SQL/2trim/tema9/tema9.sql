/* =========================================================
   TEMA 9 – DML / SELECT
   MODELO REAL ALUMNOS UMA
   Oracle SQL
   ========================================================= */

/* =========================================================
   1. Nombre y dos apellidos de los profesores del departamento 1
   ========================================================= */
SELECT
    nombre,
    apellido1,
    apellido2
FROM
    profesores
WHERE
    departamento = 1;

/* =========================================================
   2. Profesores de todos los departamentos excepto el 3
   ========================================================= */
SELECT
    nombre,
    apellido1,
    apellido2
FROM
    profesores
WHERE
    departamento <> 3;

/* =========================================================
   3. Profesores cuyo correo está en el servidor lcc.uma.es
   ========================================================= */
SELECT
    nombre,
    apellido1,
    apellido2
FROM
    profesores
WHERE
    email LIKE '%@lcc.uma.es';

/* =========================================================
   4. Profesores que ingresaron antes de 1990
   (ANTIGUEDAD = fecha de ingreso)
   ========================================================= */
SELECT
    nombre,
    apellido1,
    apellido2
FROM
    profesores
WHERE
    antiguedad < TO_DATE('01/01/1990', 'DD/MM/YYYY');

/* =========================================================
   5. Profesores que tienen menos de 30 años
   ========================================================= */
SELECT
    nombre,
    apellido1,
    apellido2
FROM
    profesores
WHERE
    months_between(sysdate, fecha_nacimiento) / 12 < 30;

/* =========================================================
   6. Profesores con más de 3 trienios
      - Nombre y apellidos en mayúsculas
      - Trienios = años / 3 (TRUNC)
   ========================================================= */
SELECT
    upper(nombre)                                       AS nombre,
    upper(apellido1)                                    AS apellido1,
    upper(apellido2)                                    AS apellido2,
    trunc(months_between(sysdate, antiguedad) / 12 / 3) AS trienios
FROM
    profesores
WHERE
    trunc(months_between(sysdate, antiguedad) / 12 / 3) > 3;

/* =========================================================
   7. Lista de alumnos que no disponen de correo electrónico
   ========================================================= */
SELECT
    *
FROM
    alumnos
WHERE
    email IS NULL;

/* =========================================================
   8. Mensaje: "El alumno ... no dispone de correo"
   ========================================================= */
SELECT
    'El alumno '
    || nombre
    || ' '
    || apellido1
    || ' '
    || apellido2
    || ' no dispone de correo' AS mensaje
FROM
    alumnos
WHERE
    email IS NULL;

/* =========================================================
   9. Notas de la asignatura 112
      - Código del alumno y nota
      - Ordenado por alumno
   ========================================================= */
SELECT
    alumno,
    calificacion
FROM
    matricular
WHERE
    asignatura = '112'
ORDER BY
    alumno;

/* =========================================================
   10. Asignaturas que contienen "Bases de Datos"
       - Cambiar por "Almacenes de Datos"
   ========================================================= */
SELECT
    replace(nombre, 'Bases de Datos', 'Almacenes de Datos') AS nombre_asignatura
FROM
    asignaturas
WHERE
    nombre LIKE '%Bases de Datos%';

/* =========================================================
   11. Asignaturas obligatorias y optativas
       - Créditos
       - Si son NULL → "NO ASIGNADO"
   ========================================================= */
SELECT
    nombre,
    nvl(
        to_char(creditos),
        'NO ASIGNADO'
    ) AS creditos
FROM
    asignaturas
WHERE
    caracter LIKE 'O%';

/* =========================================================
   12. Asignaturas de tercero
       - Créditos totales
       - Teóricos y prácticos
   ========================================================= */
SELECT
    nombre,
    creditos,
    teoricos,
    practicos
FROM
    asignaturas
WHERE
    curso = 3;

/* =========================================================
   13. Alumnos matriculados en las primeras 2 horas
   - Primer lunes de septiembre a las 09:00
   ========================================================= */
SELECT
    nombre,
    apellido1,
    apellido2
FROM
    alumnos
WHERE
    fecha_prim_matricula BETWEEN next_day(TO_DATE('01/09/'
                                                  || EXTRACT(YEAR FROM fecha_prim_matricula),
         'DD/MM/YYYY') - 1,
                                          'MONDAY') AND next_day(TO_DATE('01/09/'
                                                                         || EXTRACT(YEAR FROM fecha_prim_matricula),
         'DD/MM/YYYY') - 1,
                                                                 'MONDAY') + INTERVAL '2' HOUR;

/* =========================================================
   14. Alumnos matriculados hace menos de 2 meses
   ========================================================= */
SELECT
    nombre,
    apellido1,
    apellido2
FROM
    alumnos
WHERE
    months_between(sysdate, fecha_prim_matricula) < 2;

/* =========================================================
   15. Alumnos que entraron en la universidad con menos de 18 años
   ========================================================= */
SELECT
    nombre,
    apellido1,
    apellido2
FROM
    alumnos
WHERE
    months_between(fecha_prim_matricula, fecha_nacimiento) / 12 < 18;

/* =========================================================
   CONSULTAS COMPLEMENTARIAS
   ========================================================= */

/* =========================================================
   16. Alumnos que se matricularon un lunes
   ========================================================= */
SELECT
    nombre,
    apellido1,
    apellido2
FROM
    alumnos
WHERE
    to_char(fecha_prim_matricula, 'DAY') = 'LUNES';

/* =========================================================
   17. Alumnos cuyo cumpleaños el próximo año cae en martes
   ========================================================= */
SELECT
    nombre,
    apellido1,
    apellido2
FROM
    alumnos
WHERE
    to_char(
        add_months(fecha_nacimiento, 12),
        'DAY'
    ) = 'MARTES';

/* =========================================================
   18. Alumnos que cumplen años esta misma semana
   ========================================================= */
SELECT
    nombre,
    apellido1,
    apellido2
FROM
    alumnos
WHERE
    to_char(fecha_nacimiento, 'IW') = to_char(sysdate, 'IW');

/* =========================================================
   19. Profesores con menos de 25 años de servicio al jubilarse
       (jubilación a los 65 años)
   ========================================================= */
SELECT
    nombre,
    apellido1,
    apellido2
FROM
    profesores
WHERE
    months_between(
        add_months(fecha_nacimiento, 65 * 12),
        antiguedad
    ) / 12 < 25;

/* =========================================================
   20. Profesores a los que les faltan solo 6 meses
       para alcanzar los 25 años de servicio
   ========================================================= */
SELECT
    nombre,
    apellido1,
    apellido2
FROM
    profesores
WHERE
    abs(months_between(
        add_months(fecha_nacimiento, 65 * 12),
        antiguedad
    ) / 12 - 25) <= 0.5;

/* =========================================================
   21. Para cada asignatura:
       - Nombre
       - Curso
       - Créditos totales
       - Mayor entre teóricos y prácticos
   ========================================================= */
SELECT
    nombre,
    curso,
    creditos,
    greatest(teoricos, practicos) AS mayor_credito
FROM
    asignaturas;
