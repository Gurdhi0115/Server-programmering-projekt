package se.yrgo.Serverprogramming.projekt;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRespirotory extends JpaRepository<Book, Long> {

    Book findByTitle(String title);
    List<Book> findByBorrower(Person borrower);
}
