-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 29, 2022 at 08:18 AM
-- Server version: 5.5.60
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `package_hotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `package_tbl`
--

CREATE TABLE `package_tbl` (
  `packageID` int(11) NOT NULL,
  `package_type` varchar(50) NOT NULL,
  `price` double NOT NULL,
  `activity` varchar(100) NOT NULL,
  `no_of_people` varchar(100) NOT NULL,
  `about_package` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `package_tbl`
--

INSERT INTO `package_tbl` (`packageID`, `package_type`, `price`, `activity`, `no_of_people`, `about_package`) VALUES
(2, 'Event', 4564, 'sdfsfdgg', '34', 'sdfssdfsfsfsdfgd'),
(3, 'Honeymoon', 10000, 'aaaaaaaaaa', '2', 'aaaaaaaaaaaaaaaaaaaaaa'),
(4, 'Dayout', 5000, '2', '5', 'Package Includes: Lunch buffet, Evening snack & tea'),
(5, 'Dayout', 5000, '2', '5', 'Package Includes: Lunch buffet, Evening snack & tea');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `package_tbl`
--
ALTER TABLE `package_tbl`
  ADD PRIMARY KEY (`packageID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `package_tbl`
--
ALTER TABLE `package_tbl`
  MODIFY `packageID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
