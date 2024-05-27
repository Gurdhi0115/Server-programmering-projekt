package se.yrgo.Serverprogramming.projekt;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;

    @OneToMany(mappedBy = "borrower", cascade = CascadeType.ALL)
    private List<Loans> loans; // Använd Loans för att representera relationen

    // Konstruktor
    public Person() {}

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Loans> getLoans() {
        return loans;
    }

    public void setLoans(List<Loans> loans) {
        this.loans = loans;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.email + ")";
    }
}
