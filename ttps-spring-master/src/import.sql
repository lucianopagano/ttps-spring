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
INSERT INTO nombrecampo(id, nombre) VALUES(24, 'imagen'); 

INSERT INTO raza(id, descripcion, especie_id) VALUES(4, 'Labrador', 1);
INSERT INTO raza(id, descripcion, especie_id) VALUES(5, 'Pincher', 1);
INSERT INTO raza(id, descripcion, especie_id) VALUES(6, 'Bull Terrier', 1);
INSERT INTO raza(id, descripcion, especie_id) VALUES(7, 'Pitbull', 1);
INSERT INTO raza(id, descripcion, especie_id) VALUES(8, 'Mestizo', 1);
INSERT INTO raza(id, descripcion, especie_id) VALUES(9, 'Siames', 2);
INSERT INTO raza(id, descripcion, especie_id) VALUES(10, 'Birmano', 2);
INSERT INTO raza(id, descripcion, especie_id) VALUES(11, 'Mestizo', 2);
INSERT INTO raza(id, descripcion, especie_id) VALUES(12, 'Loro', 3);
INSERT INTO raza(id, descripcion, especie_id) VALUES(13, 'Papagayo', 3);
INSERT INTO raza(id, descripcion, especie_id) VALUES(14, 'Canario', 3); 
 
INSERT INTO tipousuario(id, descripcion) VALUES (1, 'Administrador');
INSERT INTO tipousuario(id, descripcion) VALUES (2, 'Dueno');
INSERT INTO tipousuario(id, descripcion) VALUES (3, 'Veterinario');
 
INSERT INTO informacionveterinaria(id, domicilioclinica, nombreclinica) VALUES(1, '59 numero 4115', 'Patan');
INSERT INTO informacionveterinaria(id, domicilioclinica, nombreclinica) VALUES(2, '113 y 65 609', 'Leos');
INSERT INTO informacionveterinaria(id, domicilioclinica, nombreclinica) VALUES(3, '32 y 25 1121', 'Patitas');
INSERT INTO informacionveterinaria(id, domicilioclinica, nombreclinica) VALUES(4, '7 y 50', 'Centro');
 
INSERT INTO usuario(id, apellido, contrasena, email, nombre, nombreUsuario, telefono, TIPO_ID, veterinaria_id) VALUES(1, 'Rodriguez', 'imrod123', 'imrod22@gmail.com', 'Imanol', 'imrod', '221532355', 2, NULL);
INSERT INTO usuario(id, apellido, contrasena, email, nombre, nombreUsuario, telefono, TIPO_ID, veterinaria_id) VALUES(2, 'Pontiroli', 'gaspi123', 'gasparpontiroli@gmail.com', 'Gaspar', 'gaspar', '221456789', 3, 1);
INSERT INTO usuario(id, apellido, contrasena, email, nombre, nombreUsuario, telefono, TIPO_ID, veterinaria_id) VALUES(3, 'Pagano', 'lucho123', 'lucho@gmail.com', 'Luciano', 'lucho', '221567333', 2, NULL);
INSERT INTO usuario(id, apellido, contrasena, email, nombre, nombreUsuario, telefono, TIPO_ID, veterinaria_id) VALUES(4, 'Loja', 'juansete123', 'juanloja@gmail.com', 'Juan', 'juansete', '223454332', 2, NULL);
INSERT INTO usuario(id, apellido, contrasena, email, nombre, nombreUsuario, telefono, TIPO_ID, veterinaria_id) VALUES(5, 'Fernandez', 'carla123', 'carlafernandez@gmail.com', 'Carla', 'cfernandez', '221456789', 3, 2);
INSERT INTO usuario(id, apellido, contrasena, email, nombre, nombreUsuario, telefono, TIPO_ID, veterinaria_id) VALUES(6, 'Luneta', 'moon123', 'cluneta@gmail.com', 'Jose', 'jmoon', '134356', 3, 4);
INSERT INTO usuario(id, apellido, contrasena, email, nombre, nombreUsuario, telefono, TIPO_ID, veterinaria_id) VALUES(7, 'Torres', 'sandri123', 'sandra@gmail.com', 'Sandra', 'sandrat', '221532355', 2, NULL);
INSERT INTO usuario(id, apellido, contrasena, email, nombre, nombreUsuario, telefono, TIPO_ID, veterinaria_id) VALUES(8, 'Monzon', 'champ123', 'monzo@gmail.com', 'Gerardo', 'champ', '2213336700', 3, 3);
INSERT INTO usuario(id, apellido, contrasena, email, nombre, nombreUsuario, telefono, TIPO_ID, veterinaria_id) VALUES(9, 'Gil Nobles', 'cris123', 'cvenini@gmail.com', 'Christian', 'cris', '2213336700', 2, NULL);


