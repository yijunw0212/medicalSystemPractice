# MySQL-Front 5.0  (Build 1.0)

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;


# Host: localhost    Database: wireless_db
# ------------------------------------------------------
# Server version 5.0.87-community-nt

#
# Table structure for table shop
#

DROP TABLE IF EXISTS `shop`;
CREATE TABLE `shop` (
  `Id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `type` varchar(255) default NULL,
  `money` varchar(255) default NULL,
  `zhicheng` varchar(255) default NULL,
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
INSERT INTO `shop` VALUES (1,'王医生','内科','5','主治医师');
INSERT INTO `shop` VALUES (2,'陈医生','外科','10','科室主任');
/*!40000 ALTER TABLE `shop` ENABLE KEYS */;
UNLOCK TABLES;

#
# Table structure for table tabletbl
#

DROP TABLE IF EXISTS `tabletbl`;
CREATE TABLE `tabletbl` (
  `id` int(11) NOT NULL,
  `num` varchar(255) default NULL,
  `flag` varchar(255) default NULL,
  `personNum` varchar(255) default NULL,
  `type` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `tabletbl` VALUES (1,'当归','12','当归（学名：Angelica sinensis），多年生草本植物，在中国分布于甘肃、云南、四川、青海、陕西、湖南、湖北、贵州等地，各地均有栽培。当归的根可入药，是最常用的中药之一。','中药');
INSERT INTO `tabletbl` VALUES (5,'阿莫西林胶囊','15','适用于敏感菌（不产β内酰胺酶菌株）所致的下列感染，如溶血链球菌、肺炎链球菌、葡萄球菌或流感嗜血杆菌所致中耳炎、鼻窦炎、咽炎、扁桃体炎等上呼吸道感染。大肠埃希菌、奇异变形杆菌或粪肠球菌所致的泌尿生殖道感染。皮肤软组织感染。急性支气管炎、肺炎等下呼吸道感染。急性单纯性淋病。本品尚可用于治疗伤寒、伤寒带菌者及钩端螺旋体病；阿莫西林亦可与克拉霉素、兰索拉唑三联用药根除胃、十二指肠幽门螺杆菌，降低消化道溃疡复发率。','西药');
/*!40000 ALTER TABLE `tabletbl` ENABLE KEYS */;
UNLOCK TABLES;

#
# Table structure for table usertbl
#

DROP TABLE IF EXISTS `usertbl`;
CREATE TABLE `usertbl` (
  `id` int(11) NOT NULL,
  `name` varchar(40) default NULL,
  `password` varchar(40) default NULL,
  `account` varchar(100) default NULL,
  `gender` varchar(20) default NULL,
  `permission` int(11) default NULL,
  `remark` text,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `usertbl` VALUES (1,'test','111111','test',NULL,2,NULL);
INSERT INTO `usertbl` VALUES (2,'hsx','hsx','hsx',NULL,2,NULL);
INSERT INTO `usertbl` VALUES (3,'test','123','test',NULL,2,NULL);
/*!40000 ALTER TABLE `usertbl` ENABLE KEYS */;
UNLOCK TABLES;

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
