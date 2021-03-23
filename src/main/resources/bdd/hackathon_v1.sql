-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: hackathon
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `utilisateur` (
  `idUtilisateur` int NOT NULL AUTO_INCREMENT,
  `loginUtilisateur` varchar(45) NOT NULL,
  `passwordUtilisateur` varchar(45) NOT NULL,
  PRIMARY KEY (`idUtilisateur`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utilisateur`
--

LOCK TABLES `utilisateur` WRITE;
/*!40000 ALTER TABLE `utilisateur` DISABLE KEYS */;
/*!40000 ALTER TABLE `utilisateur` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorie`
--

DROP TABLE IF EXISTS `categorie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorie` (
  `idCategorie` int NOT NULL AUTO_INCREMENT,
  `nomCategorie` varchar(45) NOT NULL,
  `Utilisateur_idUtilisateur` int NOT NULL,
  PRIMARY KEY (`idCategorie`,`Utilisateur_idUtilisateur`),
  KEY `fk_Categorie_Utilisateur1_idx` (`Utilisateur_idUtilisateur`),
  CONSTRAINT `fk_Categorie_Utilisateur1` FOREIGN KEY (`Utilisateur_idUtilisateur`) REFERENCES `utilisateur` (`idUtilisateur`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorie`
--

LOCK TABLES `categorie` WRITE;
/*!40000 ALTER TABLE `categorie` DISABLE KEYS */;
/*!40000 ALTER TABLE `categorie` ENABLE KEYS */;
UNLOCK TABLES;




--
-- Table structure for table `champ`
--

DROP TABLE IF EXISTS `champ`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `champ` (
  `idChamp` int NOT NULL AUTO_INCREMENT,
  `nomChamp` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  `idUtilisateur` int NOT NULL,
  `Categorie_idCategorie` int NOT NULL,
  PRIMARY KEY (`idChamp`,`Categorie_idCategorie`),
  KEY `fk_Champ_Categorie1_idx` (`Categorie_idCategorie`),
  CONSTRAINT `fk_Champ_Categorie1` FOREIGN KEY (`Categorie_idCategorie`) REFERENCES `categorie` (`idCategorie`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `champ`
--

LOCK TABLES `champ` WRITE;
/*!40000 ALTER TABLE `champ` DISABLE KEYS */;
/*!40000 ALTER TABLE `champ` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `saisie`
--

DROP TABLE IF EXISTS `saisie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `saisie` (
  `idSaisie` int NOT NULL,
  `dateSaisie` datetime NOT NULL,
  `valeurSaisie` varchar(255) NOT NULL,
  `idUtilisateur` int NOT NULL,
  `idCategorie` int NOT NULL,
  `Champ_idChamp` int NOT NULL,
  PRIMARY KEY (`idSaisie`,`Champ_idChamp`),
  KEY `fk_Saisie_Champ_idx` (`Champ_idChamp`),
  CONSTRAINT `fk_Saisie_Champ` FOREIGN KEY (`Champ_idChamp`) REFERENCES `champ` (`idChamp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `saisie`
--

LOCK TABLES `saisie` WRITE;
/*!40000 ALTER TABLE `saisie` DISABLE KEYS */;
/*!40000 ALTER TABLE `saisie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'hackathon'
--

--
-- Dumping routines for database 'hackathon'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-23 11:33:50
