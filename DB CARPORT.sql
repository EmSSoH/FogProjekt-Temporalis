CREATE DATABASE  IF NOT EXISTS `carport`;

USE `carport`;

DROP TABLE IF EXISTS `itemlist`;
DROP TABLE IF EXISTS `orders`;
DROP TABLE IF EXISTS `customer`;
DROP TABLE IF EXISTS `employees`;
DROP TABLE IF EXISTS `predef`;
DROP TABLE IF EXISTS `delivery`;
DROP TABLE IF EXISTS `components`;


CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `phone` int(11) NOT NULL,
  `email` varchar(90) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

CREATE TABLE `employees` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `email` varchar(90) NOT NULL,
  `password` varchar(45) NOT NULL,
  `role` varchar(20) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

CREATE TABLE `delivery` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(90) NOT NULL,
  `phone` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

CREATE TABLE `orders`(
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` int(11) NOT NULL DEFAULT '1',
  `customer_id` int(11) NOT NULL,
  `incline` int(11) NOT NULL,
  `roof_type` int(11) NOT NULL,
  `length` int(11) NOT NULL,
  `width` int(11) NOT NULL,
  `toolshed_length` int(11) NOT NULL,
  `toolshed_width` int(11) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '0',
  `price` int(11) NOT NULL DEFAULT '0',
  `delivery` int(11) NOT NULL DEFAULT '2',
  `comment` varchar(45),
  `date` date NOT NULL,
  FOREIGN KEY (`delivery`) REFERENCES `delivery`(`id`),
  FOREIGN KEY (`customer_id`) REFERENCES `customer`(`id`),
  FOREIGN KEY (`employee_id`) REFERENCES `employees`(`id`),
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

CREATE TABLE `predef` (
  `predef_id` int(11) NOT NULL AUTO_INCREMENT,
  `incline` int(11) NOT NULL,
  `roof_type` int(11) NOT NULL,
  `length` int(11) NOT NULL,
  `width` int(11) NOT NULL,
  `height` int(11) NOT NULL,
  `toolshed_length` int(11) NOT NULL,
  `toolshed_width` int(11) NOT NULL,
  `toolshed_height` int(11) NOT NULL,
  PRIMARY KEY (`predef_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

CREATE TABLE `components` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `component_name` varchar(45) NOT NULL,
  `price` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

CREATE TABLE `itemlist` (
  `amount` int(11) NOT NULL,
  `order_id` int(11) NOT NULL,
  `component_id` int(11) NOT NULL,
  FOREIGN KEY (`order_id`) REFERENCES `orders`(`order_id`),
  FOREIGN KEY (`component_id`) REFERENCES `components`(`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;


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



