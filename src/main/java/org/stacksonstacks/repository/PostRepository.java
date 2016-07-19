package org.stacksonstacks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.stacksonstacks.domain.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
