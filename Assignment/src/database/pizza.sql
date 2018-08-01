-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 01, 2018 at 07:12 PM
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
  `toppings` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pizza_orders`
--

INSERT INTO `pizza_orders` (`Order_id`, `UserName`, `Phoneno`, `pizza_type`, `pizza_size`, `toppings`) VALUES
(6, 'Biplap', 9843509176, 'Thin_Crust', 'Large', ''),
(10, 'dasd', 1234567890, 'Pan', 'Medium', ''),
(11, 'Biplap BHattarai', 9843509176, 'Thin_Crust', 'Medium', 'Extra Cheese');

-- --------------------------------------------------------

--
-- Table structure for table `userdetails`
--

CREATE TABLE `userdetails` (
  `userid` bigint(20) NOT NULL,
  `username` varchar(60) NOT NULL,
  `password` varchar(100) NOT NULL,
  `firstName` varchar(60) NOT NULL,
  `lastName` varchar(60) NOT NULL,
  `Gender` enum('Male','Female','Others') NOT NULL,
  `phoneNo` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userdetails`
--

INSERT INTO `userdetails` (`userid`, `username`, `password`, `firstName`, `lastName`, `Gender`, `phoneNo`) VALUES
(3, 'bhattaraib58', 'E10ADC3949BA59ABBE56E057F20F883E', 'Biplap', 'Bhattarai', 'Male', 9843509176);

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
-- Indexes for table `userdetails`
--
ALTER TABLE `userdetails`
  ADD PRIMARY KEY (`userid`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pizza_orders`
--
ALTER TABLE `pizza_orders`
  MODIFY `Order_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `userdetails`
--
ALTER TABLE `userdetails`
  MODIFY `userid` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
