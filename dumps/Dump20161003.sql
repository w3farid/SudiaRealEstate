CREATE DATABASE  IF NOT EXISTS `realstatedb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `realstatedb`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: realstatedb
-- ------------------------------------------------------
-- Server version	5.7.15-log

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
-- Table structure for table `contact`
--

DROP TABLE IF EXISTS `contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contact` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `mobile` varchar(45) DEFAULT NULL,
  `message` varchar(450) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact`
--

LOCK TABLES `contact` WRITE;
/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` VALUES (1,'Farid','w3farid@gmail.com','01724486878','dsfdsfdsfdsfdsfdsf'),(2,'Karim','karim@gmail.com','017248687858','sdfdsfdsf'),(3,'Karimd','karim@gmail.com','017248687858','dsfdsfds'),(4,'df','dff@dfg.mn','12252','dertyhtcfytx');
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `cust_id` int(11) NOT NULL AUTO_INCREMENT,
  `cust_name` varchar(45) DEFAULT NULL,
  `father_name` varchar(45) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `national_id` varchar(45) DEFAULT NULL,
  `contact` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flat`
--

DROP TABLE IF EXISTS `flat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `flat` (
  `flat_no` varchar(45) NOT NULL,
  `flat_name` varchar(45) DEFAULT NULL,
  `bed_room` varchar(45) DEFAULT NULL,
  `drawing_room` varchar(45) DEFAULT NULL,
  `kitchen_room` varchar(45) DEFAULT NULL,
  `wash_room` varchar(45) DEFAULT NULL,
  `atach_bath_room` varchar(45) DEFAULT NULL,
  `belcony` varchar(45) DEFAULT NULL,
  `flat_size` varchar(45) DEFAULT NULL,
  `parking` varchar(45) DEFAULT NULL,
  `flat_image` varchar(45) DEFAULT NULL,
  `room_image` varchar(45) DEFAULT NULL,
  `others_image` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`flat_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flat`
--

LOCK TABLES `flat` WRITE;
/*!40000 ALTER TABLE `flat` DISABLE KEYS */;
/*!40000 ALTER TABLE `flat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flat2`
--

DROP TABLE IF EXISTS `flat2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `flat2` (
  `flat_id` int(11) NOT NULL AUTO_INCREMENT,
  `Title` varchar(45) DEFAULT NULL,
  `location` varchar(100) DEFAULT NULL,
  `details` varchar(200) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `collection` varchar(45) DEFAULT NULL,
  `size` varchar(45) DEFAULT NULL,
  `bedrooms` int(11) DEFAULT NULL,
  `bathrooms` int(11) DEFAULT NULL,
  `image` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`flat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flat2`
--

LOCK TABLES `flat2` WRITE;
/*!40000 ALTER TABLE `flat2` DISABLE KEYS */;
INSERT INTO `flat2` VALUES (1,'Garden Resourse','Dhanmondi','4 Bed, 3 Belcony,1 Dinning, 2 Attach Bath ','Dhaka','5','45',5,3,'ima1.jpg'),(2,'Lotus  Resourse','Dhaka','5 Bed, 3 Belcony,1 Dinning, 2 Attach Bath ','Dhaka','3','20',4,4,'ima2.jpg'),(4,'Rakeen development company','Bijoy Rakeen City, Plot: 1/2, Block: D, Section: 15, Mirpur, Dhaka','1553 sq-ft. apartment available for sale in Bijoy Rakeen City. Bijoy Rakeen City has been built by Rakeen development company and is located in Mirpur, Dhaka.\r\nRakeen Development Co. (BD) Ltd. Has a','Dhaka','HBN','1231',4,2,'no-name-0490-9398-7-product.jpg');
/*!40000 ALTER TABLE `flat2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `images`
--

DROP TABLE IF EXISTS `images`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `images` (
  `img_id` int(11) NOT NULL,
  `building_image` varchar(45) DEFAULT NULL,
  `ploat_image` varchar(45) DEFAULT NULL,
  `flat_image` varchar(45) DEFAULT NULL,
  `bed_room_image` varchar(45) DEFAULT NULL,
  `kitchen_image` varchar(45) DEFAULT NULL,
  `bath_room_image` varchar(45) DEFAULT NULL,
  `drawing_room_image` varchar(45) DEFAULT NULL,
  `belcony_image` varchar(45) DEFAULT NULL,
  `parking_image` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`img_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `images`
--

LOCK TABLES `images` WRITE;
/*!40000 ALTER TABLE `images` DISABLE KEYS */;
/*!40000 ALTER TABLE `images` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location` (
  `loc_id` int(11) NOT NULL AUTO_INCREMENT,
  `loc_name` varchar(45) DEFAULT NULL,
  `road_no` varchar(45) DEFAULT NULL,
  `block` varchar(45) DEFAULT NULL,
  `house_no` varchar(45) DEFAULT NULL,
  `plot_no` varchar(45) DEFAULT NULL,
  `flat_no` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`loc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `usr_id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `image` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`usr_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,'sudia@gmail.com','123','farid.jpg');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sales`
--

DROP TABLE IF EXISTS `sales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sales` (
  `sales_id` int(11) NOT NULL,
  `custName` varchar(45) DEFAULT NULL,
  `custEmail` varchar(45) DEFAULT NULL,
  `custPassword` varchar(45) DEFAULT NULL,
  `flat_no` int(11) DEFAULT NULL,
  `flat_price` double DEFAULT NULL,
  `bank_name` varchar(45) DEFAULT NULL,
  `transaction_id` varchar(45) DEFAULT NULL,
  `paid_amount` double DEFAULT NULL,
  PRIMARY KEY (`sales_id`),
  KEY `PK_FlatNo_idx` (`flat_no`),
  CONSTRAINT `FK_Flat_No` FOREIGN KEY (`flat_no`) REFERENCES `flat2` (`flat_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sales`
--

LOCK TABLES `sales` WRITE;
/*!40000 ALTER TABLE `sales` DISABLE KEYS */;
INSERT INTO `sales` VALUES (12,'Sheikh Rasel','a@gmail.com','123',1,500000,'Islami Bank','32',500000);
/*!40000 ALTER TABLE `sales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'realstatedb'
--

--
-- Dumping routines for database 'realstatedb'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-10-03  8:49:05
