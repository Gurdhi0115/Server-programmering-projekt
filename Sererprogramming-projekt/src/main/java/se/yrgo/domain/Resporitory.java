package se.yrgo.domain;

import se.yrgo.domain.User;
import  org.springframework.data.jpa.repository.JpaRepository;

public interface Resporitory extends JPAresporitory <User, long> {
}