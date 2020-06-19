CREATE DATABASE dbase;

CREATE TABLE `students` (
  `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `fname` varchar(100) NOT NULL,
  `lname` varchar(255) NOT NULL,
  `department` varchar(255) NOT NULL
);

INSERT INTO students (`fname`,`lname`,`department`) VALUES ('Nurzhan','Raikhanov','CS-1702');
INSERT INTO students (`fname`,`lname`,`department`) VALUES ('Akhmet','Bashikov','CS-1702');
INSERT INTO students (`fname`,`lname`,`department`) VALUES ('Sultan','Galymzhanuly','CS-1702');