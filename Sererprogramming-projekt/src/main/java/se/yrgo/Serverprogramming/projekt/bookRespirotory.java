package se.yrgo.Serverprogramming.projekt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import se.yrgo.Serverprogramming.projekt.Book;
import se.yrgo.Serverprogramming.projekt.Person;

public interface bookRespirotory extends JpaRepository<Book, Long> {

    Book findByTitle(String title);
    List<Book> findByBorrower(Person borrower);
}
