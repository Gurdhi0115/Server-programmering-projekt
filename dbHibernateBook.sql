DROP DATABASE IF EXISTS dbHibernateBook;
CREATE DATABASE dbHibernateBook;
USE dbHibernateBook;

CREATE TABLE tblBook (
	fldBookId INT PRIMARY KEY AUTO_INCREMENT,
    fldIsbn CHAR(13) NOT NULL,
    fldTitle VARCHAR(50) NOT NULL,
    fldAuthor VARCHAR(50) NOT NULL,
    fldIsLoanable BOOLEAN DEFAULT TRUE
);

CREATE TABLE tblBurrower (
	fldBurrowerId INT PRIMARY KEY AUTO_INCREMENT,
    fldName VARCHAR(50) NOT NULL
);

CREATE TABLE tblLoan (
	fldLoanId INT PRIMARY KEY AUTO_INCREMENT,
    fldDateOfLoan DATE NOT NULL,
    fldDateOfGiveBack DATE NOT NULL,
    burrowerId INT,
    bookId INT,
    FOREIGN KEY (burrowerId) REFERENCES tblBurrower(fldBurrowerId),
    FOREIGN KEY (bookId) REFERENCES tblBook(fldBookId)
);

