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
-- Database: `client`
--

-- --------------------------------------------------------

--
-- Table structure for table `reservation_tbl`
--

CREATE TABLE `reservation_tbl` (
  `reservation_id` int(11) NOT NULL,
  `cus_id` int(11) NOT NULL,
  `package_id` int(11) NOT NULL,
  `room_id` int(11) NOT NULL,
  `check_in` date NOT NULL,
  `check_out` date NOT NULL,
  `member_count` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reservation_tbl`
--

INSERT INTO `reservation_tbl` (`reservation_id`, `cus_id`, `package_id`, `room_id`, `check_in`, `check_out`, `member_count`) VALUES
(1, 11, 22, 22, '2022-10-01', '2022-10-01', 22),
(3, 5, 1, 11, '2022-10-19', '2022-10-20', 3),
(4, 555, 55555, 12, '2022-11-04', '2022-11-03', 5),
(5, 555, 5, 3, '2022-10-08', '2022-10-06', 5),
(6, 5, 8, 6, '2022-10-13', '2022-10-13', 5),
(7, 55, 33, 4, '2022-10-05', '2022-10-27', 3),
(8, 22, 22, 2, '2222-02-22', '2222-02-22', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `reservation_tbl`
--
ALTER TABLE `reservation_tbl`
  ADD PRIMARY KEY (`reservation_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `reservation_tbl`
--
ALTER TABLE `reservation_tbl`
  MODIFY `reservation_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
