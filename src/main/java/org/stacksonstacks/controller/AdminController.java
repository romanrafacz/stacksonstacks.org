package org.stacksonstacks.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.stacksonstacks.domain.Post;
import org.stacksonstacks.repository.PostRepository;


@Controller
public class AdminController {
	
	@Autowired
	private PostRepository postRepository;

	@RequestMapping("/admin")
	public String adminPage(Model model){
		return "admin/admin_home";
	}
	
	@RequestMapping("/admin/post/new")
	public String addNewPost(Model model){
		return "admin/add_post";
	}
	
	@RequestMapping(value="/post/add", method=RequestMethod.POST)
	public String addNewBlog(@Valid Post post, BindingResult bindingResult, Model model){
		postRepository.save(post);
		return "redirect:/post";
	}
	
}
