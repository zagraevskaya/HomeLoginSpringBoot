-- MySQL dump 10.13  Distrib 5.7.9, for Win32 (AMD64)
--
-- Host: localhost    Database: accord
-- ------------------------------------------------------
-- Server version	5.7.12-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ac_wu_dict_user_term_div`
--

DROP TABLE IF EXISTS `ac_wu_dict_user_term_div`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ac_wu_dict_user_term_div` (
  `id` int(10) NOT NULL,
  `wrk_id` int(10) DEFAULT NULL,
  `div_id` int(10) DEFAULT NULL,
  `tt` int(10) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `code_usd` varchar(9) DEFAULT NULL,
  `code_uah` varchar(9) DEFAULT NULL,
  `code_eur` varchar(9) DEFAULT NULL,
  `code_rub` varchar(9) DEFAULT NULL,
  `operator_no` int(3) DEFAULT NULL,
  `operator_fio` varchar(255) DEFAULT NULL,
  `operator_email` varchar(255) DEFAULT NULL,
  `pwd_function` varchar(1) DEFAULT NULL,
  `code_terminal` varchar(4) DEFAULT NULL,
  `info_status` varchar(255) DEFAULT NULL,
  `status_id` int(10) DEFAULT NULL,
  `term_id` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ac_wu_dict_user_term_div`
--

LOCK TABLES `ac_wu_dict_user_term_div` WRITE;
/*!40000 ALTER TABLE `ac_wu_dict_user_term_div` DISABLE KEYS */;
INSERT INTO `ac_wu_dict_user_term_div` VALUES (14,1867,208,8,'м. Дніпропетровськ','вул. Титова, 9, прим. 18','AUN472152','AUA472155','AI5472151','AO4472151',379,'PAVLOVSKA OLENA','pavlovskao@accordbank.com.ua',NULL,'A15X','+',0,5),(15,147,208,8,'м. Дніпропетровськ','вул. Титова, 9, прим. 18','AUN472152','AUA472155','AI5472151','AO4472151',258,'PRAVEDNIKOVA DARYA','pravednikova@accordbank.com.ua',NULL,'A15X','+',0,5),(16,2973,208,8,'м. Дніпропетровськ','вул. Титова, 9, прим. 18','AUN472152','AUA472155','AI5472151','AO4472151',387,'TKACHENKO SVITLANA','tkachenkos@accordbank.com.ua',NULL,'A15X','+',0,5),(17,152,210,9,'м. Одеса','вул. Академіка Глушка, 14','AUN472163','AUA472166','AI5472162','AO4472162',394,'OLGA CHORNA','chornaya@accordbank.com.ua',NULL,'A163','+',0,6),(18,2187,210,9,'м. Одеса','вул. Академіка Глушка, 14','AUN472163','AUA472166','AI5472162','AO4472162',406,'PODMAZKO OLENA','podmazko@accordbank.com.ua',NULL,'A2KW','неверный терминал в файле УФГ (А163)',0,67),(19,154,210,9,'м. Одеса','вул. Академіка Глушка, 14','AUN472163','AUA472166','AI5472162','AO4472162',378,'SOLOVYOVA NATALIYA','solovyova@accordbank.com.ua',NULL,'A163','+',0,6),(20,2308,263,10,'м.Львів','вул. Степана Бандери, 19','AUN472174','AUA472177','AI5472173','AO4472173',279,'DREBOT VASYL',NULL,NULL,'A164',NULL,0,7),(21,2992,263,10,'м.Львів','вул. Степана Бандери, 19','AUN472174','AUA472177','AI5472173','AO4472173',283,'MLYUZAN ANZHELA','mliuzan@accordbank.com.ua',NULL,'A164',NULL,0,7),(22,2447,263,10,'м.Львів','вул. Степана Бандери, 19','AUN472174','AUA472177','AI5472173','AO4472173',280,'ZDEBSKA GALYNA','zdebska@accordbank.com.ua',NULL,'A164',NULL,0,7),(23,173,287,11,'м. Кривий  Ріг','вул. Мелешкіна 22, прим. 65','AUN472185','AUA472188','AI5472184','AO4472184',388,'CHERNYAVSKA SVITLANA','chernyavskaya@accordbank.com.ua',NULL,'A16B','+',0,13),(25,1929,264,12,'м.Одеса','вул. Преображенська, 66','AUN472196','AUA472199','AI5472195','AO4472195',414,'BERDNIKOVA KRISTINA','berdnikova@accordbank.com.ua',NULL,'A16C','+',0,8),(26,1647,264,12,'м.Одеса','вул. Преображенська, 66','AUN472196','AUA472199','AI5472195','AO4472195',412,'DOLYTSKA KATERYNA','dolytska@accordbank.com.ua',NULL,'A16C','+',0,8),(27,782,264,12,'м.Одеса','вул. Преображенська, 66','AUN472196','AUA472199','AI5472195','AO4472195',404,'NIKOLAYENKO DMYTRO','nikolaenkod@accordbank.com.ua',NULL,'A16C','+',0,8),(29,89,283,14,'м. Київ','проспект 40-річчя Жовтня, 98/2','AUN472206','AUA472209','AI5472205','AO4472205',390,'CHERNYSHENKO ARTEM','chernyshenko@accordbank.com.ua',NULL,'A16K','+',0,9),(30,88,283,14,'м. Київ','проспект 40-річчя Жовтня, 98/2','AUN472206','AUA472209','AI5472205','AO4472205',273,'PASHYNA OLENA','pashina@accordbank.com.ua',NULL,'A16K','+',0,9),(31,94,343,15,'м. Одеса','вул. Стовпова, 19А','AUN472217','AUA472210','AI5472216','AO4472216',393,'DIDENKO DMYTRO','didenko@accordbank.com.ua',NULL,'A16M','+',0,17),(33,133,367,16,'м. Кременчук','вул. Київська, 24','AUN472228','AUA472221','AI5472227','AO4472227',396,'DODENKO OKSANA','dodenko@accordbank.com.ua',NULL,'A16Q','+',0,20),(34,134,367,16,'м. Кременчук','вул. Київська, 24','AUN472228','AUA472221','AI5472227','AO4472227',279,'SKRYPYNSKA NATALYA','skripinskaya@accordbank.com.ua',NULL,'A16Q','+',0,20),(36,168,284,18,'м. Київ','вул. Драгоманова, буд. 29А','AUN472240','AUA472243','AI5472249','AO4472249',304,'BENETSKA OKSANA','benetskaya@accordbank.com.ua',NULL,'A174','+',0,10),(37,826,284,18,'м. Київ','вул. Драгоманова, буд. 29А','AUN472240','AUA472243','AI5472249','AO4472249',300,'MARTYNYUK YEVGEN','martyniuk@accordbank.com.ua',NULL,'A174','+',0,10),(38,1346,284,18,'м. Київ','вул. Драгоманова, буд. 29А','AUN472240','AUA472243','AI5472249','AO4472249',309,'VINICHENKO MARIYA','vinichenko@accordbank.com.ua',NULL,'A174','+',0,10),(40,1828,289,19,'м. Запоріжжя','пр-т Леніна, 109','AUN472251','AUA472254','AI5472250','AO4472250',292,'DEYKINA OLENA','deykina@accordbank.com.ua',NULL,'A17D','+',0,16),(41,1868,405,20,'м. Олександрія','пр-т Леніна, 122В','AUN472262','AUA472265','AI5472261','AO4472261',398,'MYKYTENKO VITA','mykytenko@accordbank.com.ua',NULL,'A17O','+',0,27),(42,2914,405,20,'м. Олександрія','пр-т Леніна, 122В','AUN472262','AUA472265','AI5472261','AO4472261',399,'NAGORNYY IGOR','nahornyi@accordbank.com.ua',NULL,'A17O','+',0,27),(45,177,387,21,'м. Херсон','вул. Суворова, 30','AUN472273','AUA472276','AI5472272','AO4472272',414,'KOSTYUNINA OLGA','kostunina@accordbank.com.ua',NULL,'A17P','+',0,24),(46,2607,448,22,'м. Київ','вул. Раїси Окіпної, 10','AUN472284','AUA472287','AI5472283','AO4472283',311,'HOSTRYI YAROSLAV','hostryi@accordbank.com.ua',NULL,'A17Q','+',0,38),(48,2893,448,22,'м. Київ','вул. Раїси Окіпної, 10','AUN472284','AUA472287','AI5472283','AO4472283',312,'NIKITINA VIKTORIA','nikitinav@accordbank.com.ua',NULL,'A17Q','+',0,38),(49,2309,285,23,'м. Київ','бул. Перова, 22','AUN472295','AUA472298','AI5472294','AO4472294',422,'BALAS TETYANA','balas@accordbank.com.ua',NULL,'A17W','+',0,11),(50,1667,285,23,'м. Київ','бул. Перова, 22','AUN472295','AUA472298','AI5472294','AO4472294',418,'BEZZUBOVA LYUDMYLA','bezzubova@accordbank.com.ua',NULL,'A17W','+',0,11),(52,81,285,23,'м. Київ','бул. Перова, 22','AUN472295','AUA472298','AI5472294','AO4472294',300,'KYRYCHENKO OLENA','kirichenkoe@accordbank.com.ua',NULL,'A17W','+',0,11),(53,253,407,24,'м. Харків','вул. Героїв Праці, 28','AUN472305','AUA472308','AI5472304','AO4472304',303,'KRAVCHENKO GANNA','kravchenkoan@accordbank.com.ua',NULL,'A17Z','+',0,29),(55,844,407,24,'м. Харків','вул. Героїв Праці, 28','AUN472305','AUA472308','AI5472304','AO4472304',419,'PYLYPENKO KHRYSTYNA','pylypenko@accordbank.com.ua',NULL,'A17Z','+ разделить проблелом',0,29),(56,169,286,25,'м. Київ','вул. Вишгородська, буд. 20/1','AUN472316','AUA472319','AI5472315','AO4472315',306,'AKSYUK STANISLAV','aksiuk@accordbank.com.ua',NULL,'A187',NULL,0,12),(58,1165,286,25,'м. Київ','вул. Вишгородська, буд. 20/1','AUN472316','AUA472319','AI5472315','AO4472315',309,'SAENKO ELENA','saienko@accordbank.com.ua',NULL,'A187',NULL,0,12),(59,252,404,26,'м. Чугуїв','вул. Харківська, 137, секція \"Д\"','AUN472327','AUA472320','AI5472326','AO4472326',309,'BILORIKHA YEVGENIYA','biloriha@accordbank.com.ua',NULL,'A18F',NULL,0,26),(60,542,404,26,'м. Чугуїв','вул. Харківська, 137, секція \"Д\"','AUN472327','AUA472320','AI5472326','AO4472326',314,'MAKOVETSKA ULIYA','lukianova@accordbank.com.ua',NULL,'A18F',NULL,0,26),(63,1085,424,27,'м. Київ','вул. Маршала Малиновського, буд. 34','AUN472338','AUA472331','AI5472337','AO4472337',430,'NATALIYA MALYUK','maliuk@accordbank.com.ua',NULL,'A18K',NULL,0,30),(65,562,386,28,'м. Павлоград ','вул. Радянська, 59','AUN472349','AUA472342','AI5472348','AO4472348',435,'DEMCHUK ELENA','demchuk@accordbank.com.ua',NULL,'A197',NULL,0,23),(66,193,386,28,'м. Павлоград ','вул. Радянська, 59','AUN472349','AUA472342','AI5472348','AO4472348',433,'POLEVANOVA TATYANA','polevanova@accordbank.com.ua',NULL,'A197',NULL,0,23),(67,222,447,30,'м. Запоріжжя','вул. 40 років Радянської України будинок 57 \"В\"','AUN472350','AUA472353','AI5472359','AO4472359',318,'KORENCHUK OLGA','korenchuk@accordbank.com.ua',NULL,'A19I',NULL,0,37),(68,1767,447,30,'м. Запоріжжя','вул. 40 років Радянської України будинок 57 \"В\"','AUN472350','AUA472353','AI5472359','AO4472359',438,'MAKSYMENKO OLGA','maksymenkoo@accordbank.com.ua',NULL,'A19I',NULL,0,37),(69,1829,447,30,'м. Запоріжжя','вул. 40 років Радянської України будинок 57 \"В\"','AUN472350','AUA472353','AI5472359','AO4472359',446,'MUKHA IRYNA','mukha@accordbank.com.ua',NULL,'A19I',NULL,0,37),(70,249,447,30,'м. Запоріжжя','вул. 40 років Радянської України будинок 57 \"В\"','AUN472350','AUA472353','AI5472359','AO4472359',432,'NEPECHYY NATALIYA','nepechiy@accordbank.com.ua',NULL,'A19I',NULL,0,37),(71,250,447,30,'м. Запоріжжя','вул. 40 років Радянської України будинок 57 \"В\"','AUN472350','AUA472353','AI5472359','AO4472359',435,'SHAPOVALOVA OLGA','shapovalova@accordbank.com.ua',NULL,'A19I',NULL,0,37),(72,2831,827,31,'м. Дніпро','вул. Володимира Мономаха, 8','AUN504668','AUA504661','AI5504667','AO4504667',314,'KHARITONOV IGOR','kharytonov@accordbank.com.ua',NULL,'A23K',NULL,0,66),(74,2668,827,31,'м. Дніпро','вул. Володимира Мономаха, 8','AUN504668','AUA504661','AI5504667','AO4504667',309,'VOYKOV VALERIY','voikov@accordbank.com.ua',NULL,'A23K',NULL,0,66),(75,259,403,32,'м. Шостка','вул. К. Маркса, 39','AUN472361','AUA472364','AI5472360','AO4472360',435,'ILYENKO NATALIYA','ilenko@accordbank.com.ua',NULL,'A19N',NULL,0,25),(76,2872,403,32,'м. Шостка','вул. К. Маркса, 39','AUN472361','AUA472364','AI5472360','AO4472360',439,'PONOMARENKO LYUDMYLA','ponomarenko@accordbank.com.ua',NULL,'A19N',NULL,0,25),(77,1327,403,32,'м. Шостка','вул. К. Маркса, 39','AUN472361','AUA472364','AI5472360','AO4472360',437,'SHUMARIN SERGIY','shumaryn@accordbank.com.ua',NULL,'A19N',NULL,0,25),(78,218,425,33,'м. Гадяч','площа 50 років Жовтня 11-а','AUN472679','AUA472672','AI5472678','AO4472678',333,'OSIPOVA NATALIYA','osipova@accordbank.com.ua',NULL,'A1W6',NULL,0,31),(79,281,425,33,'м. Гадяч','площа 50 років Жовтня 11-а','AUN472679','AUA472672','AI5472678','AO4472678',357,'SHEVCHENKO OKSANA','shevchenkoo@accordbank.com.ua',NULL,'A1W6',NULL,0,31),(80,923,426,34,'м. Одеса','вул. Генерала Петрова, 37/43','AUN472372','AUA472375','AI5472371','AO4472371',508,'ABYAMETOV ESKANDER','abliametov@accordbank.com.ua',NULL,'A19Z',NULL,0,32),(81,924,426,34,'м. Одеса','вул. Генерала Петрова, 37/43','AUN472372','AUA472375','AI5472371','AO4472371',506,'CHOLAK LYUDMYLA','cholak@accordbank.com.ua',NULL,'A19Z',NULL,0,32),(82,2409,426,34,'м. Одеса','вул. Генерала Петрова, 37/43','AUN472372','AUA472375','AI5472371','AO4472371',513,'DYADKO TETYANA','diadko@accordbank.com.ua',NULL,'A19Z',NULL,1,32),(83,1947,426,34,'м. Одеса','вул. Генерала Петрова, 37/43','AUN472372','AUA472375','AI5472371','AO4472371',509,'KUMANOV DMYTRO','kumanov@accordbank.com.ua',NULL,'A19Z',NULL,0,32),(84,925,426,34,'м. Одеса','вул. Генерала Петрова, 37/43','AUN472372','AUA472375','AI5472371','AO4472371',505,'PACHESNA OLENA','pachesna@accordbank.com.ua',NULL,'A19Z',NULL,0,32),(85,101,826,35,'м. Васильків','вул. Володимирська, 1','AUN504866','AUA504672','AI5504865','AO4504865',306,'IRYNA VISLOUKH','visloukh@accordbank.com.ua',NULL,'A3U1',NULL,0,65),(86,2693,825,36,'м. Одеса','вул. Князівська, 32','AUN504855','AUA504858','AI5504854','AO4504854',325,'POPOVYCH OLENA','popovych@accordbank.com.ua',NULL,'A3SM',NULL,0,64),(87,2667,825,36,'м. Одеса','вул. Князівська, 32','AUN504855','AUA504858','AI5504854','AO4504854',320,'SHALOTA ROMAN','shalota@accordbank.com.ua',NULL,'A3SM',NULL,0,64),(88,742,365,37,'м. Біла Церква','вул. Леваневського, 83','AUN472383','AUA472386','AI5472382','AO4472382',445,'LOMAKO ROMAN','lomako@accordbank.com.ua',NULL,'A1IX',NULL,0,19),(89,342,365,37,'м. Біла Церква','вул. Леваневського, 83','AUN472383','AUA472386','AI5472382','AO4472382',442,'Svitlana Podorvan','podorvan@accordbank.com.ua',NULL,'A1IX',NULL,0,19),(90,2288,363,38,'м. Київ','проспект Перемоги, 73/1','AUN472394','AUA472397','AI5472393','AO4472393',459,'BELINSKYY KONSTANTYN','belinskyi@accordbank.com.ua',NULL,'A1IY',NULL,0,18),(91,2408,363,38,'м. Київ','проспект Перемоги, 73/1','AUN472394','AUA472397','AI5472393','AO4472393',458,'KABANCHUK OLENA','kabanchuk@accordbank.com.ua',NULL,'A1IY',NULL,0,18),(96,1569,363,38,'м. Київ','проспект Перемоги, 73/1','AUN472394','AUA472397','AI5472393','AO4472393',449,'RUBAN YULIYA','ruban@accordbank.com.ua',NULL,'A1IY',NULL,0,18),(97,1487,288,39,'м. Кривий Ріг','пр. 200-річчя Кривого Рогу 3, прим. 194','AUN472404','AUA472407','AI5472403','AO4472403',447,'MARCHENKO INNA','marchenko@accordbank.com.ua',NULL,'A1J1',NULL,0,15),(100,182,385,40,'м. Чорноморськ','вул. Олександрійська, 2/3-Н','AUN472415','AUA472418','AI5472414','AO4472414',447,'BORODINA IRYNA','borodina@accordbank.com.ua',NULL,'A26W','A1KB ->',0,22),(101,180,385,40,'м. Чорноморськ','вул. Олександрійська, 2/3-Н','AUN472415','AUA472418','AI5472414','AO4472414',449,'DANILINA ALLA','danilina@accordbank.com.ua',NULL,'A1KB',NULL,0,21),(102,3033,385,40,'м. Чорноморськ','вул. Олександрійська, 2/3-Н','AUN472415','AUA472418','AI5472414','AO4472414',455,'SEVRYUK TETYANA','sevriuk@accordbank.com.ua',NULL,'A1KB',NULL,0,21),(104,231,477,41,'м. Житомир','вул. Московська, 7/20','AUN472680','AUA472683','AI5472689','AO4472689',361,'MOSIYCHUK NATALIYA','mosiychuk@accordbank.com.ua',NULL,'A1W9',NULL,0,42),(105,232,477,41,'м. Житомир','вул. Московська, 7/20','AUN472680','AUA472683','AI5472689','AO4472689',337,'PETUKH IRYNA','petuh@accordbank.com.ua',NULL,'A1W9',NULL,0,42),(106,2994,784,42,'м. Чернівці','вул. Головна, 61-63','AUN502853','AUA502856','AI5502852','AO4502852',237,'GLADCHUK DIANA','hladchuk@accordbank.com.ua',NULL,'A2B2',NULL,0,62),(108,983,446,43,'м. Лубни','проспект Володимирський, 27/49','AUN472426','AUA472429','AI5472425','AO4472425',452,'KOVALENKO ROMAN','kovalenkor@accordbank.com.ua',NULL,'A1KO',NULL,0,36),(110,317,446,43,'м. Лубни','проспект Володимирський, 27/49','AUN472426','AUA472429','AI5472425','AO4472425',450,'RUDENKO KATERYNA','rudenko@accordbank.com.ua',NULL,'A1KO',NULL,0,36);
/*!40000 ALTER TABLE `ac_wu_dict_user_term_div` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (10),(10);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `param_users`
--

DROP TABLE IF EXISTS `param_users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `param_users` (
  `id` bigint(20) NOT NULL,
  `created_date` datetime DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `name_param` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `value_param` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `param_users`
--

LOCK TABLES `param_users` WRITE;
/*!40000 ALTER TABLE `param_users` DISABLE KEYS */;
INSERT INTO `param_users` VALUES (1,'2012-01-20 18:00:00','sanya@gmail.com','Attribute_1',1,'Київ'),(2,'2012-01-20 18:00:00','sanya@gmail.com','Attribute_2',1,'CHO123'),(23,'2012-12-20 01:08:00','sanya@gmail.com','Attribute_6',1,'Операціонист');
/*!40000 ALTER TABLE `param_users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `role_id` int(11) NOT NULL,
  `role` varchar(255) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'ADMIN'),(2,'WU'),(3,'????????????'),(4,'????????????'),(5,'????????????'),(6,'????????????');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `active` int(11) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (9,1,'sanya@gmail.com','sanya','sanya','$2a$10$v0kDW35R5lvhXZ/IXxzZ3.ocY.np3ix2keJqhtishj7M4/4fmTUf2'),(2,1,'1@gmail.com','1','1','$2a$10$pixowTASLP0E/tTYPIT8uOu8fZZJQbWqw3hSvaLGEtxtTYauAlON.'),(3,1,'nata@gmail.com','nata','nata','$2a$10$uys156ddlV48KHnhXnhD4OijOoBCYJE8Bmcwk5pDult/Ok8lhHg2W'),(4,1,'test@gmail.com','test','test','123456'),(5,1,'nata1@gmail.com','nata','nata','123456'),(6,1,'nata2@gmail.com','nata2','nata2','123456'),(7,1,'nata3@gmail.com','nata3','nata3','$2a$10$MRD4XhpB163sAACrnHYE2eOr.iOHg67Ccouw9oGzLhRAtFQz0uGsK'),(8,1,'nata4@gmail.com','naat4','nata4','$2a$10$sldt1zjDaMEuR38vlGTjAeOZ/hzb6Sm5wz.pWqLYTyxBW9wGuFZ6S');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_role` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `FKa68196081fvovjhkek5m97n3y` (`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` VALUES (8,1),(9,1);
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wu_request`
--

DROP TABLE IF EXISTS `wu_request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wu_request` (
  `id` int(11) NOT NULL,
  `amount` double DEFAULT NULL,
  `currency` varchar(3) DEFAULT NULL,
  `amount_send` double DEFAULT NULL,
  `cooment` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_user_idx` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wu_request`
--

LOCK TABLES `wu_request` WRITE;
/*!40000 ALTER TABLE `wu_request` DISABLE KEYS */;
/*!40000 ALTER TABLE `wu_request` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-27 10:05:22
