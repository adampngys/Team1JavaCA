-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Team1JavaCADB
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Team1JavaCADB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Team1JavaCADB` DEFAULT CHARACTER SET utf8 ;
USE `Team1JavaCADB` ;

-- -----------------------------------------------------
-- Table `Team1JavaCADB`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Team1JavaCADB`.`user` (
  `user_id_pk` NVARCHAR(45) NOT NULL,
  `password` NVARCHAR(45) NOT NULL,
  `role` NVARCHAR(45) NOT NULL,
  PRIMARY KEY (`user_id_pk`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Team1JavaCADB`.`student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Team1JavaCADB`.`student` (
  `std_id_pk` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `NRIC` NVARCHAR(45) NOT NULL,
  `address` NVARCHAR(150) NOT NULL,
  `phone` NVARCHAR(45) NOT NULL,
  `dob` DATETIME NOT NULL,
  `email` NVARCHAR(45) NOT NULL,
  `enrollment_date` DATETIME NOT NULL,
  `user_id_fk` NVARCHAR(45) NOT NULL,
  PRIMARY KEY (`std_id_pk`),
  CONSTRAINT `user_id_pk`
    FOREIGN KEY (`user_id_fk`)
    REFERENCES `Team1JavaCADB`.`user` (`user_id_pk`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `user_id_pk_idx` ON `Team1JavaCADB`.`student` (`user_id_fk` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `Team1JavaCADB`.`lecturer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Team1JavaCADB`.`lecturer` (
  `lect_id_pk` INT NOT NULL AUTO_INCREMENT,
  `name` NVARCHAR(45) NOT NULL,
  `faculty` NVARCHAR(45) NOT NULL,
  `phone` INT NOT NULL,
  `dob` DATETIME NOT NULL,
  `email` NVARCHAR(45) NOT NULL,
  `user_id_fk` NVARCHAR(45) NOT NULL,
  PRIMARY KEY (`lect_id_pk`),
  CONSTRAINT `user_id_fk`
    FOREIGN KEY (`user_id_fk`)
    REFERENCES `Team1JavaCADB`.`user` (`user_id_pk`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `user_id_fk_idx` ON `Team1JavaCADB`.`lecturer` (`user_id_fk` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `Team1JavaCADB`.`course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Team1JavaCADB`.`course` (
  `course_id_pk` NVARCHAR(45) NOT NULL,
  `name` NVARCHAR(45) NOT NULL,
  `startdate` DATETIME NOT NULL,
  `duration` INT NOT NULL,
  `size` INT NOT NULL,
  `credit` INT NOT NULL,
  PRIMARY KEY (`course_id_pk`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Team1JavaCADB`.`std_course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Team1JavaCADB`.`std_course` (
  `std_id_pk` NVARCHAR(45) NOT NULL,
  `course_id_pk` NVARCHAR(45) NOT NULL,
  `GPA` DECIMAL NULL,
  `grade` NVARCHAR(45) NULL,
  PRIMARY KEY (`std_id_pk`, `course_id_pk`),
  CONSTRAINT `course_id`
    FOREIGN KEY (`course_id_pk`)
    REFERENCES `Team1JavaCADB`.`course` (`course_id_pk`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `std_id`
    FOREIGN KEY (`std_id_pk`)
    REFERENCES `Team1JavaCADB`.`student` (`std_id_pk`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `course_id_idx` ON `Team1JavaCADB`.`std_course` (`course_id_pk` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `Team1JavaCADB`.`lecturer_course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Team1JavaCADB`.`lecturer_course` (
  `lect_id_pk` INT NOT NULL,
  `course_id_pk` NVARCHAR(45) NOT NULL,
  PRIMARY KEY (`lect_id_pk`, `course_id_pk`),
  CONSTRAINT `lect_id`
    FOREIGN KEY (`lect_id_pk`)
    REFERENCES `Team1JavaCADB`.`lecturer` (`lect_id_pk`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `course_id`
    FOREIGN KEY (`course_id_pk`)
    REFERENCES `Team1JavaCADB`.`course` (`course_id_pk`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `course_id_idx` ON `Team1JavaCADB`.`lecturer_course` (`course_id_pk` ASC) VISIBLE;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `Team1JavaCADB`.`student`
-- -----------------------------------------------------
START TRANSACTION;
USE `Team1JavaCADB`;
INSERT INTO `Team1JavaCADB`.`student` (`std_id_pk`, `name`, `NRIC`, `address`, `phone`, `dob`, `email`, `enrollment_date`, `user_id_fk`) VALUES (1, 'Adam Png', 'S0744185A', 'Blk 414 Sengkang Street 24, #14-01', '82234698', '11-5-1987', 'jimmichie@msn.com', '9/1/2015', 'adam.png');
INSERT INTO `Team1JavaCADB`.`student` (`std_id_pk`, `name`, `NRIC`, `address`, `phone`, `dob`, `email`, `enrollment_date`, `user_id_fk`) VALUES (2, 'Dicky Lie', 'S7038107I', 'Blk 433 Bukit Merah Street 36, #09-39', '87736321', '27-8-1970', 'qmacro@optonline.net', '9/1/2016', 'dicky.lie');
INSERT INTO `Team1JavaCADB`.`student` (`std_id_pk`, `name`, `NRIC`, `address`, `phone`, `dob`, `email`, `enrollment_date`, `user_id_fk`) VALUES (3, 'Poon Kip Hoe', 'S8871910G', 'Blk 26 Geylang Street 26, #05-17', '89067888', '7-12-1988', 'csilvers@icloud.com', '9/1/2015', 'kip.hoe');

COMMIT;


-- -----------------------------------------------------
-- Data for table `Team1JavaCADB`.`lecturer`
-- -----------------------------------------------------
START TRANSACTION;
USE `Team1JavaCADB`;
INSERT INTO `Team1JavaCADB`.`lecturer` (`lect_id_pk`, `name`, `faculty`, `phone`, `dob`, `email`, `user_id_fk`) VALUES (1, 'Bessa Nicoletta', 'Computer Science', 94463008, '14-8-1960', 'mahbub@gmail.com', 'bessa.nicoletta');
INSERT INTO `Team1JavaCADB`.`lecturer` (`lect_id_pk`, `name`, `faculty`, `phone`, `dob`, `email`, `user_id_fk`) VALUES (2, 'Xu Dong', 'Computer Science', 94616387, '2-3-1953', 'violinhi@sbcglobal.net', 'xu.dong');

COMMIT;


-- -----------------------------------------------------
-- Data for table `Team1JavaCADB`.`course`
-- -----------------------------------------------------
START TRANSACTION;
USE `Team1JavaCADB`;
INSERT INTO `Team1JavaCADB`.`course` (`course_id_pk`, `name`, `startdate`, `duration`, `size`, `credit`) VALUES ('J10101', 'Java Computing', '16-10-2018', 15, 100, 6);
INSERT INTO `Team1JavaCADB`.`course` (`course_id_pk`, `name`, `startdate`, `duration`, `size`, `credit`) VALUES ('P10101', 'Python Programming', '10-9-2018', 12, 100, 4);

COMMIT;


-- -----------------------------------------------------
-- Data for table `Team1JavaCADB`.`std_course`
-- -----------------------------------------------------
START TRANSACTION;
USE `Team1JavaCADB`;
INSERT INTO `Team1JavaCADB`.`std_course` (`std_id_pk`, `course_id_pk`, `GPA`, `grade`) VALUES ('1', 'P10101', NULL, NULL);
INSERT INTO `Team1JavaCADB`.`std_course` (`std_id_pk`, `course_id_pk`, `GPA`, `grade`) VALUES ('2', 'J10101', NULL, NULL);
INSERT INTO `Team1JavaCADB`.`std_course` (`std_id_pk`, `course_id_pk`, `GPA`, `grade`) VALUES ('3', 'P10101', NULL, NULL);

COMMIT;


-- -----------------------------------------------------
-- Data for table `Team1JavaCADB`.`lecturer_course`
-- -----------------------------------------------------
START TRANSACTION;
USE `Team1JavaCADB`;
INSERT INTO `Team1JavaCADB`.`lecturer_course` (`lect_id_pk`, `course_id_pk`) VALUES (1, 'J10101');
INSERT INTO `Team1JavaCADB`.`lecturer_course` (`lect_id_pk`, `course_id_pk`) VALUES (2, 'P10101');

COMMIT;

