USE veterinaria;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

INSERT INTO especie (id, descripcion) VALUES(1, 'Perro');
INSERT INTO especie (id, descripcion) VALUES (2, 'Gato');
INSERT INTO especie (id, descripcion) VALUES (3, 'Ave');

INSERT INTO hibernate_sequence(next_val) VALUES(25);
INSERT INTO hibernate_sequence(next_val) VALUES(25);
INSERT INTO hibernate_sequence(next_val) VALUES(25);
INSERT INTO hibernate_sequence(next_val) VALUES(25);
INSERT INTO hibernate_sequence(next_val) VALUES(25);
INSERT INTO hibernate_sequence(next_val) VALUES(25);
INSERT INTO hibernate_sequence(next_val) VALUES(25);
INSERT INTO hibernate_sequence(next_val) VALUES(25);
INSERT INTO hibernate_sequence(next_val) VALUES(25);
INSERT INTO hibernate_sequence(next_val) VALUES(25);
INSERT INTO hibernate_sequence(next_val) VALUES(25);



INSERT INTO nombrecampo(id, nombre) VALUES(18, 'Nombre');
INSERT INTO nombrecampo(id, nombre) VALUES(19, 'FechaNacimiento');
INSERT INTO nombrecampo(id, nombre) VALUES(20, 'Sexo');
INSERT INTO nombrecampo(id, nombre) VALUES(21, 'Color');
INSERT INTO nombrecampo(id, nombre) VALUES(22, 'SenasParticulares');



INSERT INTO raza(id, descripcion, especie_id) VALUES(4, 'Labrador', 1);
INSERT INTO raza(id, descripcion, especie_id) VALUES(5, 'Chihuahua', 1);
INSERT INTO raza(id, descripcion, especie_id) VALUES(6, 'Dogo', 1);
INSERT INTO raza(id, descripcion, especie_id) VALUES(7, 'Pitbull', 1);
INSERT INTO raza(id, descripcion, especie_id) VALUES(8, 'Mestizo', 1);
INSERT INTO raza(id, descripcion, especie_id) VALUES(9, 'Siames', 2);
INSERT INTO raza(id, descripcion, especie_id) VALUES(10, 'Persa', 2);
INSERT INTO raza(id, descripcion, especie_id) VALUES(11, 'Bengala', 2);
INSERT INTO raza(id, descripcion, especie_id) VALUES(12, 'Loro', 3);
INSERT INTO raza(id, descripcion, especie_id) VALUES(13, 'Papagayo', 3);
INSERT INTO raza(id, descripcion, especie_id) VALUES(14, 'Canario', 3);



INSERT INTO tipousuario(id, descripcion) VALUES (15, 'Administrador');
INSERT INTO tipousuario(id, descripcion) VALUES (16, 'Veterinario');
INSERT INTO tipousuario(id, descripcion) VALUES (17, 'Dueno');



INSERT INTO usuario(id, apellido, contrasena, email, nombre, nombreUsuario, telefono, TIPO_ID, veterinaria_id) VALUES(24, 'Alvarez', '1234', 'juanalvarez@gmail.com', 'Juan', 'juan', '221532355', 17, NULL);
INSERT INTO usuario(id, apellido, contrasena, email, nombre, nombreUsuario, telefono, TIPO_ID, veterinaria_id) VALUES(25, 'Pontiroli', '12345', 'gasparpontiroli@gmail.com', 'Gaspar', 'gaspar', '221456789', 16, NULL);
INSERT INTO usuario(id, apellido, contrasena, email, nombre, nombreUsuario, telefono, TIPO_ID, veterinaria_id) VALUES(26, 'Pagano', '123456', 'lucho@gmail.com', 'Luciano', 'lucho', '221567333', 15, NULL);
COMMIT;