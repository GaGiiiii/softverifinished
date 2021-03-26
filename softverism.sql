-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 26, 2021 at 08:39 PM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `softverism`
--

-- --------------------------------------------------------

--
-- Table structure for table `dnevni_raspored`
--

CREATE TABLE `dnevni_raspored` (
  `dnevni_raspored_id` bigint(20) NOT NULL,
  `datum` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dnevni_raspored`
--

INSERT INTO `dnevni_raspored` (`dnevni_raspored_id`, `datum`) VALUES
(6, '2021-03-18'),
(7, '2021-03-22'),
(10, '2223-10-22'),
(11, '2022-03-17');

-- --------------------------------------------------------

--
-- Table structure for table `film`
--

CREATE TABLE `film` (
  `film_id` bigint(20) NOT NULL,
  `naziv` varchar(100) NOT NULL,
  `zanr` varchar(100) NOT NULL,
  `trajanje` int(11) NOT NULL,
  `cena_karte` double NOT NULL,
  `reziser` varchar(100) NOT NULL,
  `glumci` varchar(100) NOT NULL,
  `opis` varchar(500) NOT NULL,
  `datum_izlaska` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `film`
--

INSERT INTO `film` (`film_id`, `naziv`, `zanr`, `trajanje`, `cena_karte`, `reziser`, `glumci`, `opis`, `datum_izlaska`) VALUES
(1, 'The Dark Knight ', 'Action, Crime, Drama', 152, 1000, 'Christopher Nolan', 'Christian Bale, Heath Ledger, Aaron Eckhart', 'When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.', '2008-06-20'),
(2, 'Aquaman', 'Action, Adventure, Fantasy', 143, 550, 'James Wan', 'Jason Momoa, Amber Heard, Willem Dafoe', 'Arthur Curry, the human-born heir to the underwater kingdom of Atlantis, goes on a quest to prevent a war between the worlds of ocean and land.', '2018-10-22'),
(3, 'Venom', 'Action, Adventure, Sci-F', 112, 650, 'Ruben Fleischer', 'Tom Hardy, Michelle Williams, Riz Ahmed', 'A failed reporter is bonded to an alien entity, one of many symbiotes who have invaded Earth. But the being takes a liking to Earth and decides to protect it', '2018-08-15'),
(4, 'The Amazing Spiderman 2', 'Action, Adventure, Sci-Fi', 144, 650, 'Marc Webb', 'Andrew Garfield, Emma Stone, Jamie Foxx', 'When New York is put under siege by Oscorp, it is up to Spider-Man to save the city he swore to protect as well as his loved ones.', '2014-05-30'),
(5, 'Deadpool', 'Action, Adventure, Comedy', 108, 550, 'Tim Miller', 'Ryan Reynolds, Morena Baccarin, T.J. Miller', 'A wisecracking mercenary gets experimented on and becomes immortal but ugly, and sets out to track down the man who ruined his looks.', '2016-02-03'),
(6, 'Avengers: Endgame', 'Action, Adventure, Drama', 181, 750, 'Anthony Russo, Joe Russo', 'Robert Downey Jr., Chris Evans, Mark Ruffalo', 'After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos actions and restore balance to the universe.', '2019-04-04');

-- --------------------------------------------------------

--
-- Table structure for table `korisnik`
--

CREATE TABLE `korisnik` (
  `id` bigint(20) NOT NULL,
  `username` varchar(150) DEFAULT NULL,
  `password` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `korisnik`
--

INSERT INTO `korisnik` (`id`, `username`, `password`) VALUES
(1, 'gagi', 'gagi');

-- --------------------------------------------------------

--
-- Table structure for table `projekcija`
--

CREATE TABLE `projekcija` (
  `projekcija_id` bigint(20) NOT NULL,
  `vreme` datetime NOT NULL,
  `film_id` bigint(20) NOT NULL,
  `sala_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `projekcija`
--

INSERT INTO `projekcija` (`projekcija_id`, `vreme`, `film_id`, `sala_id`) VALUES
(15, '1970-01-01 11:30:00', 1, 1),
(16, '1970-01-01 14:30:00', 5, 1),
(17, '1970-01-01 18:00:00', 1, 1),
(18, '1970-01-01 18:00:00', 2, 1),
(19, '1970-01-01 21:00:00', 2, 3),
(22, '1970-01-01 22:35:00', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `p_dr`
--

CREATE TABLE `p_dr` (
  `p_dr_id` bigint(20) NOT NULL,
  `projekcija_id` bigint(20) NOT NULL,
  `dnevni_raspored_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `p_dr`
--

INSERT INTO `p_dr` (`p_dr_id`, `projekcija_id`, `dnevni_raspored_id`) VALUES
(15, 15, 6),
(16, 16, 6),
(17, 17, 6),
(36, 16, 7),
(37, 17, 7),
(38, 15, 10),
(39, 16, 10),
(42, 17, 11);

-- --------------------------------------------------------

--
-- Table structure for table `sala`
--

CREATE TABLE `sala` (
  `sala_id` bigint(20) NOT NULL,
  `naziv` varchar(100) NOT NULL,
  `broj_mesta` int(11) NOT NULL,
  `vip_mesta` tinyint(1) NOT NULL,
  `klima` tinyint(1) NOT NULL,
  `has3D` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sala`
--

INSERT INTO `sala` (`sala_id`, `naziv`, `broj_mesta`, `vip_mesta`, `klima`, `has3D`) VALUES
(1, '101', 150, 0, 0, 0),
(2, '102', 180, 0, 1, 0),
(3, '103', 200, 0, 1, 0),
(4, '104', 100, 1, 1, 1),
(5, '2', 2, 1, 1, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dnevni_raspored`
--
ALTER TABLE `dnevni_raspored`
  ADD PRIMARY KEY (`dnevni_raspored_id`);

--
-- Indexes for table `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`film_id`);

--
-- Indexes for table `korisnik`
--
ALTER TABLE `korisnik`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `projekcija`
--
ALTER TABLE `projekcija`
  ADD PRIMARY KEY (`projekcija_id`),
  ADD KEY `film_id` (`film_id`),
  ADD KEY `sala_id` (`sala_id`);

--
-- Indexes for table `p_dr`
--
ALTER TABLE `p_dr`
  ADD PRIMARY KEY (`p_dr_id`),
  ADD KEY `projekcija_id` (`projekcija_id`),
  ADD KEY `p_dr_ibfk_2` (`dnevni_raspored_id`);

--
-- Indexes for table `sala`
--
ALTER TABLE `sala`
  ADD PRIMARY KEY (`sala_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dnevni_raspored`
--
ALTER TABLE `dnevni_raspored`
  MODIFY `dnevni_raspored_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `film`
--
ALTER TABLE `film`
  MODIFY `film_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `korisnik`
--
ALTER TABLE `korisnik`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `projekcija`
--
ALTER TABLE `projekcija`
  MODIFY `projekcija_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `p_dr`
--
ALTER TABLE `p_dr`
  MODIFY `p_dr_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT for table `sala`
--
ALTER TABLE `sala`
  MODIFY `sala_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `projekcija`
--
ALTER TABLE `projekcija`
  ADD CONSTRAINT `projekcija_ibfk_1` FOREIGN KEY (`film_id`) REFERENCES `film` (`film_id`),
  ADD CONSTRAINT `projekcija_ibfk_2` FOREIGN KEY (`sala_id`) REFERENCES `sala` (`sala_id`);

--
-- Constraints for table `p_dr`
--
ALTER TABLE `p_dr`
  ADD CONSTRAINT `p_dr_ibfk_1` FOREIGN KEY (`projekcija_id`) REFERENCES `projekcija` (`projekcija_id`),
  ADD CONSTRAINT `p_dr_ibfk_2` FOREIGN KEY (`dnevni_raspored_id`) REFERENCES `dnevni_raspored` (`dnevni_raspored_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
