--------------------------------------------------------
-- ELIMINAR TABLAS (por si ya existen)
--------------------------------------------------------
BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE MATRICULAR';
EXCEPTION WHEN OTHERS THEN NULL; END;
/

BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE ASIGNATURAS';
EXCEPTION WHEN OTHERS THEN NULL; END;
/

BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE ALUMNOS';
EXCEPTION WHEN OTHERS THEN NULL; END;
/

BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE PROFESORES';
EXCEPTION WHEN OTHERS THEN NULL; END;
/

--------------------------------------------------------
-- TABLA PROFESORES
--------------------------------------------------------
CREATE TABLE PROFESORES (
  COD_PROF         NUMBER(4)      PRIMARY KEY,
  NOMBRE           VARCHAR2(30)   NOT NULL,
  APELLIDO1        VARCHAR2(30)   NOT NULL,
  APELLIDO2        VARCHAR2(30),
  EMAIL            VARCHAR2(80),
  DEPARTAMENTO     NUMBER(2)      NOT NULL,
  FECHA_NACIMIENTO DATE           NOT NULL,
  ANTIGUEDAD       DATE           NOT NULL
);

--------------------------------------------------------
-- TABLA ALUMNOS
--------------------------------------------------------
CREATE TABLE ALUMNOS (
  COD_ALUMNO            NUMBER(5)    PRIMARY KEY,
  NOMBRE                VARCHAR2(30) NOT NULL,
  APELLIDO1             VARCHAR2(30) NOT NULL,
  APELLIDO2             VARCHAR2(30),
  EMAIL                 VARCHAR2(80),
  SEXO                  VARCHAR2(4)  CHECK (SEXO IN ('MASC','FEM')),
  FECHA_NACIMIENTO      DATE         NOT NULL,
  FECHA_PRIM_MATRICULA  DATE         NOT NULL
);

--------------------------------------------------------
-- TABLA ASIGNATURAS
--------------------------------------------------------
CREATE TABLE ASIGNATURAS (
  CODIGO     VARCHAR2(5)   PRIMARY KEY,
  NOMBRE     VARCHAR2(80)  NOT NULL,
  CREDITOS   NUMBER(2),
  CARACTER   VARCHAR2(15),
  CURSO      NUMBER(1),
  TEORICOS   NUMBER(2),
  PRACTICOS  NUMBER(2)
);

--------------------------------------------------------
-- TABLA MATRICULAR
--------------------------------------------------------
CREATE TABLE MATRICULAR (
  ALUMNO        NUMBER(5)  NOT NULL,
  ASIGNATURA    VARCHAR2(5) NOT NULL,
  CALIFICACION  NUMBER(4,2),
  CONSTRAINT PK_MATRICULAR PRIMARY KEY (ALUMNO, ASIGNATURA),
  CONSTRAINT FK_MATRI_ALUM FOREIGN KEY (ALUMNO)
    REFERENCES ALUMNOS(COD_ALUMNO),
  CONSTRAINT FK_MATRI_ASIG FOREIGN KEY (ASIGNATURA)
    REFERENCES ASIGNATURAS(CODIGO)
);

INSERT INTO PROFESORES VALUES 
(1, 'Ana', 'Gomez', 'Lopez', 'ana.gomez@lcc.uma.es', 1,
 TO_DATE('15/05/1965','DD/MM/YYYY'),
 TO_DATE('01/10/1988','DD/MM/YYYY'));

INSERT INTO PROFESORES VALUES 
(2, 'Luis', 'Martinez', 'Ruiz', 'lmartinez@lcc.uma.es', 1,
 TO_DATE('20/03/1970','DD/MM/YYYY'),
 TO_DATE('15/09/1992','DD/MM/YYYY'));

INSERT INTO PROFESORES VALUES 
(3, 'Maria', 'Santos', 'Perez', 'msantos@uma.es', 2,
 TO_DATE('10/11/1978','DD/MM/YYYY'),
 TO_DATE('01/10/2004','DD/MM/YYYY'));

INSERT INTO PROFESORES VALUES 
(4, 'Javier', 'Lopez', 'Diaz', 'jlopez@lcc.uma.es', 3,
 TO_DATE('02/02/1960','DD/MM/YYYY'),
 TO_DATE('01/09/1985','DD/MM/YYYY'));

