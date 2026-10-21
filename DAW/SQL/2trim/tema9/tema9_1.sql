/* =========================================================
   TEMA 9 – SELECT BÁSICAS, WHERE y GROUP BY
   Esquema: HR (Oracle)
   Autor: ______________________
   ========================================================= */

------------------------------------------------------------
-- CONFIGURACIÓN INICIAL (opcional)
------------------------------------------------------------
SET LINESIZE 200;
SET PAGESIZE 100;

------------------------------------------------------------
-- SELECT BÁSICAS
------------------------------------------------------------

-- 1. Estructura de la tabla DEPARTMENTS
DESCRIBE departments;

-- 2. Estructura de la tabla EMPLOYEES
DESCRIBE employees;

-- 3. Listar todos los registros de employees
SELECT * FROM employees;

-- 4. Listar todos los registros de departments
SELECT * FROM departments;

-- 5. Alias descriptivos en employees
SELECT employee_id AS "ID Empleado",
       first_name AS "Nombre",
       job_id AS "Trabajo",
       hire_date AS "Fecha Contrato"
FROM employees;

-- 6. Listar first_name, last_name, salary y commission
SELECT first_name, last_name, salary, commission_pct
FROM employees;

-- 7. Concatenar salario con nombre
SELECT first_name || ' ' || last_name || ' - Salario: ' || salary AS info_empleado
FROM employees;

-- 8. country_id y country_name
SELECT country_id, country_name
FROM countries;

-- 9. department_id sin registros repetidos
SELECT DISTINCT department_id
FROM departments;

-- 10. job_history + días contratado
SELECT employee_id,
       job_id,
       start_date,
       end_date,
       (end_date - start_date) AS dias_contratado
FROM job_history;

-- 11. Sueldo anual
SELECT employee_id,
       last_name,
       salary * 12 AS sueldo_anual
FROM employees;

-- 12. Nombre y job_id en una sola columna
SELECT first_name || ' ' || last_name || ' - ' || job_id
       AS "Nombre y Código de trabajo"
FROM employees;

------------------------------------------------------------
-- SELECT CON WHERE
------------------------------------------------------------

-- 1. Empleados que ganan más de 12000
SELECT last_name, salary
FROM employees
WHERE salary > 12000;

-- 2. Salarios fuera del rango 5000 a 12000
SELECT last_name, salary
FROM employees
WHERE salary NOT BETWEEN 5000 AND 12000;

-- 3. Departamentos 20 o 50 ordenados por apellido
SELECT last_name, department_id
FROM employees
WHERE department_id IN (20, 50)
ORDER BY last_name ASC;

-- 4. Empleados contratados en 2004
SELECT last_name, hire_date
FROM employees
WHERE EXTRACT(YEAR FROM hire_date) = 2004;

-- 5. Empleados con comisión (orden descendente)
SELECT last_name, salary, commission_pct
FROM employees
WHERE commission_pct IS NOT NULL
ORDER BY salary DESC, commission_pct DESC;

-- 6. Apellidos que contienen 'a' y 'e'
SELECT last_name
FROM employees
WHERE LOWER(last_name) LIKE '%a%'
  AND LOWER(last_name) LIKE '%e%';

-- 7. Empleados con comisión del 20%
SELECT last_name, salary, commission_pct
FROM employees
WHERE commission_pct = 0.20;

-- 8. IT_PROG o SA_MAN
SELECT first_name, hire_date
FROM employees
WHERE job_id IN ('IT_PROG', 'SA_MAN');

-- 9. Empleados con id 150 o 160
SELECT *
FROM employees
WHERE employee_id IN (150, 160);

-- 10. Jobs: diferencia salario mínimo y máximo
SELECT job_title,
       (max_salary - min_salary) AS diferencia_salario
FROM jobs
WHERE max_salary BETWEEN 10000 AND 20000;

-- 11. Nombre completo que empiece por A
SELECT first_name || ' ' || last_name AS nombre_completo
FROM employees
WHERE first_name LIKE 'A%'
   OR last_name LIKE 'A%';

-- 12. Commission nula + salario 5000–10000 + dept 30
SELECT *
FROM employees
WHERE commission_pct IS NULL
  AND salary BETWEEN 5000 AND 10000
  AND department_id = 30;

------------------------------------------------------------
-- GROUP BY
------------------------------------------------------------

-- 1. Contar todos los empleados
SELECT COUNT(*) AS total_empleados
FROM employees;

-- 2. Salario máximo de la empresa
SELECT MAX(salary) AS salario_maximo
FROM employees;

-- 3. Salario mínimo de los SA_REP
SELECT MIN(salary) AS salario_minimo
FROM employees
WHERE job_id = 'SA_REP';

-- 4. Empleados del departamento 80 con comisión
SELECT COUNT(commission_pct) AS empleados_con_comision
FROM employees
WHERE department_id = 80;

-- 5. Salario medio por departamento
SELECT department_id,
       AVG(salary) AS salario_medio
FROM employees
GROUP BY department_id;

-- 6. Número de empleados por departamento
SELECT department_id,
       COUNT(*) AS total_empleados
FROM employees
GROUP BY department_id;

-- 7. Suma de salarios por departamento > 8000
SELECT department_id,
       SUM(salary) AS suma_salarios
FROM employees
GROUP BY department_id
HAVING SUM(salary) > 8000;

------------------------------------------------------------
-- FIN DEL SCRIPT
------------------------------------------------------------
