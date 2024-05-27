package se.yrgo.Serverprogramming.projekt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.yrgo.Serverprogramming.projekt.Person;

@Repository
public interface personrespirotory extends JpaRepository<Person, Long> {

}
