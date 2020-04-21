-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 07, 2019 at 09:02 AM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_info`
--

CREATE TABLE `admin_info` (
  `username` varchar(25) NOT NULL,
  `password` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_info`
--

INSERT INTO `admin_info` (`username`, `password`) VALUES
('admin', 'admin'),
('includehelp', 'includehelp');

-- --------------------------------------------------------

--
-- Table structure for table `apn_info`
--

CREATE TABLE `apn_info` (
  `pname` varchar(35) NOT NULL,
  `dname` varchar(20) NOT NULL,
  `spec` varchar(20) NOT NULL,
  `apdate` date NOT NULL,
  `aptime` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `apn_info`
--

INSERT INTO `apn_info` (`pname`, `dname`, `spec`, `apdate`, `aptime`) VALUES
('Tavan Champaneri', 'Doc1', 'Basic Treatment', '2019-08-13', '16:11:09'),
('Madhav', 'Doc1', 'Brain surgery', '2019-10-11', '11:59:49'),
('Tavan', 'Doc1', 'Brain surgery', '2019-11-17', '11:59:49');

-- --------------------------------------------------------

--
-- Table structure for table `doc_info`
--

CREATE TABLE `doc_info` (
  `username` varchar(25) NOT NULL,
  `dname` varchar(20) DEFAULT NULL,
  `dspec` varchar(20) DEFAULT NULL,
  `psswd` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doc_info`
--

INSERT INTO `doc_info` (`username`, `dname`, `dspec`, `psswd`) VALUES
('doc1', 'Doc1', 'Basic', '12345'),
('nilesh17', 'Dr, Nilesh Gopani', 'Heart Specialist', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `patients_info`
--

CREATE TABLE `patients_info` (
  `name` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `contact_no` varchar(10) DEFAULT NULL,
  `street` varchar(50) DEFAULT NULL,
  `locality` varchar(20) DEFAULT NULL,
  `aadhar` varchar(10) NOT NULL,
  `state` varchar(20) DEFAULT NULL,
  `country` varchar(20) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patients_info`
--

INSERT INTO `patients_info` (`name`, `email`, `contact_no`, `street`, `locality`, `aadhar`, `state`, `country`, `password`) VALUES
('Tavan', 'tavanchampaneri@yahoo.com', '9898380374', 'Surendranagar', 'Surendranagar', '447', 'GJ', 'India', '12345');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_info`
--
ALTER TABLE `admin_info`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `doc_info`
--
ALTER TABLE `doc_info`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `patients_info`
--
ALTER TABLE `patients_info`
  ADD PRIMARY KEY (`email`);
ALTER TABLE `patients_info` ADD FULLTEXT KEY `aadhar` (`aadhar`);
ALTER TABLE `patients_info` ADD FULLTEXT KEY `aadhar_2` (`aadhar`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
