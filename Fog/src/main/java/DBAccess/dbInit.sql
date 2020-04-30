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