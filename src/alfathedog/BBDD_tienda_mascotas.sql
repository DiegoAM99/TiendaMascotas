CREATE DATABASE IF NOT EXISTS veterinario;
USE veterinario;

CREATE TABLE nuevocliente (
Nombre varchar(7) NOT NULL PRIMARY KEY,
Apellido varchar (15) NOT NULL,
DNI varchar (20) NOT NULL,
Teléfono varchar (10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS nuevamascota (
Nombre varchar(11) NOT NULL,
Sexo varchar(10),
Especie varchar(30),
Raza varchar(30),
Chip varchar(20),
Fecha_nacimiento VARCHAR(20) NOT NULL,
Propietario varchar(15),
PRIMARY KEY (Nombre),
UNIQUE KEY(Propietario) 
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS nuevavisita(
FechaVisitas varchar(10),
DNI_Propietario varchar(20),
PRIMARY KEY (FechaVisitas)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

SELECT* FROM veterinario.nuevamascota;
INSERT INTO nuevamascota
VALUES ('Anthony','Masculino','Gato','','1','20-04-2001','65987452N'),
('Bailey','Femenino','Gato','','2','19-05-2002','54123654B'),
('Bob','Masculino','Gato','','3','15-06-2003','12457843N'),
('Chantelle','Femenino','Gato','','4','25-12-2004','45781536L');
SHOW VARIABLES LIKE 'sql_safe_updates';
SET sql_safe_updates=1;
SHOW VARIABLES LIKE 'foreign_key_checks';
SET foreign_key_checks=0;

SELECT* FROM veterinario.nuevocliente;
INSERT INTO nuevocliente
VALUES ('Diego','Leon','65987452N','914555364'),
('Vanesa','Romero','54123654B','684237647'),
('Victor','Ramirez','12457843N','453697513'),
('Lola','Pacheco','24795868J','657863254');
SHOW VARIABLES LIKE 'sql_safe_updates';
SET sql_safe_updates=1;
SHOW VARIABLES LIKE 'foreign_key_checks';
SET foreign_key_checks=0;

SELECT* FROM veterinario.nuevavisita;
INSERT INTO nuevavisita
VALUES ('20-04-2001','65987452N'),
('19-05-2002','54123654B'),
('15-06-2003','12457843N'),
('25-12-2004','24795868J');
SHOW VARIABLES LIKE 'sql_safe_updates';
SET sql_safe_updates=1;
SHOW VARIABLES LIKE 'foreign_key_checks';
SET foreign_key_checks=1;