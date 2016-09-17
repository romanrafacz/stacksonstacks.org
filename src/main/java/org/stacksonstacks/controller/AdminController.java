package org.stacksonstacks.controller;

import java.util.HashMap;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.stacksonstacks.domain.Author;
import org.stacksonstacks.domain.Post;
import org.stacksonstacks.repository.AuthorRepository;
import org.stacksonstacks.repository.CategoryRepository;
import org.stacksonstacks.repository.PostRepository;


@Controller
public class AdminController {
	
	@Autowired
	private PostRepository postRepository;
	private AuthorRepository authorRepository;
	private CategoryRepository categoryRepository;
	
	@RequestMapping("/admin")
	public String adminPage(Model model){
		return "admin/admin_home";
	}
	
	@RequestMapping("/admin/post/new")
	public String addNewPost(Post post, Model model){
		HashMap<String, Integer> auths = new HashMap<>();
		auths.put("Rome", 1);
		auths.put("Erik", 2);
		
//		for (Author x : authorRepository.findAll() ){
//			auths.put(x.getUsername(), x.getAuthorId());
//		}
		
		HashMap<String, Integer> categories = new HashMap<>();
		categories.put("Java", 1);
		categories.put("Python", 2);
		categories.put("Postgres", 3);
		categories.put("Saltstack", 4);
		categories.put("Devops", 5);
		categories.put("Linux", 6);
		model.addAttribute("auths", auths);
		model.addAttribute("categories", categories);
		return "admin/add_post";
	}
	
	@RequestMapping(value="/admin/post/add", method=RequestMethod.POST)
	public String addNewBlog(@Valid Post post, BindingResult bindingResult, Model model){
		postRepository.save(post);
		return "redirect:/post";
	}
	
}
