--------------------------------------------------------
-- SELECT BÁSICAS
--------------------------------------------------------
-- 1. Determinar la estructura de la tabla DEPARTMENTS. [cite: 56]
DESCRIBE departments;

-- 2. Determinar la estructura de la tabla EMPLOYEES. [cite: 57]
DESCRIBE employees;

-- 3. Listar todos los registros de employees. [cite: 58]
SELECT * FROM employees;

-- 4. Listar todos los registros de departments. [cite: 59]
SELECT * FROM departments;

-- 5. Nombrar con alias las cabeceras. [cite: 60, 61]
SELECT employee_id AS "Identificador", 
       first_name AS "Nombre", 
       job_id AS "Puesto", 
       hire_date AS "Fecha de Contratacion" 
FROM employees;

-- 6. Listar first_name, last_name, salary, commission (en HR se llama commission_pct). [cite: 62]
SELECT first_name, last_name, salary, commission_pct 
FROM employees;

-- 7. Listar el salario concatenado con el nombre. [cite: 63]
SELECT first_name || ' ' || last_name || ' gana: ' || salary AS "Empleado y Salario" 
FROM employees;

-- 8. Listar de countries las columnas country_id y country_name. [cite: 64]
SELECT country_id, country_name 
FROM countries;

-- 9. Listar id de departamentos sin repetir. [cite: 65]
SELECT DISTINCT department_id 
FROM departments;

-- 10. job_history y calcular dias_contratado. [cite: 66]
SELECT employee_id, job_id, end_date, start_date, 
       (end_date - start_date) AS dias_contratado 
FROM job_history;

-- 11. Mostrar id, apellido y sueldo anual. [cite: 67]
SELECT employee_id, last_name, (salary * 12) AS sueldo_anual 
FROM employees;

-- 12. Concatenar nombre y job_id. [cite: 68, 69]
SELECT first_name || ' - ' || job_id AS "Nombre y Código de trabajo" 
FROM employees;

--------------------------------------------------------
-- SELECT CON WHERE
--------------------------------------------------------
-- 1. Apellido y salario > 12000. [cite: 72]
SELECT last_name, salary 
FROM employees 
WHERE salary > 12000;

-- 2. Salario no en el rango de 5000 a 12000. [cite: 73]
SELECT last_name, salary 
FROM employees 
WHERE salary NOT BETWEEN 5000 AND 12000;

-- 3. Departamentos 20 o 50 en orden alfabético. [cite: 74]
SELECT last_name, department_id 
FROM employees 
WHERE department_id IN (20, 50) 
ORDER BY first_name ASC;

-- 4. Contratados en 2004. [cite: 75]
SELECT last_name, hire_date 
FROM employees 
WHERE TO_CHAR(hire_date, 'YYYY') = '2004';

-- 5. Que ganan comisiones, orden descendente. [cite: 76, 77]
SELECT last_name, salary, commission_pct 
FROM employees 
WHERE commission_pct IS NOT NULL 
ORDER BY salary DESC, commission_pct DESC;

-- 6. Apellidos con "a" y "e". [cite: 78]
SELECT last_name 
FROM employees 
WHERE LOWER(last_name) LIKE '%a%' 
  AND LOWER(last_name) LIKE '%e%';

-- 7. Comisión del 20%. [cite: 79]
SELECT last_name, salary, commission_pct 
FROM employees 
WHERE commission_pct = 0.2;

-- 8. IT Programmer (IT_PROG) o Sales Man (SA_MAN). [cite: 80]
SELECT first_name, hire_date 
FROM employees 
WHERE job_id IN ('IT_PROG', 'SA_MAN');

-- 9. Empleados con id 150 o 160. [cite: 81]
SELECT * FROM employees 
WHERE employee_id IN (150, 160);

-- 10. Diferencia salarial con max_salary entre 10000 y 20000. [cite: 82]
SELECT job_title, (max_salary - min_salary) AS diferencia_salarial 
FROM jobs 
WHERE max_salary BETWEEN 10000 AND 20000;

-- 11. first_name o last_name comience con A. [cite: 83]
SELECT first_name || ' ' || last_name AS "Nombre Completo" 
FROM employees 
WHERE first_name LIKE 'A%' OR last_name LIKE 'A%';

-- 12. commission nula, salario 5000-10000, dep 30. [cite: 84]
SELECT * FROM employees 
WHERE commission_pct IS NULL 
  AND salary BETWEEN 5000 AND 10000 
  AND department_id = 30;

--------------------------------------------------------
-- GROUP BY
--------------------------------------------------------
-- 1. Contar todos los empleados. [cite: 86]
SELECT COUNT(*) AS total_empleados 
FROM employees;

-- 2. Salario máximo. [cite: 88]
SELECT MAX(salary) AS salario_maximo 
FROM employees;

-- 3. Salario mínimo para SA_REP. [cite: 89]
SELECT MIN(salary) AS salario_minimo 
FROM employees 
WHERE job_id = 'SA_REP';

-- 4. Contar empleados dep 80 con comisión. [cite: 90]
SELECT COUNT(commission_pct) AS empleados_con_comision 
FROM employees 
WHERE department_id = 80;

-- 5. Salario medio por departamento. [cite: 91]
SELECT department_id, AVG(salary) AS salario_medio 
FROM employees 
GROUP BY department_id;

-- 6. Contar empleados por departamento. [cite: 92]
SELECT department_id, COUNT(*) AS total_empleados 
FROM employees 
GROUP BY department_id;

-- 7. Suma de salarios por departamento > 8000. [cite: 93]
SELECT department_id, SUM(salary) AS suma_salarios 
FROM employees 
GROUP BY department_id 
HAVING SUM(salary) > 8000;