INSERT INTO PROFESORES VALUES 
(5, 'Lucia', 'Fernandez','Suarez', 'lucia.fernandez@lcc.uma.es', 2,
 TO_DATE('25/07/1985','DD/MM/YYYY'),
 TO_DATE('01/10/2012','DD/MM/YYYY'));

INSERT INTO PROFESORES VALUES 
(6, 'Carlos', 'Herrera','Gil', 'cherrera@uma.es', 4,
 TO_DATE('05/01/1958','DD/MM/YYYY'),
 TO_DATE('01/10/1983','DD/MM/YYYY'));

INSERT INTO PROFESORES VALUES 
(7, 'Elena', 'Torres','Vega', 'etorres@lcc.uma.es', 1,
 TO_DATE('12/12/1996','DD/MM/YYYY'),
 TO_DATE('15/09/2022','DD/MM/YYYY'));

INSERT INTO PROFESORES VALUES 
(8, 'Pablo', 'Romero','Navarro', 'pablo.romero@lcc.uma.es', 3,
 TO_DATE('08/08/1990','DD/MM/YYYY'),
 TO_DATE('01/09/2018','DD/MM/YYYY'));

INSERT INTO PROFESORES VALUES 
(9, 'Raquel', 'Navas','Prieto', 'raquel.navas@uma.es', 4,
 TO_DATE('30/09/1982','DD/MM/YYYY'),
 TO_DATE('01/10/2008','DD/MM/YYYY'));

INSERT INTO PROFESORES VALUES 
(10, 'Miguel','Serrano','Iglesias','miguel.serrano@lcc.uma.es',1,
 TO_DATE('01/01/1995','DD/MM/YYYY'),
 TO_DATE('01/10/2021','DD/MM/YYYY'));

-- Profesor adicional para ejercicios 19 y 20
INSERT INTO PROFESORES VALUES
(11, 'Andres', 'Corto', 'Servicio', 'andres.corto@uma.es', 2,
 TO_DATE('01/01/1970','DD/MM/YYYY'),
 TO_DATE('01/07/2010','DD/MM/YYYY'));

--------------------------------------------------------
-- ASIGNATURAS
--------------------------------------------------------
INSERT INTO ASIGNATURAS VALUES ('101','Programación I',6,'Troncal',1,4,2);
INSERT INTO ASIGNATURAS VALUES ('102','Programación II',6,'Troncal',2,4,2);
INSERT INTO ASIGNATURAS VALUES ('103','Matemáticas Discretas',6,'Troncal',1,5,1);
INSERT INTO ASIGNATURAS VALUES ('112','Bases de Datos I',6,'Obligatoria',2,4,2);
INSERT INTO ASIGNATURAS VALUES ('113','Bases de Datos II',6,'Optativa',3,3,3);
INSERT INTO ASIGNATURAS VALUES ('201','Estructura de Computadores',6,'Troncal',2,4,2);
INSERT INTO ASIGNATURAS VALUES ('202','Redes de Computadores',6,'Obligatoria',3,3,3);
INSERT INTO ASIGNATURAS VALUES ('203','Programación Web',4,'Optativa',3,2,2);
INSERT INTO ASIGNATURAS VALUES ('204','Inteligencia Artificial',6,'Optativa',3,4,2);
INSERT INTO ASIGNATURAS VALUES ('205','Proyecto Fin de Grado',NULL,'Optativa',4,NULL,NULL);
INSERT INTO ASIGNATURAS VALUES ('210','Bases de Datos Avanzadas',4,'Optativa',4,2,2);
INSERT INTO ASIGNATURAS VALUES ('220','Sistemas Operativos',6,'Troncal',2,4,2);

-- Nueva asignatura para ejercicios 10 y 12
INSERT INTO ASIGNATURAS VALUES
('300','Bases de Datos para Ingenieros',6,'Optativa',3,3,3);

INSERT INTO ALUMNOS VALUES
(1001,'Laura','Jimenez','Santos',NULL,'FEM',
 TO_DATE('15/04/2003','DD/MM/YYYY'), TO_DATE('06/09/2021','DD/MM/YYYY'));

INSERT INTO ALUMNOS VALUES
(1002,'Pedro','Lopez','Garcia','pedro.lopez@uma.es','MASC',
 TO_DATE('20/10/2002','DD/MM/YYYY'), TO_DATE('07/09/2020','DD/MM/YYYY'));

