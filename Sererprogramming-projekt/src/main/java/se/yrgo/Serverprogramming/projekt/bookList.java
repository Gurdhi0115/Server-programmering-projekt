package se.yrgo.Serverprogramming.projekt;

import java.util.List;

public class bookList {
    private List<Book> books;

    public bookList() {}

    public bookList(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
