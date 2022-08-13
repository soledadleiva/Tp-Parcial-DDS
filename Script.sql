CREATE DATABASE actividadparcial;
use actividadparcial;

/*--------------CREACIÓN DE TABLAS------------------*/
CREATE TABLE IF NOT EXISTS artista (
  id INT NOT NULL,
   avatar VARCHAR(255) NULL,
   web_url VARCHAR(255) NULL,
   CONSTRAINT pk_artista PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS cliente (
  id INT NOT NULL,
   nombre VARCHAR(255) NULL,
   apellido VARCHAR(255) NULL,
   direccion VARCHAR(255) NULL,
   mail VARCHAR(255) NULL,
   CONSTRAINT pk_cliente PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS compra (
  id INT NOT NULL,
   cliente_id INT NULL,
   fecha_de_compra VARCHAR(255) NULL,
   CONSTRAINT pk_compra PRIMARY KEY (id)
);

ALTER TABLE compra ADD CONSTRAINT FK_COMPRA_ON_CLIENTE FOREIGN KEY (cliente_id) REFERENCES cliente (id);


CREATE TABLE IF NOT EXISTS entrada (
  id INT NOT NULL,
   sector_id INT NULL,
   lugar VARCHAR(255) NULL,
   compra_id INT NULL,
   CONSTRAINT pk_entrada PRIMARY KEY (id)
);

ALTER TABLE entrada ADD CONSTRAINT FK_ENTRADA_ON_COMPRA FOREIGN KEY (compra_id) REFERENCES compra (id);

ALTER TABLE entrada ADD CONSTRAINT FK_ENTRADA_ON_SECTOR FOREIGN KEY (sector_id) REFERENCES sector (id);


CREATE TABLE  IF NOT EXISTS sector (
  id INT NOT NULL,
   tipo_de_sector VARCHAR(255) NULL,
   precio FLOAT NOT NULL,
   CONSTRAINT pk_sector PRIMARY KEY (id)
);


/**************************************************/
/*---------------------CLIENTES------------------ */

INSERT INTO `cliente`(
    `id`,
    `apellido`,
    `direccion`,
    `mail`,
    `nombre`
)
VALUES(
    1,'Leiva','Medrano 951','sleiva@gmail.com','Soledad'
);


INSERT INTO `cliente`(
    `id`,
    `apellido`,
    `direccion`,
    `mail`,
    `nombre`
)
VALUES(
    2,'Torrico','Av. Siempre Viva 1234','bntorrico@gmail.com','Brenda'
);

INSERT INTO `cliente`(
    `id`,
    `apellido`,
    `direccion`,
    `mail`,
    `nombre`
)
VALUES(
    3,'Gomez','Dell 123','sgomez@gmail.com','Selena'
);

/**************************************************/

/*-------------------COMPRAS:---------------------- */

INSERT INTO `compra`(
    `id`,
    `fecha_de_compra`,
    `cliente_id`
)
VALUES('1', '2022/08/08', '1');

INSERT INTO `compra`(
    `id`,
    `fecha_de_compra`,
    `cliente_id`
)
VALUES('2', '2022/08/09', '2');

INSERT INTO `compra`(
    `id`,
    `fecha_de_compra`,
    `cliente_id`
)
VALUES('3', '2022/08/14', '3');

INSERT INTO `compra`(
    `id`,
    `fecha_de_compra`,
    `cliente_id`
)
VALUES('4', '2022-08-01', '2');

/**************************************************/

/*-------------------SECTORES---------------------*/
INSERT INTO `sector`(`id`, `precio`, `tipo_de_sector`)
VALUES('1', '8599', 'CAMPO'),
('2', '16800', 'CAMPOVIP'),
('3', '10000', 'GENERAL'),
('4', '11500', 'PLATEA');


/**************************************************/
/*--------------------ENTRADAS--------------------*/
INSERT INTO `entrada`(
    `id`,
    `lugar`,
    `compra_id`,
    `sector_id`
)VALUES('1','Av. Eduardo Madero 470','1','1');


INSERT INTO `entrada` (`id`, `lugar`, `compra_id`, `sector_id`)
 VALUES ('2', 'Av. Eduardo Madero 470', '1', '1'), 
('3', 'Av. Eduardo Madero 470', '2', '2'),
 ('4', 'Av. Eduardo Madero 470', '3', '3');

INSERT INTO `entrada`(
    `id`,`lugar`,`compra_id`,`sector_id`
)
VALUES('5','Av. Eduardo Madero 470','4','4');