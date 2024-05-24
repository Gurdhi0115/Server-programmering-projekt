package se.yrgo.Sererprogramming.projekt;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
public class Book {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    private String title;
    private String author;
    private String isbn;
    private int publishedYear;
    private String status;

    public Book() {}

    @Override
    public String toString() {
        return this.title + " by " + this.author + " (Published: " + this.publishedYear + ")";
    }

    // Getters and Setters (optional, but recommended for accessing private fields)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