INSERT INTO mascota(id, qr, duenio_id, raza_id, veterinario_id) VALUES(111, '123', 1, 6, 2);
INSERT INTO mascota(id, qr, duenio_id, raza_id, veterinario_id) VALUES(112, '456', 1, 13, 2);
INSERT INTO mascota(id, qr, duenio_id, raza_id, veterinario_id) VALUES(113, '123', 1, 4, 6);
INSERT INTO mascota(id, qr, duenio_id, raza_id, veterinario_id) VALUES(114, '456', 3, 5, 6);
INSERT INTO mascota(id, qr, duenio_id, raza_id, veterinario_id) VALUES(115, '123', 3, 8, 5);
INSERT INTO mascota(id, qr, duenio_id, raza_id, veterinario_id) VALUES(116, '456', 3, 10, 5);
INSERT INTO mascota(id, qr, duenio_id, raza_id, veterinario_id) VALUES(117, '123', 3, 6, 5);
INSERT INTO mascota(id, qr, duenio_id, raza_id, veterinario_id) VALUES(118, '456', 3, 9, 5);
INSERT INTO mascota(id, qr, duenio_id, raza_id, veterinario_id) VALUES(119, '123', 4, 11, 2);
INSERT INTO mascota(id, qr, duenio_id, raza_id, veterinario_id) VALUES(120, '456', 4, 11, 8);
INSERT INTO mascota(id, qr, duenio_id, raza_id, veterinario_id) VALUES(121, '123', 4, 9, 8);
INSERT INTO mascota(id, qr, duenio_id, raza_id, veterinario_id) VALUES(122, '456', 4, 7, 8);
INSERT INTO mascota(id, qr, duenio_id, raza_id, veterinario_id) VALUES(123, '123', 4, 13, 6);
INSERT INTO mascota(id, qr, duenio_id, raza_id, veterinario_id) VALUES(124, '456', 7, 13, 2);
INSERT INTO mascota(id, qr, duenio_id, raza_id, veterinario_id) VALUES(125, '123', 7, 12, 2);
INSERT INTO mascota(id, qr, duenio_id, raza_id, veterinario_id) VALUES(126, '456', 7, 12, 5);

INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(91, 'Firulais', 1,  18, 111);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(92, '12-11-2010', 1, 19, 111);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(93, 'M', 0, 20, 111);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(94, 'Negro', 1, 21, 111);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(95, 'Cola cortada', 1, 22, 111);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES (96, 'perro1.jpg', 1, 24, 111);

INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(98, 'Pancho', 1,  18, 112);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(99, '11-02-2019', 1, 19, 112);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(100, 'M', 0, 20, 112);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(101, 'Usa bozal', 1, 21, 112);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(102, 'Color negro', 0, 22, 112);	
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES (103, 'perro1.jpg', 1, 24, 112);

INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(104, 'Hachiko', 1,  18, 113);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(105, '01-08-2016', 1, 19, 113);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(106, 'M', 0, 20, 113);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(107, 'Gris y Blanco', 1, 21, 113);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(108, 'N/A', 0, 22, 113);	
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES (109, 'gato.jpg', 1, 24, 113);

INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(110, 'Laika', 1,  18, 114);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(111, '11-02-2019', 1, 19, 114);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(112, 'F', 0, 20, 114);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(113, 'Renguea', 1, 21, 114);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(114, 'Color negro', 0, 22, 114);	
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES (115, 'gato.jpg', 1, 24, 114);

INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(116, 'Pluto', 1,  18, 115);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(117, '11-02-2019', 1, 19, 115);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(118, 'M', 0, 20, 115);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(119, 'Manchado', 1, 21, 115);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(120, 'Color negro', 0, 22, 115);	
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES (121, 'gato.jpg', 1, 24, 115);

INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(122, 'Niebla', 1,  18, 116);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(123, '11-02-2019', 1, 19, 116);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(124, 'F', 0, 20, 116);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(125, 'Blanco', 1, 21, 116);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(126, 'Color negro', 0, 22, 116);	
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES (127, 'gato.jpg', 1, 24, 116);

INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(128, 'Tita', 1,  18, 117);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(129, '11-02-2019', 1, 19, 117);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(130, 'F', 0, 20, 117);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(131, 'Gris', 1, 21, 117);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(132, 'Sin Cola', 0, 22, 117);	
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES (133, 'gato.jpg', 1, 24, 117);

INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(134, 'Pongo', 1,  18, 118);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(135, '11-02-2019', 1, 19, 118);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(136, 'M', 0, 20, 118);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(137, 'Rojo', 1, 21, 118);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(138, 'Color negro', 0, 22, 118);	
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES (139, 'gato.jpg', 1, 24, 118);

INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(140, 'Neto', 1,  18, 119);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(141, '11-02-2019', 1, 19, 119);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(142, 'M', 0, 20, 119);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(143, 'Rojo', 1, 21, 119);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(144, 'Color negro', 0, 22, 119);	
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES (145, 'gato.jpg', 1, 24, 119);

INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(146, 'Irish', 1,  18, 120);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(147, '11-02-2019', 1, 19, 120);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(148, 'M', 0, 20, 120);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(149, 'Rojo', 1, 21, 120);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(150, 'Color negro', 0, 22, 120);	
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES (151, 'gato.jpg', 1, 24, 120);

INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(152, 'Checa', 1,  18, 121);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(153, '11-02-2019', 1, 19, 121);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(154, 'M', 0, 20, 121);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(155, 'Rojo', 1, 21, 121);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(156, 'Color negro', 0, 22, 121);	
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES (157, 'gato.jpg', 1, 24, 121);

INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(158, 'Kassio', 1,  18, 122);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(159, '11-02-2019', 1, 19, 122);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(160, 'M', 0, 20, 122);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(161, 'Rojo', 1, 21, 122);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(162, 'Color negro', 0, 22, 122);	
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES (163, 'gato.jpg', 1, 24, 122);

INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(164, 'Melon', 1,  18, 123);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(165, '11-02-2019', 1, 19, 123);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(166, 'M', 0, 20, 123);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(167, 'Rojo', 1, 21, 123);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(168, 'Color negro', 0, 22, 123);	
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES (169, 'gato.jpg', 1, 24, 123);

INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(170, 'Hanibal', 1,  18, 124);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(171, '11-02-2019', 1, 19, 124);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(172, 'M', 0, 20, 124);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(173, 'Rojo', 1, 21, 124);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(174, 'Sin cola', 0, 22, 124);	
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES (175, 'gato.jpg', 1, 24, 124);

INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(176, 'Tomi', 1,  18, 125);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(177, '11-02-2019', 1, 19, 125);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(178, 'M', 0, 20, 125);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(179, 'Azulado', 1, 21, 125);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(180, 'Inquieto', 0, 22, 125);	
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES (181, 'gato.jpg', 1, 24, 125);

INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(182, 'Rica', 1,  18, 126);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(183, '11-02-2019', 1, 19, 126);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(184, 'F', 0, 20, 126);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(185, 'Verde', 1, 21, 126);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(186, 'Canta mucho', 0, 22, 126);	
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES (187, 'gato.jpg', 1, 24, 126);

INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(188, 'Rex', 1,  18, 127);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(189, '11-02-2019', 1, 19, 127);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(190, 'M', 0, 20, 127);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(191, 'marron claro', 1, 21, 127);
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES(192, 'Marron', 0, 22, 127);	
INSERT INTO campoficha(id, valor, visibilidad, CAMPO_ID, MascotaId) VALUES (193, 'gato.jpg', 1, 24, 127);

COMMIT;