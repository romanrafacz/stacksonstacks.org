package org.stacksonstacks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.stacksonstacks.domain.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
