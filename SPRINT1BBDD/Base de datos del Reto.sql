DROP DATABASE IF EXISTS Rock_the_Sport;
CREATE DATABASE IF NOT EXISTS Rock_the_Sport;
USE Rock_the_Sport;
CREATE TABLE Evento(
CodEvento  SMALLINT UNSIGNED AUTO_INCREMENT  PRIMARY KEY,
TipoEvento ENUM('Ciclismo','Triatlón','Maratón','Natación','Canotaje'),
Nombre VARCHAR(30) NOT NULL UNIQUE
);
CREATE TABLE Edición(
NdeEdición TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Fecha DATETIME NOT NULL,
LugarRealización VARCHAR(50) NOT NULL,
CodEvento SMALLINT UNSIGNED,
CONSTRAINT FK_CodEvento FOREIGN KEY (CodEvento) 
REFERENCES Evento (CodEvento) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Deportista(
DNI INT UNSIGNED PRIMARY KEY NOT NULL,
Nombre VARCHAR(40) NOT NULL ,
Edad TINYINT NOT NULL CHECK(Edad > 16),
Teléfono VARCHAR(30),
Género VARCHAR(20)
);
CREATE TABLE Ciudad(
Provincia VARCHAR(30) NOT NULL,
Nombre VARCHAR(30) NOT NULL,
Tamaño SMALLINT, /* LA MEDIDA SE VA A GUARDAR EN KILOMETROS CUADRADOS*/
CONSTRAINT PK_Ciudad PRIMARY KEY (Provincia,Nombre)
);
CREATE TABLE Participación (
DNI INT UNSIGNED ,
NdeEdición TINYINT UNSIGNED,
NdeInscripción SMALLINT NOT NULL, 
CONSTRAINT PK_Participación PRIMARY KEY (DNI,NdeEDICIÓN),
CONSTRAINT FK_DNI FOREIGN KEY (DNI) 
REFERENCES Deportista(DNI) ON UPDATE CASCADE ON DELETE CASCADE,
CONSTRAINT FK_NdeEdición FOREIGN KEY (NdeEdición)
 REFERENCES Edición (NdeEdición) ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE Celebra (
NdeEdición TINYINT UNSIGNED,
Nombre VARCHAR(30),
Provincia VARCHAR(30),
CONSTRAINT PK_Celebra PRIMARY KEY (NdeEdición, Nombre, Provincia),
CONSTRAINT FK_Celebra_Edicion FOREIGN KEY (NdeEdición)
REFERENCES Edición (NdeEdición) ON UPDATE CASCADE ON DELETE CASCADE,
CONSTRAINT FK_Celebra_Ciudad FOREIGN KEY (Provincia, Nombre)
REFERENCES Ciudad (Provincia, Nombre) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE Productos (
Id_producto INT AUTO_INCREMENT PRIMARY KEY,
Nombre VARCHAR(100) NOT NULL,
Descripcion TEXT NULL,
Precio DECIMAL(10,2) NOT NULL CHECK (Precio >= 0),
Stock INT NOT NULL CHECK (Stock >= 0),
Categoria VARCHAR(50) NOT NULL,
NdeEdición TINYINT UNSIGNED NOT NULL,
CONSTRAINT FK_Productos_Edicion
FOREIGN KEY (NdeEdición)
REFERENCES Edición (NdeEdición)
ON UPDATE CASCADE
ON DELETE CASCADE
);

INSERT INTO Evento (TipoEvento, Nombre) VALUES
('Ciclismo', 'Tour de la Costa'),
('Triatlón', 'Triatlón Primavera'),
('Maratón', 'Maratón Internacional'),
('Natación', 'Aguas Abiertas'),
('Canotaje', 'Desafío del Río');

INSERT INTO Edición (Fecha, LugarRealización, CodEvento) VALUES
('2025-03-15 09:00:00', 'Valle Verde', 1),
('2025-04-22 08:30:00', 'Lago Azul', 2),
('2025-05-10 06:45:00', 'Ciudad Central', 3),
('2025-06-05 07:20:00', 'Playa Dorada', 4),
('2025-07-12 10:00:00', 'Río Bravo', 5);

INSERT INTO Deportista (DNI, Nombre, Edad, Teléfono, Género) VALUES
(12345678, 'Juan Pérez', 25, '555-1234', 'Masculino'),
(87654321, 'María García', 29, '555-9876', 'Femenino'),
(23456789, 'Luis Rodríguez', 32, '555-5678', 'Masculino'),
(98765432, 'Ana Martínez', 28, '555-4321', 'Femenino'),
(34567890, 'Carlos López', 22, '555-2345', 'Masculino');

INSERT INTO Ciudad (Provincia, Nombre, Tamaño) VALUES
('Pichincha', 'Quito', 372),
('Guayas', 'Guayaquil', 344),
('Azuay', 'Cuenca', 250),
('Manabí', 'Manta', 240),
('Tungurahua', 'Ambato', 280);

INSERT INTO Participación (DNI, NdeEdición, NdeInscripción) VALUES
(12345678, 1, 101),
(87654321, 2, 102),
(23456789, 3, 103),
(98765432, 4, 104),
(34567890, 5, 105),
(12345678, 3, 106),
(87654321, 5, 107),
(23456789, 1, 108),
(98765432, 2, 109),
(34567890, 3, 110);

INSERT INTO Celebra (NdeEdición, Nombre, Provincia) VALUES
(1, 'Quito', 'Pichincha'),
(2, 'Guayaquil', 'Guayas'),
(3, 'Cuenca', 'Azuay'),
(4, 'Manta', 'Manabí'),
(5, 'Ambato', 'Tungurahua');

INSERT INTO Productos (Nombre, Descripcion, Precio, Stock, Categoria, NdeEdición) VALUES
('Camiseta Deportiva', 'Camiseta transpirante', 19.99, 150, 'Ropa', 1),
('Botella de Agua', 'Capacidad 1L', 9.50, 300, 'Accesorios', 1),
('Gorra Running', 'Gorra ligera para correr', 12.00, 200, 'Ropa', 2),
('Mochila Trail', 'Mochila para trail running', 49.99, 75, 'Equipamiento', 3),
('Pantalón Ciclista', 'Short para ciclismo', 29.99, 90, 'Ropa', 4);
