-- =========================================
-- CLEAN HR SCHEMA (FIXED VERSION)
-- =========================================

-- BORRAR USUARIO (si existe)
DROP USER tema16 CASCADE;

-- CREAR USUARIO
CREATE USER tema16 IDENTIFIED BY tema16
DEFAULT TABLESPACE users
TEMPORARY TABLESPACE temp;

-- PRIVILEGIOS
GRANT CREATE SESSION, CREATE TABLE TO tema16;
GRANT CREATE SEQUENCE, CREATE VIEW TO tema16;
GRANT CREATE PROCEDURE TO tema16;
GRANT UNLIMITED TABLESPACE TO tema16;

-- TRABAJAR SOBRE SU ESQUEMA
ALTER SESSION SET CURRENT_SCHEMA = tema16;

--------------------------------------------------
-- TABLA EMPLEADOS (FIXED - NO DEPARTMENT COLUMN)
--------------------------------------------------
CREATE TABLE empleados (
    id        NUMBER PRIMARY KEY,
    nombre    VARCHAR2(50) NOT NULL,
    puesto    VARCHAR2(50),
    jefe_id   NUMBER,
    salario   NUMBER(8,2),
    CONSTRAINT fk_jefe
        FOREIGN KEY (jefe_id)
        REFERENCES empleados(id)
);

--------------------------------------------------
-- INSERT EMPLEADOS
--------------------------------------------------
INSERT INTO empleados VALUES (1, 'Ana Gómez', 'CEO', NULL, 90000);
INSERT INTO empleados VALUES (2, 'Luis Pérez', 'Director Comercial', 1, 60000);
INSERT INTO empleados VALUES (3, 'Marta Ruiz', 'Director Técnico', 1, 65000);
INSERT INTO empleados VALUES (4, 'Carlos Díaz', 'Comercial', 2, 30000);
INSERT INTO empleados VALUES (5, 'Lucía Torres', 'Comercial', 2, 32000);

INSERT INTO empleados VALUES (6, 'Javier Martín', 'Jefe Desarrollo', 3, 50000);
INSERT INTO empleados VALUES (7, 'Sofía López', 'SysAdmin', 3, 45000);
INSERT INTO empleados VALUES (8, 'Pablo Sánchez', 'Programador Senior', 6, 35000);
INSERT INTO empleados VALUES (9, 'Laura Navarro', 'Programador Senior', 6, 34000);
INSERT INTO empleados VALUES (10, 'Jose Gutierrez', 'Programador Junior', 8, 25000);

COMMIT;
/