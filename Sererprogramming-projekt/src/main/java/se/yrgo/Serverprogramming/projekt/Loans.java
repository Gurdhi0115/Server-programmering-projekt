package se.yrgo.Serverprogramming.projekt;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Loans {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Book book;

    @ManyToOne
    private Person borrower; // Använd Person istället för Borrower

    private LocalDate loanDate;
    private LocalDate returnDate;

    // Getters and Setters
}
