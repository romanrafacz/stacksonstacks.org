package org.stacksonstacks.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.stacksonstacks.domain.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
	
	@Query("SELECT id, title, description from Post WHERE category_id = (:categoryId)")
	List<Post> findPostByCategory(@Param("categoryId") Integer categoryId);
	
	//@Query("select id, title, description from Post WHERE title % (:search)")
	//List<Post> findPostBySearch(@Param("search") String search);
	

}
