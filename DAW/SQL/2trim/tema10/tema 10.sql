--ejercicio 1
-- 4 al 8: Estructuras
DESCRIBE departments;
DESCRIBE employees;
DESCRIBE countries;
DESCRIBE locations;
DESCRIBE jobs;

-- 9 al 12: Listar todos los registros
SELECT * FROM employees;
SELECT * FROM departments;
SELECT * FROM jobs;
SELECT * FROM locations;

-- 13: Alias
SELECT employee_id AS "Emp_id", first_name AS "Employee", job_id AS "Job", hire_date AS "Hire Date" FROM employees;

-- 14: Concatenación
SELECT last_name || '-' || job_id AS "Employee and Title" FROM employees;

-- 15 al 19: Selecciones específicas y Alias
SELECT first_name, last_name, salary, commission_pct FROM employees;
SELECT employee_id AS "ID of the employee", last_name AS "Name of the employee", department_id AS "department ID" FROM employees;
SELECT first_name, salary FROM employees;
SELECT country_id, country_name FROM countries;
SELECT * FROM regions;

-- 20 al 23: Job History, DISTINCT y cálculos de días
SELECT employee_id AS empleado, start_date AS fecha_inicio, end_date AS fecha_fin FROM job_history;
SELECT DISTINCT department_id FROM departments;
SELECT DISTINCT job_id FROM jobs;
SELECT employee_id, job_id, start_date, end_date, (end_date - start_date) AS dias_contratado FROM job_history;

-- 24 al 26: Tabla DUAL y sueldo anual
SELECT * FROM dual;
SELECT (5*2)+10 AS Calculo FROM dual;
SELECT last_name, (salary * 12) AS sueldo_anual FROM employees;

-- 27 al 30: Valores únicos y concatenación masiva
SELECT DISTINCT job_id FROM employees;
SELECT first_name || ' - ' || job_id AS "Nombre y Codigo de trabajo" FROM employees;
SELECT employee_id || ',' || first_name || ',' || last_name || ',' || email || ',' || phone_number || ',' || hire_date || ',' || job_id || ',' || salary || ',' || commission_pct || ',' || manager_id || ',' || department_id AS "Todos los campos empleados" FROM employees;
SELECT department_id || ',' || department_name || ',' || manager_id || ',' || location_id AS "Todos los campos departamentos" FROM departments;



--ejercicio 2


-- 1 al 4: Filtros básicos
SELECT last_name, salary FROM employees WHERE salary > 12000;
SELECT last_name, department_id FROM employees WHERE employee_id = 176;
SELECT last_name, salary FROM employees WHERE salary NOT BETWEEN 5000 AND 12000;
SELECT last_name, job_id, hire_date FROM employees WHERE last_name IN ('Matos', 'Taylor');

-- 5 al 9: Ordenación, fechas y nulos
SELECT last_name, department_id FROM employees WHERE department_id IN (20, 50) ORDER BY first_name ASC;
SELECT last_name, salary FROM employees WHERE salary BETWEEN 5000 AND 12000 AND department_id IN (20, 50);
SELECT last_name, hire_date FROM employees WHERE TO_CHAR(hire_date, 'YYYY') = '1994';
SELECT last_name, job_id FROM employees WHERE manager_id IS NULL;
SELECT last_name, salary, commission_pct FROM employees WHERE commission_pct IS NOT NULL ORDER BY salary DESC, commission_pct DESC;

-- 10 y 11: Variables de sustitución (&)
SELECT last_name, salary FROM employees WHERE salary > &cantidad_minima;
SELECT employee_id, last_name, salary, department_id FROM employees WHERE manager_id = &manager_id ORDER BY &columna_orden;

-- 12 al 15: Cadenas de texto (LIKE) y lógicas
SELECT last_name FROM employees WHERE last_name LIKE '__a%';
SELECT last_name FROM employees WHERE LOWER(last_name) LIKE '%a%' AND LOWER(last_name) LIKE '%e%';
SELECT last_name, job_id, salary FROM employees WHERE job_id IN ('SA_REP', 'ST_CLERK') AND salary NOT IN (2500, 3500, 7000);
SELECT last_name, salary, commission_pct FROM employees WHERE commission_pct = 0.20;

