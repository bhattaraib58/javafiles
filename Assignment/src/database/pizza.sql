-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 31, 2018 at 07:03 PM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pizza`
--

-- --------------------------------------------------------

--
-- Table structure for table `pizza_orders`
--

CREATE TABLE `pizza_orders` (
  `Order_id` bigint(20) NOT NULL,
  `UserName` varchar(45) NOT NULL,
  `Phoneno` bigint(20) DEFAULT NULL,
  `pizza_type` enum('Thick_Crust','Thin_Crust','Pan') NOT NULL,
  `pizza_size` enum('Small','Medium','Large') NOT NULL,
  `topping_Extracheese` bit(1) DEFAULT NULL,
  `topping_salami` bit(1) DEFAULT NULL,
  `topping_sausage` bit(1) DEFAULT NULL,
  `topping_pepproni` bit(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pizza_orders`
--

INSERT INTO `pizza_orders` (`Order_id`, `UserName`, `Phoneno`, `pizza_type`, `pizza_size`, `topping_Extracheese`, `topping_salami`, `topping_sausage`, `topping_pepproni`) VALUES
(6, 'Biplap', 9843509176, 'Thin_Crust', 'Large', b'1', b'0', b'1', b'0'),
(10, 'dasd', 1234567890, 'Pan', 'Medium', b'0', b'1', b'0', b'1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pizza_orders`
--
ALTER TABLE `pizza_orders`
  ADD PRIMARY KEY (`Order_id`),
  ADD UNIQUE KEY `UserName` (`UserName`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pizza_orders`
--
ALTER TABLE `pizza_orders`
  MODIFY `Order_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
