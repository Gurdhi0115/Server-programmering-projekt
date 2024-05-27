package se.yrgo.Serverprogramming.projekt;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByTitle(String title);
    List<Book> findByLoans_Borrower(Person borrower); // Använd Loans för att hitta böcker lånade av en viss person
}
