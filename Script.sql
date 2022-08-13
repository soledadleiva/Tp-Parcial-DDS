SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
CREATE DATABASE IF NOT EXISTS `actividadparcial` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE `actividadparcial`;

CREATE TABLE `artista` (
  `id` int(11) NOT NULL,
  `name` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `place` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `date` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

INSERT INTO `artista` (`id`, `name`, `place`, `date`) VALUES
(1, 'Selena Gomez', 'Movistar Arena', '20/09/2022'),
(2, 'Dua Lipa', 'Estadio River Plate', '13/09/2022'),
(3, 'Imagine Dragons', 'Direct TV Arena', '20/08/2022'),
(4, 'Eminen', 'Estadio Unico de La Plata', '17/09/2022'),
(5, 'Ed Sheeran', 'Luna Park', '13/09/2022'),
(6, 'Red Hot Chili Peppers', 'Hipodromo de Palermo', '30/09/2022'),
(7, 'Passenger', 'Vorterix', '05/11/2022'),
(8, 'One Direction', 'GEBA', '24/09/2022'),
(9, 'Lewis Capaldi', 'Movistar Arena', '05/11/2022'),
(10, 'Coldplay', 'Estadio River Plate', '29/10/2022'),
(11, 'Harry Styles', 'Direct TV Arena', '03/12/2022'),
(12, 'Camila Cabello', 'Estadio Unico de La Plata', '27/12/2022'),
(13, 'Shawn Mendes', 'Luna Park', '05/12/2022'),
(14, 'Olivia Rodrigo', 'Hipodromo de Palermo', '14/08/2022'),
(15, 'Taylor Swift', 'Vorterix', '12/11/2022'),
(16, 'The Weeknd', 'GEBA', '28/10/2022'),
(17, 'Halsey', 'Movistar Arena', '10/09/2022'),
(18, 'Sam Smith', 'Estadio River Plate', '27/12/2022'),
(19, 'Lorde', 'Direct TV Arena', '19/11/2022'),
(20, 'Post Malone', 'Estadio Unico de La Plata', '13/09/2022');

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `apellido` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `direccion` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `es_miembro` bit(1) DEFAULT NULL,
  `mail` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `nombre` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tarjeta` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tiene_cupon` bit(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

INSERT INTO `cliente` (`id`, `apellido`, `direccion`, `es_miembro`, `mail`, `nombre`, `tarjeta`, `tiene_cupon`) VALUES
(1, 'Leiva', 'Medrano 951', b'1', 'sleiva@gmail.com', 'Soledad', '4540607667062666', b'0'),
(2, 'Torrico', 'Av. Siempre viva 123', b'0', 'bntorrico@gmail.com', 'Brenda', '4808607856743925', b'1'),
(3, 'Lombardo', 'Antezana 247', b'1', 'mlombardo@gmail.com', 'Mauro', '4808607856743925', b'1'),
(4, 'Gomez', 'Dell 123', b'0', 'sgomez@gmail.com', 'Selena', '5330555717144870', b'1');

CREATE TABLE `compra` (
  `id` int(11) NOT NULL,
  `fecha_de_compra` date DEFAULT NULL,
  `cliente_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

INSERT INTO `compra` (`id`, `fecha_de_compra`, `cliente_id`) VALUES
(1, '2022-08-23', 1),
(2, '2022-09-13', 2),
(3, '2022-10-09', 3),
(4, '2022-12-27', 4);

CREATE TABLE `entrada` (
  `id` int(11) NOT NULL,
  `fecha` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `lugar` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `artista_id` int(11) DEFAULT NULL,
  `compra_id` int(11) DEFAULT NULL,
  `sector_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

INSERT INTO `entrada` (`id`, `fecha`, `lugar`, `artista_id`, `compra_id`, `sector_id`) VALUES
(1, '20/09/2022', 'Movistar Arena', 1, 1, 2),
(2, '05/11/2022', 'Vorterix', 7, 2, 1),
(3, '03/12/2022', 'Direct TV Arena', 11, 3, 2),
(4, '20/09/2022', 'Movistar Arena', 1, 1, 2),
(5, '20/09/2022', 'Movistar Arena', 1, 1, 2),
(6, '27/12/2022', 'Estadio Unico de La Plata', 12, 4, 1);

CREATE TABLE `sector` (
  `tipo_sector` varchar(31) COLLATE utf8_spanish_ci NOT NULL,
  `id` int(11) NOT NULL,
  `precio` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

INSERT INTO `sector` (`tipo_sector`, `id`, `precio`) VALUES
('CAMPOVIP', 1, 25000),
('PLATEA', 2, 18000),
('CAMPO', 3, 15000);


ALTER TABLE `artista`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `compra`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKni21w35sfgo033m8l93ki11ab` (`cliente_id`);

ALTER TABLE `entrada`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKkvpp9ic7asb913vanuh4imabt` (`artista_id`),
  ADD KEY `FKtoed09qqt5s5sh90ajls1b3pg` (`compra_id`),
  ADD KEY `FKr2hp5x7i9lxo5vtgqt23v8050` (`sector_id`);

ALTER TABLE `sector`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `artista`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

ALTER TABLE `compra`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

ALTER TABLE `entrada`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

ALTER TABLE `sector`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;


ALTER TABLE `compra`
  ADD CONSTRAINT `FKni21w35sfgo033m8l93ki11ab` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`);

ALTER TABLE `entrada`
  ADD CONSTRAINT `FKkvpp9ic7asb913vanuh4imabt` FOREIGN KEY (`artista_id`) REFERENCES `artista` (`id`),
  ADD CONSTRAINT `FKr2hp5x7i9lxo5vtgqt23v8050` FOREIGN KEY (`sector_id`) REFERENCES `sector` (`id`),
  ADD CONSTRAINT `FKtoed09qqt5s5sh90ajls1b3pg` FOREIGN KEY (`compra_id`) REFERENCES `compra` (`id`);