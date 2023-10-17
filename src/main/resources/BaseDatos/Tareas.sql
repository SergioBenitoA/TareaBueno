DROP DATABASE IF EXISTS Tareas;
CREATE DATABASE Tareas;
Use Tareas;


CREATE TABLE Tarea(
 Id int unsigned auto_increment primary key,
 Titulo varchar(20),
 Descripcion varchar(50),
 Dia varchar(20)
);
