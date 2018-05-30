CREATE DATABASE  IF NOT EXISTS `carportTest`;

USE `carportTest`;

DROP TABLE IF EXISTS `itemlistTest`;
DROP TABLE IF EXISTS `ordersTest`;
DROP TABLE IF EXISTS `customerTest`;
DROP TABLE IF EXISTS `employeesTest`;
DROP TABLE IF EXISTS `predefTest`;
DROP TABLE IF EXISTS `deliveryTest`;
DROP TABLE IF EXISTS `componentsTest`;

DROP TABLE IF EXISTS `itemlist`;
DROP TABLE IF EXISTS `orders`;
DROP TABLE IF EXISTS `customer`;
DROP TABLE IF EXISTS `employees`;
DROP TABLE IF EXISTS `predef`;
DROP TABLE IF EXISTS `delivery`;
DROP TABLE IF EXISTS `components`;


CREATE TABLE carportTest.components LIKE carport.components;
CREATE TABLE carportTest.delivery LIKE carport.delivery;
CREATE TABLE carportTest.predef LIKE carport.predef;
CREATE TABLE carportTest.employees LIKE carport.employees;
CREATE TABLE carportTest.customer LIKE carport.customer;
CREATE TABLE carportTest.orders LIKE carport.orders;
CREATE TABLE carportTest.itemlist LIKE carport.itemlist;

CREATE TABLE componentsTest LIKE carportTest.components;
CREATE TABLE deliveryTest LIKE carportTest.delivery;
CREATE TABLE predefTest LIKE carportTest.predef;
CREATE TABLE employeesTest LIKE carportTest.employees;
CREATE TABLE customerTest LIKE carportTest.customer;
CREATE TABLE ordersTest LIKE carportTest.orders;
CREATE TABLE itemlistTest LIKE carportTest.itemlist;



INSERT INTO `delivery` (`id`, `email`, `phone`, `name`) VALUES ('1', 'NO DELIVERY', '0', 'NO DELIVERY');
INSERT INTO `delivery` (`id`, `email`, `phone`, `name`) VALUES ('2', 'NONE ASSIGNED', '0', 'NONE ASSIGNED');

INSERT INTO `employees` (`id`, `name`,`email`, `password`, `role`) VALUES ('1', 'NONE ASSIGNED', 'NONE ASSIGNED', 'NONE ASSIGNED', 'NONE');
insert into `customer` (`id`, `name`, `address`, `phone`, `email`) VALUES ('1', 'test', 'test', '1234', 'test');
INSERT INTO orders (customer_id, incline, roof_type, length, width, toolshed_length, toolshed_width, comment, date) VALUES (1, 0, 1, 2, 3, 4, 5, 'test', curdate());

INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('1', '25x200 mm trykimp brædt 360', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('2', '25x200 mm trykimp brædt 540', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('3', '25x125 mm trykimp brædt 360', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('4', '25x125 mm trykimp brædt 540', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('5', '38x73 mm lægte ubh 420', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('6', '45x95 mm reglar ub 240', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('7', '45x95 mm reglar ub 270', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('8', '45x95 mm reglar ub 360', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('9', '45x195 mm spærtræ ubh 480', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('10', '45x195 mm spærtræ ubh 600', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('11', '97x97 mm trykimp stolpe 300', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('12', '19x100 mm trykimp brædt	210', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('13', '19x100 mm trykimp brædt	240', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('14', '19x100 mm trykimp brædt	360', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('15', '19x100 mm trykimp brædt	480', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('16', '19x100 mm trykimp brædt	540', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('17', '25x150 mm trykimp brædt	480', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('18', '25x150 mm trykimp brædt	540', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('19', '25x150 mm trykimp brædt	600', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('20', 'færdigskåret (byg selv spær)', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('21', '25x50 mm trykimp bræt 	540', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('22', '38x73 mm taglægte TI	420', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('23', '38x73 mm taglægte TI	540', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('24', 'B&C dobbelt -s sort', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('25', 'B&C rygsten sort', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('26', 'B&C toplægter holder', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('27', 'B&C rygstensbeslag', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('28', 'B&C tagstens bindere og nakkekroge', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('29', 'Plastmo ecolite blåtonet 360', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('30', 'Plastmo ecolite blåtonet 600', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('31', 'Plastmo bundskruer 200 stk', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('32', 'Hulbånd 1x20mm 10mtr', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('33', 'Universal 190mm højre', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('34', 'Universal 190mm venstre', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('35', '4,5x60 mm skruer 200 stk', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('36', '4,0x50 mm beslagskruer 250stk', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('37', 'Bræddebolt 10x120mm', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('38', 'Firkantsskiver 40x40x11mm', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('39', '4,5x70mm skruer 400stk', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('40', '4,5x50 skruer 300', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('41', 'Stalddørsgreb 50x75', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('42', 'T hængsel 390 mm', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('43', 'Vinkelbeslag 35', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('44', '5,0x40mm beslagskruer 250stk', '20');
INSERT INTO `components` (`id`,`component_name`,`price`) VALUES ('45', '5.0x100mm skruer 100 stk', '20');



