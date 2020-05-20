-- noinspection SqlDialectInspectionForFile

-- noinspection SqlNoDataSourceInspectionForFile
DROP database if exists inventory;
CREATE DATABASE  IF NOT EXISTS inventory;

SET GLOBAL time_zone = '+01:00';

USE inventory;

DROP TABLE IF EXISTS height;
CREATE TABLE height (
  id int(11) NOT NULL AUTO_INCREMENT,
  height int(11) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS length;
CREATE TABLE length (
  id int(11) NOT NULL AUTO_INCREMENT,
  length int(11) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS width;
CREATE TABLE width (
  id int(11) NOT NULL AUTO_INCREMENT,
  width int(11) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS slope;
CREATE TABLE slope(
 id int(11) NOT NULL AUTO_INCREMENT,
 slope int(11) NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS roof_type;
CREATE TABLE roof_type(
 id int(11) NOT NULL AUTO_INCREMENT,
 name VARCHAR (100) NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS roof_color;
CREATE TABLE roof_color(
 id int(11) NOT NULL AUTO_INCREMENT,
 color VARCHAR (100) NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS roof;
CREATE TABLE roof(
 id int(11) NOT NULL AUTO_INCREMENT,
 type_id int(11) NOT NULL,
 color_id int (11) NOT NULL,
    PRIMARY KEY (id),
    foreign KEY (type_id)references roof_type(id),
    foreign KEY (color_id)references roof_color(id)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS skur_length;
CREATE TABLE skur_length (
  id int(11) NOT NULL AUTO_INCREMENT,
  skur_length int(11) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS skur_width;
CREATE TABLE skur_width (
  id int(11) NOT NULL AUTO_INCREMENT,
  skur_width int(11) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP table if exists beklædning;
create table beklædning (
 id int(11) NOT NULl AUTO_INCREMENT,
 beklædning_type VARCHAR(100) NOT NULL,
 PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP table if exists floor;
create table floor (
 id int(11) NOT NULl AUTO_INCREMENT,
 floor_type VARCHAR(100) NOT NULL,
 PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP table if exists wallCladding;
create table wallCladding (
 id int(11) NOT NULl AUTO_INCREMENT,
 rightSide BOOL,
 leftSide BOOL,
 backing BOOL,
 material_id int(11),
 PRIMARY KEY (id),
 FOREIGN KEY (material_id) references beklædning(id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP table if exists produkt;
create table produkt (
 produktId int(11) NOT NULl AUTO_INCREMENT,
 produktName VARCHAR(100) NOT NULL,
 PRIMARY KEY (produktId)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP table if exists produktNumber;
create table produktNumber (
id int(11) not null auto_increment,
 produktId int(11) NOT NULl,
 produktNumber int(11) NOT NULL,
 primary key(id),
 FOREIGN KEY (produktId) references produkt(produktId)
) ENGINE=InnoDB auto_increment=1 DEFAULT CHARSET=latin1;

DROP table if exists produkt_træ;
create table produkt_træ (
id int(11) not null,
 produktId int(11) NOT NULl,
 træ_længde float NOT NULL,
 træ_bredde float NOT NULL,
 træ_dypde float NOT NULL,
 meterpris FLOAT NOT NULL,
 primary key(id),
FOREIGN KEY (produktId) references produkt(produktId)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1;

DROP table if exists produkt_tagpakken;
create table produkt_tagpakken (
 id int(11) NOT NULl,
 produktId int(11) NOT NULl,
 pris float NOT NULL,
 primary key(id),
 FOREIGN KEY (produktId) references produkt(produktId)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP table if exists produkt_beslag_skruer;
create table produkt_beslag_skruer (
 id int(11) NOT NULl,
 produktId int(11) NOT NULl,
 pris FLOAT NOT NULL,
 antal int(11) not null,
 primary key(id),
 FOREIGN KEY (produktId) references produkt(produktId)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP table if exists produkter_til_carport;
create table produkter_til_carport (
 id int(11) NOT NULl auto_increment,
 produktId int(11) not null,
 kommentar varchar(255),
 PRIMARY KEY (id),
 FOREIGN KEY (produktId) references produkt(produktId)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

LOCK TABLES `produkt` WRITE;
/*!40000 ALTER TABLE `produkt` DISABLE KEYS */;
INSERT INTO `produkt` VALUES (1,'25x150 mm. trykimp. Bræt'),(2,'Færdigskåret byg-selv spær'),(3,'97x97 mm. trykimp. Stolpe'),(4,'45x195 spærtræ ubh'),(5,'45x95 Reglar ubh.'),(6,'19x100 mm. trykimp. Bræt'),(7,'25x50 mm. trykimp. Bræt'),(8,'38x73 mm. taglægte T1'),(9,'B & C Dobbelt'),(10,'B & C Rygsten sort '),(11,'B & C Toplægte holder'),(12,'B & C rygstensbeslag'),(13,'B & C tagstens bindere & nakkekroge'),(14,'universal 190 mm højre'),(15,'universal 190 mm venstre'),(16,'Stalddørsgreb 50x75'),(17,'T-hængsel 390 mm'),(18,'vinkelbeslag'),(19,'4,5 x 60 mm. Skruer 200 stk.'),(20,'5,0 x 40 mm. beslagskruer 250 stk.'),(21,'5,0 x 100 mm. skruer 100 stk.'),(22,'bræddebolt 10 x 120 mm.'),(23,'firkantskiver 40x40x11mm'),(24,'4,5 x 70 mm. Skruer 200 stk.'),(25,'4,5 x 50 mm. Skruer 350 stk.'),(26,'25x200 mm. trykimp. Brædt'),(27,'25x125mm. trykimp. Brædt');
/*!40000 ALTER TABLE `produkt` ENABLE KEYS */;
UNLOCK TABLES;

 insert into produktNumber(produktId, produktNumber) value
 (1, 54852365),
 (1, 54475869),
 (1, 54857125),
 (2, 54475861),
 (3, 54124569),
 (4, 54541259),
 (5, 54635712),
 (5, 54985214),
 (6, 54753156),
 (6, 54845621),
 (6, 54684251),
 (7, 54874526),
 (8, 54635871),
 (8, 54258369),

 (9, 21548935),
 (10, 21587412),
 (11, 21587463),
 (12, 21698214),
 (13, 21985214),

 (14, 74589632),
 (15, 74587412),
 (16, 74874125),
 (17, 74589647),
 (18, 74582514),
 (19, 74587436),
 (20, 74654321),
 (21, 74987654),
 (22, 74321654),
 (23, 74583641),
 (24, 74946135),
 (25, 74321987);

LOCK TABLES `produkt_træ` WRITE;
/*!40000 ALTER TABLE `produkt_træ` DISABLE KEYS */;
INSERT INTO `produkt_træ` VALUES (1,1,480,25,2.5,0),(2,1,600,25,2.5,0),(3,1,540,25,2.5,0),(4,2,0,15,2.5,0),(5,3,300,9.7,9.7,0),(6,4,480,19.5,4.5,0),(7,5,240,9.5,4.5,0),(8,5,360,9.5,4.5,0),(9,6,480,10,1.9,0),(10,6,240,10,1.9,0),(11,6,210,10,1.9,0),(12,7,540,5,2.5,0),(13,8,540,7.3,3.8,0),(14,8,420,7.3,3.8,0),(32,26,360,20,2.5,10),(39,27,360,12.5,2.5,11),(41,26,540,20,2.5,10),(42,27,540,12.5,2.5,11),(43,5,270,9.5,4.5,11),(44,4,600,19.5,4.5,11),(45,6,210,10,1.9,11),(46,6,540,10,1.9,11),(47,6,360,10,1.9,11);
/*!40000 ALTER TABLE `produkt_træ` ENABLE KEYS */;
UNLOCK TABLES;

 insert into produkt_tagpakken(id, produktId, pris) values
 (15, 9, 0.0),
 (16, 10, 0.0),
 (17, 11, 0.0),
 (18, 12, 0.0),
 (19, 13, 0.0);

   insert into produkt_beslag_skruer(id, produktId, pris, antal) values
 (20, 14, 0.0, 1),
 (21, 15, 0.0, 1),
 (22,16, 0.0, 1),
 (23, 17, 0.0, 1),
 (24, 18, 0.0, 1),
 (25, 19, 0.0, 200),
 (26, 20, 0.0, 250),
 (27, 21, 0.0, 100),
 (28, 22, 0.0, 1),
 (29, 23, 0.0, 1),
 (30, 24, 0.0, 200),
 (31, 25, 0.0, 350);

  insert into produkter_til_carport(produktId, kommentar) value
 (1, "Vindskeder på rejsning"),
 (1, "Sternbrædder til siderne"),
 (1, "Sternbrædder til enderne"),
 (2, "byg-selv spær (skal samles) 8 stk."),
 (3, "Stolper nedgraves 90 cm. i jord + skråstiver"),
 (4, "Remme i sider, sadles ned i stolper Carport del"),
 (4, "Remme i sider, sadles ned i stolper Skur de"),
 (5, "Løsholter i siderne af skur"),
 (5, "Løsholter i gavle af skur"),
 (6, "Vandbræt på vindskeder"),
 (6, "beklædning af gavle 1 på 2"),
 (6, "Beklædningaf skur 1 på 2"),
 (7, "til montering oven på tagfodslægte"),
 (8, "til z på bagside af dør"),
 (8, "til montering på spær, 7rækker lægter på hver skiftevis 1 hel & 1 halv lægte"),
 (8, "toplægte til montering af rygsten lægges itoplægteholder"),

 (9, "monteres på taglægter 6 rækker af 24 sten på hver side af taget"),
 (10, "monteres på toplægte med medfølgende beslag se tagstens vejledning"),
 (11, "monteres på toppen af spæret (til toplægte)"),
 (12, "Til montering af rygsten"),
 (13, "til montering af tagsten, alle ydersten + hver anden fastgøres"),

 (14, "Til montering af spær på rem"),
 (15, "Til montering af spær på rem"),
 (16, "til dør i skur"),
 (17, "til dør i skur"),
 (18, "til montering af løsholter"),
 (19, "Til montering af Stern, vindskeder, vindkryds & vandbræt"),
 (20, "Til montering af universalbeslag + toplægte"),
 (21, "til taglægter"),
 (22, "Til montering af rem på stolper"),
 (23, "Til montering af rem på stolper"),
 (24, "til montering af yderste bræt ved beklædni"),
 (25, "til montering af inderste bræt ved beklædning "),

 (26, "understernbrædder til for & bag ende"),
 (26, "understernbrædder til siderne"),
 (27, "oversternbrædder til forenden"),
 (27, "oversternbrædder til siderne"),
 (28, "vandbrædt på stern i sider"),
 (28, "vandbrædt på stern i forende"),
 (4, "Spær, monteres på rem ");

--  (33, "tagplader monteres på spær"),
--  (34, "Skruer til tagplader"),
--  (35, "Til vindkryds på spær"),
--  (36, "Til montering af rem på stolper");


insert into floor(floor_type)values("betongulv");
insert into floor(floor_type)values("trægulv");


insert into beklædning(beklædning_type)values("blokhusbrædder");
insert into beklædning(beklædning_type)values("trykimpræneret træ");
insert into beklædning(beklædning_type)values("gråimprægneret træ");
insert into beklædning(beklædning_type)values("sortmalet");
insert into beklædning(beklædning_type)values("hvidmalet");


insert into roof_color (color)values("Rød");
insert into roof_color (color)values("Teglrød");
insert into roof_color (color)values("Brun");
insert into roof_color (color)values("Sort");
insert into roof_color (color)values("Grå");

INSERT into roof_type(name)value("Betontagsten");
INSERT into roof_type(name)value("Eternittag B6");
INSERT into roof_type(name)value("Eternittag B7");

insert into roof(type_id,color_id)Values(1,1);
insert into roof(type_id,color_id)Values(1,2);
insert into roof(type_id,color_id)Values(1,3);
insert into roof(type_id,color_id)Values(1,4);
insert into roof(type_id,color_id)Values(1,5);
insert into roof(type_id,color_id)Values(2,1);
insert into roof(type_id,color_id)Values(2,2);
insert into roof(type_id,color_id)Values(2,3);
insert into roof(type_id,color_id)Values(2,4);
insert into roof(type_id,color_id)Values(2,5);
insert into roof(type_id,color_id)Values(3,1);
insert into roof(type_id,color_id)Values(3,2);
insert into roof(type_id,color_id)Values(3,3);
insert into roof(type_id,color_id)Values(3,4);
insert into roof(type_id,color_id)Values(3,5);




INSERT INTO slope(slope)VALUES(15);
INSERT INTO slope(slope)VALUES(20);
INSERT INTO slope(slope)VALUES(25);
INSERT INTO slope(slope)VALUES(30);
INSERT INTO slope(slope)VALUES(35);
INSERT INTO slope(slope)VALUES(40);

INSERT INTO height(height)VALUES(180);
INSERT INTO height(height)VALUES(190);
INSERT INTO height(height)VALUES(200);
INSERT INTO height(height)VALUES(210);
INSERT INTO height(height)VALUES(220);
INSERT INTO height(height)VALUES(230);
INSERT INTO height(height)VALUES(240);

INSERT INTO length(length)VALUES(240);
INSERT INTO length(length)VALUES(290);
INSERT INTO length(length)VALUES(340);
INSERT INTO length(length)VALUES(390);
INSERT INTO length(length)VALUES(340);
INSERT INTO length(length)VALUES(390);
INSERT INTO length(length)VALUES(440);
INSERT INTO length(length)VALUES(490);
INSERT INTO length(length)VALUES(540);
INSERT INTO length(length)VALUES(590);
INSERT INTO length(length)VALUES(640);
INSERT INTO length(length)VALUES(690);
INSERT INTO length(length)VALUES(740);

INSERT INTO width(width)VALUES(240);
INSERT INTO width(width)VALUES(280);
INSERT INTO width(width)VALUES(320);
INSERT INTO width(width)VALUES(360);
INSERT INTO width(width)VALUES(400);
INSERT INTO width(width)VALUES(440);
INSERT INTO width(width)VALUES(480);
INSERT INTO width(width)VALUES(520);
INSERT INTO width(width)VALUES(560);
INSERT INTO width(width)VALUES(600); 