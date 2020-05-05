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

DROP table if exists produkt_træ;
create table produkt_træ (
 id int(11) NOT NULl AUTO_INCREMENT,
 træ_type VARCHAR(100) NOT NULL,
 træ_længde int(11) NOT NULL,
 træ_bredde int(11) NOT NULL,
 træ_højde int(11) NOT NULL,
 meterpris FLOAT NOT NULL,
 produktnummer INT(11) NOT NULL,
 PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP table if exists produkt_tagpakken;
create table produkt_tagpakken (
 id int(11) NOT NULl AUTO_INCREMENT,
 tag_produkt VARCHAR(100) NOT NULL,
 pris VARCHAR(100) NOT NULL,
 produktnummer INT(11) NOT NULL,
 PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP table if exists produkt_beslag_skruer;
create table produkt_beslag_skruer (
 id int(11) NOT NULl AUTO_INCREMENT,
 produkt VARCHAR(100) NOT NULL,
 pris FLOAT NOT NULL,
 produktnummer INT(11) NOT NULL,
 PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

insert into produkt_træ(træ_type, træ_længde, træ_bredde,
 træ_højde, meterpris, produktnummer) values("Vindskeder på rejsning",480, 25, 2.5, 0.0, 54852365);
 insert into produkt_træ(træ_type, træ_længde, træ_bredde,
 træ_højde, meterpris, produktnummer) values("Sternbrædder til carport siderne",600, 25, 2.5, 0.0, 54475869);
insert into produkt_træ(træ_type, træ_længde, træ_bredde,
 træ_højde, meterpris, produktnummer) values("Sternbrædder til skur siderne",540, 25, 2.5, 0.0, 54857125);
insert into produkt_træ(træ_type, træ_længde, træ_bredde,
 træ_højde, meterpris, produktnummer) values("Færdigskåret byg-selv spær",0, 15, 2.5, 0.0, 54475869);
 insert into produkt_træ(træ_type, træ_længde, træ_bredde,
 træ_højde, meterpris, produktnummer) values("Stolper",300, 9.7, 9.7, 0.0, 54124569);
 insert into produkt_træ(træ_type, træ_længde, træ_bredde,
 træ_højde, meterpris, produktnummer) values("Spærtræ carport",480, 19.5, 4.5, 0.0, 54541258);
  insert into produkt_træ(træ_type, træ_længde, træ_bredde,
 træ_højde, meterpris, produktnummer) values("Spærtræ skur",480, 19.5, 4.5, 0.0, 54456325);
  insert into produkt_træ(træ_type, træ_længde, træ_bredde,
 træ_højde, meterpris, produktnummer) values("Løsholter i siderne skur",240, 9.5, 4.5, 0.0, 54635712);
  insert into produkt_træ(træ_type, træ_længde, træ_bredde,
 træ_højde, meterpris, produktnummer) values("Løhholter i galv skur",360, 9.5, 4.5, 0.0, 54985214);
  insert into produkt_træ(træ_type, træ_længde, træ_bredde,
 træ_højde, meterpris, produktnummer) values("Vand bræt vindskeder",480, 10, 1.9, 0.0, 54753156);
  insert into produkt_træ(træ_type, træ_længde, træ_bredde,
 træ_højde, meterpris, produktnummer) values("Beklædning af gavl",240, 10, 1.9, 0.0, 54845621);
  insert into produkt_træ(træ_type, træ_længde, træ_bredde,
 træ_højde, meterpris, produktnummer) values("Beklædning af skur",210, 10, 1.9, 0.0, 54684251);
 insert into produkt_træ(træ_type, træ_længde, træ_bredde,
 træ_højde, meterpris, produktnummer) values("Bræt til tagfodslægte",540, 5, 2.5, 0.0, 54874526);
 insert into produkt_træ(træ_type, træ_længde, træ_bredde,
 træ_højde, meterpris, produktnummer) values("Taglægte z bagside af dør",540, 7.3, 3.8, 0.0, 54635874);
 insert into produkt_træ(træ_type, træ_længde, træ_bredde,
 træ_højde, meterpris, produktnummer) values("Taglægte på spær",540, 7.3, 3.8, 0.0, 54425893);
 insert into produkt_træ(træ_type, træ_længde, træ_bredde,
 træ_højde, meterpris, produktnummer) values("Taglægte rygsten",420, 7.3, 3.8, 0.0, 54258369);

 insert into produkt_tagpakken(tag_produkt, pris, produktnummer) values("B&C dobbelt -s sort", 0.0, 21548935);
 insert into produkt_tagpakken(tag_produkt, pris, produktnummer) values("B&C Rygsten sort", 0.0, 21587412);
 insert into produkt_tagpakken(tag_produkt, pris, produktnummer) values("B&C Toplægte holder", 0.0, 21587463);
 insert into produkt_tagpakken(tag_produkt, pris, produktnummer) values("B&C rygstensbeslag", 0.0, 21698214);
 insert into produkt_tagpakken(tag_produkt, pris, produktnummer) values("B&C tagstens bindere & nakkekroge", 0.0, 21985214);

 insert into produkt_beslag_skruer(produkt, pris, produktnummer) values("Universal 190mm højre", 0.0, 74589632);
 insert into produkt_beslag_skruer(produkt, pris, produktnummer) values("Universal 190mm venstre", 0.0, 74587412);
 insert into produkt_beslag_skruer(produkt, pris, produktnummer) values("Stalddørsgreb 50x75", 0.0, 74874125);
 insert into produkt_beslag_skruer(produkt, pris, produktnummer) values("T-hængsel 390mm", 0.0, 74589647);
 insert into produkt_beslag_skruer(produkt, pris, produktnummer) values("Vinkelslag", 0.0, 74582514);
 insert into produkt_beslag_skruer(produkt, pris, produktnummer) values("4.5 x 60mm skruer 200stk", 0.0, 74587436);
 insert into produkt_beslag_skruer(produkt, pris, produktnummer) values("5.0 x 40mm beslagskruer 250stk", 0.0, 74654321);
 insert into produkt_beslag_skruer(produkt, pris, produktnummer) values("5.0 x 100mm skruer 100stk", 0.0, 74987654);
 insert into produkt_beslag_skruer(produkt, pris, produktnummer) values("Bræddebolt 10 x 120mm", 0.0, 74321654);
 insert into produkt_beslag_skruer(produkt, pris, produktnummer) values("Firkantskiver 40x40x11mm", 0.0, 74583641);
 insert into produkt_beslag_skruer(produkt, pris, produktnummer) values("4.5 x 70mm skruer 200stk", 0.0, 74946135);
 insert into produkt_beslag_skruer(produkt, pris, produktnummer) values("4.5 x 50mm skruer 350stk", 0.0, 74321987);



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