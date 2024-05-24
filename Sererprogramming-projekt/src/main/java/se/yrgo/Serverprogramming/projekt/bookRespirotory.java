package se.yrgo.Serverprogramming.projekt;

import org.springframework.data.jpa.repository.JpaRepository;

public interface bookRespirotory extends JpaRepository<Book, Long> {

    Book findByTitle(String title);
}
