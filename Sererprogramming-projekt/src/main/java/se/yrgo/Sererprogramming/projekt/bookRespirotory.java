package se.yrgo.Sererprogramming.projekt;

import org.springframework.data.jpa.repository.JpaRepository;

public interface bookRespirotory extends JpaRepository<Book, Long> {

    Book findByTitle(String title);
}
