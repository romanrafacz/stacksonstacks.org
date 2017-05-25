package org.stacksonstacks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.stacksonstacks.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
