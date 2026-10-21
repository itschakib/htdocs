/* crear tablas */
--ejercicio 1
CREATE TABLE dept (
    id   NUMBER(7)
        CONSTRAINT tipos_pk PRIMARY KEY,
    name VARCHAR2(25)
);
--ejercicio 2
DESCRIBE DEPT;
--ejercicio 3
CREATE TABLE emp (
    id         NUMBER(7),
    last_name  VARCHAR2(25),
    first_name VARCHAR2(25),
    dept_id    NUMBER(7),
    CONSTRAINT emp_fk_dept FOREIGN KEY ( dept_id )
        REFERENCES dept ( id )
);
--ejercicio 4
DESCRIBE EMP;