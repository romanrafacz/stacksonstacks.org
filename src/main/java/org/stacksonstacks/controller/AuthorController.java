package org.stacksonstacks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

	@RequestMapping("/author")
	public String listBlogs(){
		return "author/author";
	}
	
}
