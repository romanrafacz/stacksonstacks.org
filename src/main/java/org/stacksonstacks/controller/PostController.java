package org.stacksonstacks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.stacksonstacks.domain.Post;
import org.stacksonstacks.repository.PostRepository;

@Controller
public class PostController {
	
	//Set up category variables
	private Integer java = 1;
	private Integer python = 2;
	private Integer postgres = 3;
	private Integer saltstack = 4;
	private Integer devops = 5;
	
	@Autowired
	private PostRepository postRepository;
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String searchForm(Model model, String search){
		model.addAttribute("posts", search);
		return "post/show_posts_search_test";
	}
	
	@RequestMapping("/")
	public String listPosts(Model model){
		model.addAttribute("posts", postRepository.findAll());
		return "post/show_posts";
	}
	
	@RequestMapping("/post")
	public String listPostsForBlog(Model model){
		model.addAttribute("posts", postRepository.findAll());
		return "post/show_posts";
	}
	
	@RequestMapping("/post/{id}")
	public String listPostById(Model model, @PathVariable Integer id){
		model.addAttribute("post", postRepository.findOne(id));
		return "post/post";
	}
	
	//Controls navigation by categories

	@RequestMapping("/java")
	public String listPostsByJava(Model model){
		List<Post> getposts = postRepository.findPostByCategory(java);
		model.addAttribute("posts", getposts);
		if (getposts.isEmpty()){
			return "post/show_posts_empty";
		} else { return "post/show_posts_by_category"; }
	}
	
	@RequestMapping("/python")
	public String listPostsByPython(Model model){
		List<Post> getposts = postRepository.findPostByCategory(python);
		model.addAttribute("posts", getposts);
		if (getposts.isEmpty()){
			return "post/show_posts_empty";
		} else { return "post/show_posts_by_category"; }
	}
	
	@RequestMapping("/postgres")
	public String listPostsByPostgres(Model model){
		List<Post> getposts = postRepository.findPostByCategory(postgres);
		model.addAttribute("posts", getposts);
		if (getposts.isEmpty()){
			return "post/show_posts_empty";
		} else { return "post/show_posts_by_category"; }
	}
	@RequestMapping("/saltstack")
	public String listPostsBySalt(Model model){
		List<Post> getposts = postRepository.findPostByCategory(saltstack);
		model.addAttribute("posts", getposts);
		if (getposts.isEmpty()){
			return "post/show_posts_empty";
		} else { return "post/show_posts_by_category"; }
	}
	
	@RequestMapping("/devops")
	public String listPostsByDevops(Model model){
		List<Post> getposts = postRepository.findPostByCategory(devops);
		model.addAttribute("posts", getposts);
		if (getposts.isEmpty()){
			return "post/show_posts_empty";
		} else { return "post/show_posts_by_category"; }
	}
}
