package org.stacksonstacks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.stacksonstacks.repository.AuthorRepository;

@Controller
public class AuthorController {
	
	@Autowired
	private AuthorRepository authorRepository;

	@RequestMapping("/author")
	public String listBlogs(){
		return "author/author";
	}
	
	@RequestMapping("/author_list")
	public String listBlogs(Model model){
		model.addAttribute("authors", authorRepository.findAll());
		return "author/author_list";
	}
	
}
