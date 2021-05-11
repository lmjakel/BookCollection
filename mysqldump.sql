-- MySQL dump 10.13  Distrib 8.0.22, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: BookCollection
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `author`
--

DROP TABLE IF EXISTS `author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `author` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `author_id_uindex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `author`
--

LOCK TABLES `author` WRITE;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
INSERT INTO `author` VALUES (1,'Sarah J. Maas '),(2,'Cassandra Clare'),(3,'Stephen King'),(4,'Brandon Sanderson'),(5,'Nora Roberts'),(14,'Sarah J. Maas'),(15,'Morgan Deane'),(16,'Leigh Bardugo'),(17,'Victoria Aveyard');
/*!40000 ALTER TABLE `author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `isbn` varchar(15) NOT NULL,
  `user_id` int NOT NULL,
  `author_id` int NOT NULL,
  `genre_id` int NOT NULL,
  `notes` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `book_id_uindex` (`id`),
  KEY `book_author_id_fk` (`author_id`),
  KEY `book_genre_id_fk` (`genre_id`),
  KEY `book_user_id_fk` (`user_id`),
  CONSTRAINT `book_author_id_fk` FOREIGN KEY (`author_id`) REFERENCES `author` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `book_genre_id_fk` FOREIGN KEY (`genre_id`) REFERENCES `genre` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `book_user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,'A Court Of Thorns and Roses','9781408857861',1,1,1,'Fantastic book, the mystery and romance is perfectly combined! Rhys is the best! Yay for night court! The 3rd book in this series is my favorite'),(3,'Dark Witch','9780425259856',1,5,5,NULL),(8,'Throne of glass','9781599906959',1,14,1,''),(9,'Throne of glass','9781599906959',1,14,1,''),(10,'Decisive battles in Chinese history','9781594162893',2,15,12,''),(11,'Crescent City : house of earth and blood','9781635574043',1,14,1,'woooooo'),(12,'Throne of glass','9781599906959',1,14,6,'yay!'),(13,'The Grisha : Shadow and Bone','9781780622262',1,16,1,'book 1 of the first series'),(14,'Glass Sword (Red Queen #2)','9780062310668',1,17,1,'Book 2'),(15,'Red Queen','9780062310637',1,17,1,'Book1'),(16,'King\'s Cage (Red Queen)','9780062310699',1,17,1,'Book3\r\n'),(17,'War Storm (Red Queen)','9781409175995',1,17,1,''),(18,'City of Bones: 10th Anniversary Edition (The Mortal Instruments)','9781534406254',1,2,1,''),(19,'City Of Ashes Book Two','9780606106405',1,2,1,'The Mortal Instruments  Book 2'),(21,'City Of Glass','9780606107235',1,2,1,'Book3 '),(22,'City Of Fallen Angels','9780606269087',1,2,1,'Book4'),(23,'City of lost souls','9781442416864',1,2,1,'The Mortal Instruments book 5'),(24,'City Of Heavenly Fire','9780606371384',1,2,1,'The Mortal Instruments \r\nbook 6 '),(25,'Clockwork Angel','9780606232869',1,2,1,'The Infernal Devices Book 1'),(26,'Clockwork Prince                            Infernal Devices','9781416975892',1,2,1,'The Infernal Devices Book 2'),(27,'Clockwork Princess Graphic Novel','9780606353403',1,2,1,''),(28,'Chain of gold','9781481431873',1,2,1,'The Last Hours Book 1'),(29,'The Last Hours','9781406358100',1,2,1,'The Last Hours Book 2'),(30,'Lady Midnight','9783442314225',1,2,1,'The Dark Artifices Book 1'),(31,'Lord of Shadows','9781442468405',1,2,1,'The Dark Artifices Book 2'),(32,'Queen of air and darkness','9781442468436',1,2,1,'The Dark Artifices Book 3');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genre`
--

DROP TABLE IF EXISTS `genre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `genre` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `genre_id_uindex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genre`
--

LOCK TABLES `genre` WRITE;
/*!40000 ALTER TABLE `genre` DISABLE KEYS */;
INSERT INTO `genre` VALUES (1,'Young Adult'),(2,'Science Fiction'),(3,'History'),(4,'Mystery'),(5,'Romance'),(6,'Action'),(7,'Adventure'),(8,'Children'),(9,'Fantasy'),(10,'Historical Fiction'),(11,'Non Fiction'),(12,'Other'),(13,'Thriller'),(14,'Western');
/*!40000 ALTER TABLE `genre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `role_name` varchar(25) NOT NULL,
  `user_name` varchar(15) NOT NULL,
  `user_id` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `role_id_uindex` (`id`),
  KEY `role_user_user_id_fk` (`user_id`),
  CONSTRAINT `role_user_user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (7,'admin','ljakel',1),(8,'basic_user','eajakel',6),(9,'basic_user','lmjakel',7),(10,'basic_user','bwalters',8),(11,'basic_user','mwilson',9),(12,'basic_user','fjakel',10),(13,'basic_user','dkabler',11);
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `user_name` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_id_uindex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'LeeAnn','Jakel','ljakel','password','email@something.com'),(2,'Max','Jakel','mjakel','password','email@something.com'),(3,'Lisa','Andritsch','lisa','password','email@something.com'),(4,'Anthony','Rice','ricerocks','password','email@something.com'),(5,'Paula','Waite','pwaite','password','email@something.com'),(6,'Erin','Jakel','eajakel','March3rd','email@email.com'),(7,'LeeAnn','Jakel','lmjakel','password2','lmkabler@madisoncollege.edu'),(8,'Beckam','Walters','bwalters','password','email@email.com'),(9,'Megan ','Wilson','mwilson','java','email@email.com'),(10,'Faelynn','Jakel','fjakel','puppy','puppies@pup.com'),(11,'Deb','Kabler','dkabler','gramma','kabler@emails.com');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-11 17:10:33
