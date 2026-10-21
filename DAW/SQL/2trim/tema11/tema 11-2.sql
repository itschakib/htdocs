/* =========================================================
   EJERCICIOS JOIN [cite: 1137]
   ========================================================= */

-- 1. Seleccionar todos los nombres de empleados con su nombre de departamento para todos los empleados. [cite: 1138]
SELECT e.first_name, d.department_name
FROM employees e
JOIN departments d ON e.department_id = d.department_id;

-- 2. Seleccionar el id empleado, el apellido de empleado, su salario y el nombre de departamento para todos los empleados [cite: 1139]
SELECT e.employee_id, e.last_name, e.salary, d.department_name
FROM employees e
JOIN departments d ON e.department_id = d.department_id;

-- 3. Seleccionar los nombres de region (continente) de la tabla regions y los nombres de paises (countries) [cite: 1140]
SELECT r.region_name, c.country_name
FROM regions r
JOIN countries c ON r.region_id = c.region_id;

-- 4. Seleccionar el nombre del país y la ciudad (en tabla locations) [cite: 1141]
SELECT c.country_name, l.city
FROM countries c
JOIN locations l ON c.country_id = l.country_id;

-- 5. Seleccionar los nombres de departamentos y la ciudad (tabla locations) en la que están situados. [cite: 1142]
SELECT d.department_name, l.city
FROM departments d
JOIN locations l ON d.location_id = l.location_id;

-- 6. Seleccionar los nombre de trabajos (job_title) y los nombres de empleados para todos los empleados [cite: 1143]
SELECT j.job_title, e.first_name
FROM jobs j
JOIN employees e ON j.job_id = e.job_id;

-- 7. Seleccionar los nombre de trabajos y los nombres de empleados para todos los empleados cuyo nombre comience por A [cite: 1144]
SELECT j.job_title, e.first_name
FROM jobs j
JOIN employees e ON j.job_id = e.job_id
WHERE e.first_name LIKE 'A%';


/* =========================================================
   EJERCICIOS OUTER JOIN [cite: 1145]
   ========================================================= */

-- 1. Mostrar apellido, salario, nombre de departamento de todos los empleados tengan o no departmento [cite: 1146]
-- (Usamos LEFT JOIN asegurando que salgan todos los empleados)
SELECT e.last_name, e.salary, d.department_name
FROM employees e
LEFT JOIN departments d ON e.department_id = d.department_id;

-- 2. Mostrar apellido, salario y nombre de departamento de todos los departamentos tengan o no empleados [cite: 1147]
-- (Usamos RIGHT JOIN asegurando que salgan todos los departamentos, o LEFT JOIN invirtiendo el orden)
SELECT e.last_name, e.salary, d.department_name
FROM employees e
RIGHT JOIN departments d ON e.department_id = d.department_id;

-- 3. Mostrar ciudad y nombre de departamento para todas las localidades (locations) tengan o no departamentos [cite: 1148]
SELECT l.city, d.department_name
FROM locations l
LEFT JOIN departments d ON l.location_id = d.location_id;


/* =========================================================
   EJERCICIOS SUBCONSULTAS CON USUARIO HR [cite: 1149]
   ========================================================= */

-- 1. Selecciona las columnas de los empleados que tienen el mismo id de departamento que Marketing [cite: 1150]
SELECT * FROM employees 
WHERE department_id = (SELECT department_id 
                       FROM departments 
                       WHERE department_name = 'Marketing');

-- 2. Selecciona los empleados cuyo salario sea inferior al salario medio (avg(salary) de todos los empleados). [cite: 1151]
SELECT * FROM employees 
WHERE salary < (SELECT AVG(salary) 
                FROM employees);

-- 3. Selecciona nombre de los países que están en el mismo continente(regions) que Argentina [cite: 1152]
SELECT country_name 
FROM countries 
WHERE region_id = (SELECT region_id 
                   FROM countries 
                   WHERE country_name = 'Argentina');

-- 4. Selecciona los empleados cuyo salario sea inferior al salario medio de los empleados que son representantes de ventas.(job_id=’SA_MAN’) [cite: 1153, 1154]
SELECT * FROM employees 
WHERE salary < (SELECT AVG(salary) 
                FROM employees 
                WHERE job_id = 'SA_MAN');

-- 5. Obtener todos los empleados con el mismo oficio(job_id) cuyo empleado su nombre sea David y apellido Austin [cite: 1155]
SELECT * FROM employees 
WHERE job_id = (SELECT job_id 
                FROM employees 
                WHERE first_name = 'David' AND last_name = 'Austin');

-- 6. Obtener los datos de los empleados que ganan más que todos los empleados del departamento 30. [cite: 1156, 1157]
-- (Usamos el operador ALL para comparar con todos los resultados de la subconsulta)
SELECT * FROM employees 
WHERE salary > ALL (SELECT salary 
                    FROM employees 
                    WHERE department_id = 30);