package org.stacksonstacks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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

	@RequestMapping("/java")
	public String listPostsByJava(Model model){
		model.addAttribute("posts", postRepository.findPostByCategory(java));
		return "post/show_posts_by_category";
	}
	
	@RequestMapping("/python")
	public String listPostsByPython(Model model){
		model.addAttribute("posts", postRepository.findPostByCategory(python));
		return "post/show_posts_by_category";
	}
	
	@RequestMapping("/postgres")
	public String listPostsByPostgres(Model model){
		model.addAttribute("posts", postRepository.findPostByCategory(postgres));
		return "post/show_posts_by_category";
	}
	@RequestMapping("/saltstack")
	public String listPostsBySalt(Model model){
		model.addAttribute("posts", postRepository.findPostByCategory(saltstack));
		return "post/show_posts_by_category";
	}
	@RequestMapping("/devops")
	public String listPostsByDevops(Model model){
		model.addAttribute("posts", postRepository.findPostByCategory(devops));
		return "post/show_posts_by_category";
	}
}
