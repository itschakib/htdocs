SET SERVEROUTPUT ON;

-- 1. Saludo simple
create or replace procedure saludar_usuario (
   p_nombre varchar2
) is
begin
   dbms_output.put_line('Hola, ' || p_nombre);
end;
/

-- 2. Suma de dos números
create or replace function sumar_numeros (
   a number,
   b number
) return number is
begin
   return a + b;
end;
/

-- 3. Calcular IVA
create or replace function calcular_iva (
   precio number
) return number is
begin
   return precio * 1.21;
end;
/

-- 4. Par o impar
create or replace procedure par_o_impar (
   p_num number
) is
begin
   if mod(p_num, 2) = 0 then
      dbms_output.put_line('El número ' || p_num || ' es par');
   else
      dbms_output.put_line('El número ' || p_num || ' es impar');
   end if;
end;
/

-- 5. Mayor de dos números
create or replace function mayor_de_dos (
   a number,
   b number
) return number is
begin
   if a > b then
      return a;
   else
      return b;
   end if;
end;
/

-- 6. Insertar alumno
create or replace procedure insertar_alumno (
   p_id number,
   p_nombre varchar2,
   p_apellidos varchar2,
   p_edad number
) is
begin
   insert into alumnos
   values (p_id, p_nombre, p_apellidos, p_edad);
end;
/

-- 7. Contar alumnos
create or replace function contar_alumnos
return number
is
   v_total number;
begin
   select count(*)
     into v_total
     from alumnos;

   return v_total;
end;
/

-- 8. Mostrar datos de un alumno
create or replace procedure mostrar_alumno (
   p_id number
) is
   v_nombre    alumnos.nombre%type;
   v_apellidos alumnos.apellidos%type;
   v_edad      alumnos.edad%type;
begin
   select nombre, apellidos, edad
     into v_nombre, v_apellidos, v_edad
     from alumnos
    where id_alumno = p_id;

   dbms_output.put_line('Nombre: ' || v_nombre);
   dbms_output.put_line('Apellidos: ' || v_apellidos);
   dbms_output.put_line('Edad: ' || v_edad);

exception
   when no_data_found then
      dbms_output.put_line('No existe el alumno con ese ID');
end;
/

-- 9. Media de notas de un alumno
create or replace function media_alumno (
   p_id number
) return number
is
   v_media number;
begin
   select avg(nota)
     into v_media
     from notas
    where id_alumno = p_id;

   return v_media;
end;
/

-- 10. Subir nota
create or replace procedure subir_nota (
   p_id_alumno  number,
   p_asignatura varchar2,
   p_suma       number
) is
   v_nota number;
begin
   select nota
     into v_nota
     from notas
    where id_alumno = p_id_alumno
      and asignatura = p_asignatura;

   v_nota := v_nota + p_suma;

   if v_nota > 10 then
      v_nota := 10;
   end if;

   update notas
      set nota = v_nota
    where id_alumno = p_id_alumno
      and asignatura = p_asignatura;

exception
   when no_data_found then
      dbms_output.put_line('No se encontró la nota del alumno');
end;
/