INSERT INTO ALUMNOS VALUES
(1003,'Marta','Ruiz','Diaz','marta.ruiz@gmail.com','FEM',
 TO_DATE('01/01/2001','DD/MM/YYYY'), TO_DATE('02/09/2019','DD/MM/YYYY'));

INSERT INTO ALUMNOS VALUES
(1004,'Jorge','Navarro','Serrano',NULL,'MASC',
 TO_DATE('30/06/2004','DD/MM/YYYY'), TO_DATE('05/09/2022','DD/MM/YYYY'));

INSERT INTO ALUMNOS VALUES
(1005,'Lucia','Moreno','Gomez','lucia.moreno@uma.es','FEM',
 TO_DATE('12/12/2000','DD/MM/YYYY'), TO_DATE('04/09/2018','DD/MM/YYYY'));

INSERT INTO ALUMNOS VALUES
(1006,'Alberto','Castro','Lopez',NULL,'MASC',
 TO_DATE('05/05/1999','DD/MM/YYYY'), TO_DATE('01/09/2017','DD/MM/YYYY'));

INSERT INTO ALUMNOS VALUES
(1007,'Carmen','Sanz','Prieto','carmen.sanz@uma.es','FEM',
 TO_DATE('28/02/2003','DD/MM/YYYY'), TO_DATE('06/09/2021','DD/MM/YYYY'));

INSERT INTO ALUMNOS VALUES
(1008,'Daniel','Vega','Romero','daniel.vega@gmail.com','MASC',
 TO_DATE('10/03/2002','DD/MM/YYYY'), TO_DATE('02/09/2019','DD/MM/YYYY'));

INSERT INTO ALUMNOS VALUES
(1009,'Nuria','Lozano','Herrera',NULL,'FEM',
 TO_DATE('11/11/2004','DD/MM/YYYY'), TO_DATE('05/09/2022','DD/MM/YYYY'));

INSERT INTO ALUMNOS VALUES
(1010,'Sergio','Pardo','Nava','sergio.pardo@uma.es','MASC',
 TO_DATE('09/09/2001','DD/MM/YYYY'), TO_DATE('04/09/2018','DD/MM/YYYY'));

-- Alumno añadido para ejercicio 14 (matrícula reciente)
INSERT INTO ALUMNOS VALUES
(1011,'Mario','Prueba','Reciente',NULL,'MASC',
 ADD_MONTHS(TRUNC(SYSDATE), -240), SYSDATE - 30);

-- UPDATE alumno 1003 para que el ejercicio 13 devuelva resultado
UPDATE ALUMNOS
SET FECHA_PRIM_MATRICULA = TO_DATE('02/09/2019 10:00','DD/MM/YYYY HH24:MI')
WHERE COD_ALUMNO = 1003;

--------------------------------------------------------
-- MATRICULAR
--------------------------------------------------------
INSERT INTO MATRICULAR VALUES (1001,'112',7.5);
INSERT INTO MATRICULAR VALUES (1002,'112',5.0);
INSERT INTO MATRICULAR VALUES (1003,'112',8.0);
INSERT INTO MATRICULAR VALUES (1004,'112',4.5);
INSERT INTO MATRICULAR VALUES (1005,'112',6.0);
INSERT INTO MATRICULAR VALUES (1006,'112',9.0);
INSERT INTO MATRICULAR VALUES (1007,'112',7.0);
INSERT INTO MATRICULAR VALUES (1008,'112',3.5);
INSERT INTO MATRICULAR VALUES (1009,'112',6.5);
INSERT INTO MATRICULAR VALUES (1010,'112',8.5);

INSERT INTO MATRICULAR VALUES (1001,'113',6.5);
INSERT INTO MATRICULAR VALUES (1002,'113',7.0);
INSERT INTO MATRICULAR VALUES (1003,'202',5.5);
INSERT INTO MATRICULAR VALUES (1004,'203',9.0);
INSERT INTO MATRICULAR VALUES (1005,'210',8.0);
INSERT INTO MATRICULAR VALUES (1006,'201',4.0);
INSERT INTO MATRICULAR VALUES (1007,'202',7.5);
INSERT INTO MATRICULAR VALUES (1008,'204',6.5);
INSERT INTO MATRICULAR VALUES (1009,'210',9.2);
INSERT INTO MATRICULAR VALUES (1010,'220',5.0);

COMMIT;
