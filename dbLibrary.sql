-- Skapa databas
DROP DATABASE IF EXISTS dbLibrary;
CREATE DATABASE dbLibrary;
USE dbLibrary;

-- Skapa tabell för böcker
CREATE TABLE tblBook (
    fldBookId INT PRIMARY KEY AUTO_INCREMENT,
    fldIsbn CHAR(13) NOT NULL,
    fldTitle VARCHAR(50) NOT NULL,
    fldAuthor VARCHAR(50) NOT NULL,
    fldIsLoanable BOOLEAN DEFAULT TRUE
);

-- Skapa tabell för låntagare
CREATE TABLE tblBorrower (
    fldBorrowerId INT PRIMARY KEY AUTO_INCREMENT,
    fldName VARCHAR(50) NOT NULL
);

-- Skapa tabell för lån
CREATE TABLE tblLoan (
    fldLoanId INT PRIMARY KEY AUTO_INCREMENT,
    fldDateOfLoan DATE NOT NULL,
    fldDateOfGiveBack DATE NOT NULL,
    fldStatus ENUM('available', 'borrowed'),
    fldBorrowerId INT,
    fldBookId INT,
    FOREIGN KEY (fldBorrowerId) REFERENCES tblBorrower(fldBorrowerId),
    FOREIGN KEY (fldBookId) REFERENCES tblBook(fldBookId)
);
