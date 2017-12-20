-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 20, 2017 at 09:30 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `lms`
--

-- --------------------------------------------------------

--
-- Table structure for table `lms_author`
--

CREATE TABLE IF NOT EXISTS `lms_author` (
`id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `lms_author`
--

INSERT INTO `lms_author` (`id`, `name`) VALUES
(1, 'computer'),
(2, 'entsf'),
(3, 'art'),
(4, 'computer'),
(5, 'akkd'),
(7, 'cmt'),
(8, 'cmt'),
(9, 'popy');

-- --------------------------------------------------------

--
-- Table structure for table `lms_book`
--

CREATE TABLE IF NOT EXISTS `lms_book` (
`id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `book_code` varchar(45) DEFAULT NULL,
  `author` varchar(45) DEFAULT NULL,
  `publisher` varchar(45) DEFAULT NULL,
  `edition` varchar(45) DEFAULT NULL,
  `unit_price` int(11) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `total_price` int(11) DEFAULT NULL,
  `rack_no` varchar(45) DEFAULT NULL,
  `issn_no` varchar(45) DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  `purchase_date` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `lms_book`
--

INSERT INTO `lms_book` (`id`, `name`, `book_code`, `author`, `publisher`, `edition`, `unit_price`, `qty`, `total_price`, `rack_no`, `issn_no`, `category`, `purchase_date`) VALUES
(1, '11', '22', '33', '44', '55', 66, 77, 88, '99', '112', '113', '114'),
(3, '1155fss', '2234', '33', '446', '55', 66, 77, 88, '99', '112', '113', '114444'),
(4, 'anik', '22', '33', '44', '55', 666, 77, 888, '99', '112', '113', '114'),
(5, 'rudro', '22', '33', '44', '55', 666, 77, 888, '99', '112', '113', '114'),
(6, 'rudro lp', '22', '33', '44', '55', 666, 77, 888, '99', '112', '113', '114'),
(7, '11', '22', '33', '44', '55', 66, 77, 88, '99', '112', '113', '114'),
(8, '11', '22', '33', '44', '55', 66, 77, 88, '99', '112', '113', '114'),
(9, '11asda', '22', '33', '44', '55', 656, 77, 8778, '99', '112', '113', '114'),
(10, 'anik', '22', '33', '44', '55', 656, 77, 8778, '99', '112', '113', '114'),
(11, 'java', '22', '33', '44', '55', 666, 20, 888, '99', '112', '113', '114'),
(12, 'java', '22', '33', '44', '55', 666, 20, 888, '99', '112', '113', '114'),
(13, 'C++', '22', '33', '44', '55', 666, 200, 888, '99', '112', '113', '114'),
(14, 'english', '50', 'anik', 'dimatrik', 'first', 500, 50, 550, '40', '112', '113', '11/1/17'),
(15, 'anik', '22', '33', '44', '55', 66, 77, 88, '99', '112', '113', '114'),
(16, 'c#', '1242', 'cmt', 'stfss', 'asdfa2', 112, 1, 231, '1', '1123221', 'computer', '12343'),
(17, 'c#', '1242', 'cmt', 'stfss', 'asdfa2', 112, 1, 231, '1', '1123221', 'computer', '12343'),
(18, 'c#', '1242', 'cmt', 'stfss', 'asdfa2', 112, 1, 231, '1', '1123221', 'computer', '12343'),
(19, 'CSS', '2342', 'computer', 'boby', 'sec', 123, 2, 324, '1', '11324', 'computer', '2/4/2017');

-- --------------------------------------------------------

--
-- Table structure for table `lms_book_category`
--

CREATE TABLE IF NOT EXISTS `lms_book_category` (
`id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `lms_book_category`
--

INSERT INTO `lms_book_category` (`id`, `name`) VALUES
(1, 'asd332'),
(3, 'hkhk22'),
(4, 'computer');

-- --------------------------------------------------------

--
-- Table structure for table `lms_book_issue`
--

CREATE TABLE IF NOT EXISTS `lms_book_issue` (
`id` int(11) NOT NULL,
  `book_id` int(11) DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  `issue_date` varchar(45) DEFAULT NULL,
  `expire_date` varchar(45) DEFAULT NULL,
  `return_date` varchar(45) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `lms_book_issue`
--

INSERT INTO `lms_book_issue` (`id`, `book_id`, `student_id`, `issue_date`, `expire_date`, `return_date`, `qty`, `status`) VALUES
(3, 5, 4, '11', '11', '11', 11, 'False'),
(5, 5, 5, '223', '232', '23', 23, 'True'),
(6, 13, 4, '12/3/11', '12/4/11', '12/4/11', 200, 'True'),
(7, 13, 4, '12/3/11', '12/4/11', '12/4/11', 100, 'True'),
(8, 14, 7, '12/2/17', '12/3/17', '12/3/17', 30, 'True'),
(9, 14, 5, '23/3/11', '23/4/11', '23/4/11', 10, 'True');

-- --------------------------------------------------------

--
-- Table structure for table `lms_book_receive`
--

CREATE TABLE IF NOT EXISTS `lms_book_receive` (
`id` int(11) NOT NULL,
  `book_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `return_date` varchar(30) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lms_book_receive`
--

INSERT INTO `lms_book_receive` (`id`, `book_id`, `student_id`, `return_date`, `qty`, `status`) VALUES
(1, 5, 3, '12123', 1212, '123'),
(2, 10, 6, '12123', 1212, '123'),
(3, 8, 5, '2222', 12, '111'),
(4, 7, 6, 'wed', 213, 'asd'),
(5, 11, 7, '3/4/55', 23, '1/2/33'),
(6, 3, 3, '4/7/2018', 2, 'good'),
(7, 5, 3, '5/1/2015', 3, 'bad');

-- --------------------------------------------------------

--
-- Table structure for table `lms_book_summary`
--

CREATE TABLE IF NOT EXISTS `lms_book_summary` (
`id` int(11) NOT NULL,
  `book_id` int(11) DEFAULT NULL,
  `book_name` varchar(45) DEFAULT NULL,
  `total_stock` int(11) DEFAULT NULL,
  `avilable_stock` int(11) DEFAULT NULL,
  `already_lend` int(11) DEFAULT NULL,
  `lost_qty` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `lms_book_summary`
--

INSERT INTO `lms_book_summary` (`id`, `book_id`, `book_name`, `total_stock`, `avilable_stock`, `already_lend`, `lost_qty`) VALUES
(2, 22, 'java', 297, 121, 176, 0),
(3, 50, 'english', 50, -70, 120, 0),
(4, 1242, 'c#', 3, 3, 0, 0),
(5, 2342, 'CSS', 2, 2, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `lms_department`
--

CREATE TABLE IF NOT EXISTS `lms_department` (
`id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `lms_department`
--

INSERT INTO `lms_department` (`id`, `name`) VALUES
(1, 'asd3'),
(3, 'EW'),
(4, 'ssa');

-- --------------------------------------------------------

--
-- Table structure for table `lms_edition`
--

CREATE TABLE IF NOT EXISTS `lms_edition` (
`id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `lms_edition`
--

INSERT INTO `lms_edition` (`id`, `name`) VALUES
(1, 'ssd'),
(2, 'asdfa2'),
(3, 'sec');

-- --------------------------------------------------------

--
-- Table structure for table `lms_institute`
--

CREATE TABLE IF NOT EXISTS `lms_institute` (
`id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `house_no` varchar(45) DEFAULT NULL,
  `road_no` varchar(45) DEFAULT NULL,
  `block_or_village` varchar(45) DEFAULT NULL,
  `thana` varchar(45) DEFAULT NULL,
  `district` varchar(45) DEFAULT NULL,
  `division` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `address_type` varchar(45) DEFAULT NULL,
  `institute_type` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `lms_institute`
--

INSERT INTO `lms_institute` (`id`, `name`, `house_no`, `road_no`, `block_or_village`, `thana`, `district`, `division`, `country`, `address_type`, `institute_type`) VALUES
(1, 'icst', '112', '453', 'surikora', 'choddogram', 'Item 1', 'Item 2', 'Item 3', 'prement', 'active'),
(3, 'icst', '1124', '453', 'surikorassr', 'choddogram', 'Item 1', 'Item 2', 'Item 3', 'prement', 'active'),
(5, 'icst', '1124', '453', 'surikorassr_sd', 'choddogram', 'Item 3', 'Item 3', 'Item 3', 'prement', 'active'),
(6, 'icst', '1124', '453', 'surikorassr', 'choddogram', 'Item 4', 'Item 4', 'Item 4', 'prement', 'active');

-- --------------------------------------------------------

--
-- Table structure for table `lms_publisher`
--

CREATE TABLE IF NOT EXISTS `lms_publisher` (
`id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `lms_publisher`
--

INSERT INTO `lms_publisher` (`id`, `name`) VALUES
(1, 'stfss'),
(3, 'boby'),
(4, 'ffrt454');

-- --------------------------------------------------------

--
-- Table structure for table `lms_sesson`
--

CREATE TABLE IF NOT EXISTS `lms_sesson` (
`id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `lms_sesson`
--

INSERT INTO `lms_sesson` (`id`, `name`) VALUES
(1, 'java core'),
(2, 'c++'),
(4, 'asd'),
(5, 'fgff'),
(6, 'akks'),
(7, 'dfsdf');

-- --------------------------------------------------------

--
-- Table structure for table `lms_shift`
--

CREATE TABLE IF NOT EXISTS `lms_shift` (
`id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `starting_time` varchar(45) DEFAULT NULL,
  `ending_time` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `lms_shift`
--

INSERT INTO `lms_shift` (`id`, `name`, `starting_time`, `ending_time`, `status`) VALUES
(1, '123223', '123223', '123223', 'True'),
(2, '123we', '123we', '123we', 'False'),
(3, '123wess', '123wess', '123wess', 'True');

-- --------------------------------------------------------

--
-- Table structure for table `lms_student`
--

CREATE TABLE IF NOT EXISTS `lms_student` (
`id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `registration_no` int(11) DEFAULT NULL,
  `boardRoll_no` int(11) DEFAULT NULL,
  `class_roll` int(11) DEFAULT NULL,
  `department_id` int(11) DEFAULT NULL,
  `shift_id` int(11) DEFAULT NULL,
  `house_no` varchar(45) DEFAULT NULL,
  `road_no` varchar(45) DEFAULT NULL,
  `block_or_village` varchar(45) DEFAULT NULL,
  `thana` varchar(45) DEFAULT NULL,
  `district` varchar(45) DEFAULT NULL,
  `division` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `lms_student`
--

INSERT INTO `lms_student` (`id`, `name`, `registration_no`, `boardRoll_no`, `class_roll`, `department_id`, `shift_id`, `house_no`, `road_no`, `block_or_village`, `thana`, `district`, `division`, `country`) VALUES
(3, 'fdd', 123, 123, 123, 123, 123, '123', '123', '123', '123', 'Item 1', 'Item 1', 'Item 1'),
(4, 'fdd_ss', 123, 123, 123, 123, 123, '123', '123', '123', '123', 'Item 2', 'Item 3', 'Item 4'),
(7, 'anik paul', 616187, 773622, 33, 120, 231, '32', '453', 'surikora', 'coddogram', 'Feni', 'Ctg', 'Bangladesh');

-- --------------------------------------------------------

--
-- Table structure for table `lms_user`
--

CREATE TABLE IF NOT EXISTS `lms_user` (
`id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `mobile` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `user_type` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `lms_user`
--

INSERT INTO `lms_user` (`id`, `name`, `email`, `mobile`, `username`, `password`, `user_type`) VALUES
(1, NULL, NULL, NULL, 'admin', '12345', NULL),
(2, 'aswd', 'asd', '123', 'dsad', 'asdasd', 'Admin'),
(3, 'aswd', 'asd', '123445333', 'dsad', 'asdasd', 'Admin'),
(4, 'anik', 'asd', '123', 'dsad', 'asdasd', 'Admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `lms_author`
--
ALTER TABLE `lms_author`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lms_book`
--
ALTER TABLE `lms_book`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lms_book_category`
--
ALTER TABLE `lms_book_category`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lms_book_issue`
--
ALTER TABLE `lms_book_issue`
 ADD PRIMARY KEY (`id`), ADD KEY `book_id` (`book_id`), ADD KEY `student_id` (`student_id`);

--
-- Indexes for table `lms_book_receive`
--
ALTER TABLE `lms_book_receive`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lms_book_summary`
--
ALTER TABLE `lms_book_summary`
 ADD PRIMARY KEY (`id`), ADD KEY `book_id` (`book_id`);

--
-- Indexes for table `lms_department`
--
ALTER TABLE `lms_department`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lms_edition`
--
ALTER TABLE `lms_edition`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lms_institute`
--
ALTER TABLE `lms_institute`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lms_publisher`
--
ALTER TABLE `lms_publisher`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lms_sesson`
--
ALTER TABLE `lms_sesson`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lms_shift`
--
ALTER TABLE `lms_shift`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lms_student`
--
ALTER TABLE `lms_student`
 ADD PRIMARY KEY (`id`), ADD KEY `department_id` (`department_id`), ADD KEY `shift_id` (`shift_id`);

--
-- Indexes for table `lms_user`
--
ALTER TABLE `lms_user`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `lms_author`
--
ALTER TABLE `lms_author`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `lms_book`
--
ALTER TABLE `lms_book`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=20;
--
-- AUTO_INCREMENT for table `lms_book_category`
--
ALTER TABLE `lms_book_category`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `lms_book_issue`
--
ALTER TABLE `lms_book_issue`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `lms_book_receive`
--
ALTER TABLE `lms_book_receive`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `lms_book_summary`
--
ALTER TABLE `lms_book_summary`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `lms_department`
--
ALTER TABLE `lms_department`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `lms_edition`
--
ALTER TABLE `lms_edition`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `lms_institute`
--
ALTER TABLE `lms_institute`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `lms_publisher`
--
ALTER TABLE `lms_publisher`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `lms_sesson`
--
ALTER TABLE `lms_sesson`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `lms_shift`
--
ALTER TABLE `lms_shift`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `lms_student`
--
ALTER TABLE `lms_student`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `lms_user`
--
ALTER TABLE `lms_user`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
