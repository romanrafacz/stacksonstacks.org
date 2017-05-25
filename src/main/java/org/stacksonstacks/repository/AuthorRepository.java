package org.stacksonstacks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.stacksonstacks.domain.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
