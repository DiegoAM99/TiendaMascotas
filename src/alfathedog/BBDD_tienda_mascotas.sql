CREATE DATABASE IF NOT EXISTS clientes_mascotas_tienda;
USE clientes_mascotas_tienda;

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
FOREIGN KEY(Propietario) REFERENCES nuevocliente(Nombre)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS nuevavisita(
Visitas varchar(10),
PRIMARY KEY (Visitas)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;