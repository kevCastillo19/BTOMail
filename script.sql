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
CorreoReceptor varchar(100),
index i_emisor (NombreEmisor),
index i_correoEmisor (CorreoEmisor),
index i_fecha (Fecha)
);

delete from correo;
select * from correo;
insert into correo(NombreEmisor,CorreoEmisor, Fecha, Asunto, Mensaje, Categoria, Leido, Destacado, Eliminado, Spam, CorreoReceptor) 
value('Kevin Castillo', 'kevincastillo@gmail.com', SYSDATE(), 'Prueba', 'Esto es una prueba', 0,1,0,0,0,'receptor@gmail.com'),
	('Javier Hernandez', 'Javier@gmail.com', SYSDATE(), 'Prueba', 'Esto es una prueba', 0,0,1,0,0,'receptor@gmail.com'),
    ('Messi Ronaldo', 'Messi@gmail.com', SYSDATE(), 'Prueba', 'Esto es una prueba', 0,1,0,0,0,'receptor@gmail.com'),
    ('Esperanza Callejas', 'Esperanza@gmail.com', SYSDATE(), 'Prueba', 'Esto es una prueba', 0,1,0,0,0,'receptor@gmail.com'),
    ('Jazmin Blanco', 'Jazmin@gmail.com', SYSDATE(), 'Prueba', 'Esto es una prueba', 0,0,0,0,1,'receptor@gmail.com'),
    ('Hector Hernandez', 'Hector@gmail.com', SYSDATE(), 'Prueba', 'Esto es una prueba', 0,0,1,1,0,'receptor@gmail.com'),
    ('Alejandro Castillo', 'Alejandro@gmail.com', SYSDATE(), 'Prueba', 'Esto es una prueba', 0,0,0,1,0,'receptor@gmail.com'),
    ('Kevin Messi', 'KevinMessi@gmail.com', SYSDATE(), 'Prueba', 'Esto es una prueba', 1,0,0,0,0,'receptor@gmail.com');

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

call InsertarNoLeidos();
select count(*) from correo;