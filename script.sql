create database btomail;
use btomail;

create TABLE correo(
IdCorreo Integer PRIMARY KEY AUTO_INCREMENT, 
NombreEmisor varchar(50),
CorreoEmisor varchar(100),
Fecha datetime,
Asunto varchar(50),
Mensaje text,
Categoria tinyint,
Leido tinyint,
Destacado tinyint,
Eliminado tinyint,
Spam tinyint,
CorreoReceptor varchar(100)
);

alter table correo add index (Categoria);

describe correo;

show indexes from correo;

drop table correo;
delete from correo;
select * from correo order by IdCorreo desc;
insert into correo(NombreEmisor,CorreoEmisor, Fecha, Asunto, Mensaje, Categoria, Leido, Destacado, Eliminado, Spam, CorreoReceptor) 
value('Kevin Castillo', 'kevincastillo@gmail.com', SYSDATE(), 'Prueba1', 'Esto es una prueba 1', 0,1,0,0,0,'receptor@gmail.com'),
	('Javier Hernandez', 'Javier@gmail.com', SYSDATE(), 'Prueba2', 'Esto es una prueba 2', 0,0,1,0,0,'receptor@gmail.com'),
    ('Messi Ronaldo', 'Messi@gmail.com', SYSDATE(), 'Prueba3', 'Esto es una prueba 3', 0,1,0,0,0,'receptor@gmail.com'),
    ('Esperanza Callejas', 'Esperanza@gmail.com', SYSDATE(), 'Prueba4', 'Esto es una prueba 4', 0,1,0,0,0,'receptor@gmail.com'),
    ('Jazmin Blanco', 'Jazmin@gmail.com', SYSDATE(), 'Prueba5', 'Esto es una prueba 5', 0,0,0,0,1,'receptor@gmail.com'),
    ('Hector Hernandez', 'Hector@gmail.com', SYSDATE(), 'Prueba6', 'Esto es una prueba 6', 0,0,1,1,0,'receptor@gmail.com'),
    ('Alejandro Castillo', 'Alejandro@gmail.com', SYSDATE(), 'Prueba7', 'Esto es una prueba 7', 0,0,0,1,0,'receptor@gmail.com'),
    ('Kevin Messi', 'KevinMessi@gmail.com', SYSDATE(), 'Prueba8', 'Esto es una prueba 8', 1,0,0,0,0,'receptor@gmail.com');

delimiter //
CREATE procedure InsertarNoLeidos()     
  BEGIN
DECLARE i integer;
  SET i = 0;
  
  my_loop: LOOP
    SET i = i +1;
		insert into correo(NombreEmisor,CorreoEmisor, Fecha, Asunto, Mensaje, Categoria, Leido, Destacado, Eliminado, Spam, CorreoReceptor) 
        value('Kevin Castillo', 'kevincastillo@gmail.com', SYSDATE(), 'Prueba', 'Esto es una prueba', 0,0,0,0,0,'receptor@gmail.com');

    IF  i =10000 THEN
     LEAVE my_loop;
    END IF;
 END LOOP my_loop;

END
//delimiter ;

call insertarNoLeidos();

delimiter //
CREATE procedure Insertardestacados()     
  BEGIN
DECLARE i integer;
  SET i = 0;
  my_loop: LOOP
    SET i = i +1;
		insert into correo(NombreEmisor,CorreoEmisor, Fecha, Asunto, Mensaje, Categoria, Leido, Destacado, Eliminado, Spam, CorreoReceptor) 
        value('Kevin Castillo', 'kevincastillo@gmail.com', SYSDATE(), 'Prueba', 'Esto es una prueba', 0,1,1,0,0,'receptor@gmail.com');

    IF  i =8000 THEN
     LEAVE my_loop;
    END IF;
 END LOOP my_loop;
END
//delimiter ;

call Insertardestacados();

delimiter //
CREATE procedure Insertarspam()     
  BEGIN
DECLARE i integer;
  SET i = 0;
  my_loop: LOOP
    SET i = i +1;
		insert into correo(NombreEmisor,CorreoEmisor, Fecha, Asunto, Mensaje, Categoria, Leido, Destacado, Eliminado, Spam, CorreoReceptor) 
        value('Kevin Castillo', 'kevincastillo@gmail.com', SYSDATE(), 'Prueba', 'Esto es una prueba', 0,0,0,0,1,'receptor@gmail.com');

    IF  i =10000 THEN
     LEAVE my_loop;
    END IF;
 END LOOP my_loop;
END
//delimiter ;

drop procedure Insertarspam;

call Insertarspam();

delimiter //
CREATE procedure Insertareliminados()     
  BEGIN
DECLARE i integer;
  SET i = 0;
  my_loop: LOOP
    SET i = i +1;
		insert into correo(NombreEmisor,CorreoEmisor, Fecha, Asunto, Mensaje, Categoria, Leido, Destacado, Eliminado, Spam, CorreoReceptor) 
        value('Kevin Castillo', 'kevincastillo@gmail.com', SYSDATE(), 'Prueba', 'Esto es una prueba', 0,1,0,1,0,'receptor@gmail.com');

    IF  i =10000 THEN
     LEAVE my_loop;
    END IF;
 END LOOP my_loop;
END
//delimiter ;

call Insertareliminados();

delimiter //
CREATE procedure Insertarenviados()     
  BEGIN
DECLARE i integer;
  SET i = 0;
  my_loop: LOOP
    SET i = i +1;
		insert into correo(NombreEmisor,CorreoEmisor, Fecha, Asunto, Mensaje, Categoria, Leido, Destacado, Eliminado, Spam, CorreoReceptor) 
        value('Kevin Castillo', 'kevincastillo@gmail.com', SYSDATE(), 'Prueba', 'Esto es una prueba', 1,1,0,0,0,'receptor@gmail.com');

    IF  i =10000 THEN
     LEAVE my_loop;
    END IF;
 END LOOP my_loop;
END
//delimiter ;

call Insertarenviados();

select count(*) from correo;