-- 16 al 25: Más filtros y cálculos al vuelo
SELECT * FROM jobs WHERE min_salary > 10000;
SELECT first_name, hire_date FROM employees WHERE job_id IN ('IT_PROG', 'SA_MAN');
SELECT * FROM employees WHERE hire_date > TO_DATE('01/01/2008', 'DD/MM/YYYY');
SELECT * FROM employees WHERE employee_id IN (150, 160);
SELECT first_name, salary, commission_pct, hire_date FROM employees WHERE salary < 10000;
SELECT job_title, (max_salary - min_salary) AS diferencia FROM jobs WHERE max_salary BETWEEN 10000 AND 20000;
SELECT * FROM jobs ORDER BY job_title DESC;
SELECT first_name || ' ' || last_name AS "Nombre Completo" FROM employees WHERE first_name LIKE 'A%' OR last_name LIKE 'A%';
SELECT * FROM departments WHERE LOWER(department_name) LIKE '%m%';
SELECT * FROM employees WHERE commission_pct IS NULL AND salary BETWEEN 5000 AND 10000 AND department_id = 30;

--ejercicio 3

-- 1 al 4: Fechas y matemáticas
SELECT SYSDATE AS "Fecha" FROM dual;
SELECT employee_id, last_name, salary, ROUND(salary * 1.105) AS "Nuevo salario" FROM employees;
SELECT employee_id, last_name, salary, ROUND(salary * 1.16) AS "Nuevo salario" FROM employees;
SELECT employee_id, last_name, salary, ROUND(salary * 1.16) AS "Nuevo salario", (ROUND(salary * 1.16) - salary) AS "Incremento" FROM employees;

-- 5 al 7: Manejo de strings y fechas
SELECT INITCAP(last_name) AS "Apellido", LENGTH(last_name) AS "Longitud" FROM employees WHERE first_name LIKE 'J%' OR first_name LIKE 'A%' OR first_name LIKE 'M%' ORDER BY last_name;
SELECT last_name, ROUND(MONTHS_BETWEEN(SYSDATE, hire_date)) AS "Meses Trabajados" FROM employees ORDER BY "Meses Trabajados";
SELECT INITCAP(last_name) AS "Apellido", LENGTH(last_name) AS "Longitud" FROM employees WHERE last_name LIKE '&letra_mayuscula%';

-- 8 al 10: Formateo de texto visual
SELECT last_name, LPAD(salary, 15, '€') AS "SALARIO" FROM employees;
SELECT SUBSTR(last_name, 1, 8) || ' ' || LPAD(' ', TRUNC(salary/1000) + 1, '*') AS "EMPLEADOS_Y_SALARIOS" FROM employees ORDER BY salary DESC;
SELECT last_name, TRUNC((SYSDATE - hire_date) / 7) AS "TRABAJADAS" FROM employees WHERE department_id = 90 ORDER BY "TRABAJADAS" DESC;


--ejercicio 4

-- 1: Formato financiero
SELECT last_name || ' gana ' || TO_CHAR(salary, '$99,999.00') || ' mensual pero quiere ' || TO_CHAR(salary * 3, '$99,999.00') AS "Salario Ideal" FROM employees;

-- 2 y 3: Días específicos de la semana
SELECT last_name, hire_date, TO_CHAR(NEXT_DAY(ADD_MONTHS(hire_date, 6), 'LUNES'), 'fmDay", el "dd" de "Month" de "YYYY', 'NLS_DATE_LANGUAGE = SPANISH') AS "REVISION" FROM employees;
SELECT last_name, hire_date, TO_CHAR(hire_date, 'Day', 'NLS_DATE_LANGUAGE = SPANISH') AS "DIA" FROM employees;

-- 4: Filtrado con TO_CHAR
SELECT job_title, TO_CHAR(max_salary, '$99,999.999') AS "Salario Máximo" FROM jobs WHERE UPPER(job_title) LIKE '%PRESIDENT%';

-- 5 y 6: Diferencia con y sin FM
SELECT TO_CHAR(SYSDATE, 'DD "de" Month "de" YYYY', 'NLS_DATE_LANGUAGE = SPANISH') AS "Sin FM", TO_CHAR(SYSDATE, 'fmDD "de" Month "de" YYYY', 'NLS_DATE_LANGUAGE = SPANISH') AS "Con FM" FROM dual;
SELECT first_name, last_name, TO_CHAR(hire_date, 'fmDay" el "dd" de "Month" de "YYYY', 'NLS_DATE_LANGUAGE = SPANISH') AS "Contratacion" FROM employees;

-- 7: Filtrar por día concreto
SELECT first_name, last_name, hire_date FROM employees WHERE TO_CHAR(hire_date, 'fmDay', 'NLS_DATE_LANGUAGE = SPANISH') = 'Lunes';









