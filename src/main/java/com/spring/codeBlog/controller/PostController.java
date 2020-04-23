package com.spring.codeBlog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.codeBlog.model.Post;
import com.spring.codeBlog.service.PostServiceImpl;

@Controller
public class PostController {
	
	@Autowired
	private PostServiceImpl postService;

	@GetMapping(value = "/post")
	public ModelAndView getPosts() {
		ModelAndView modelAndView = new ModelAndView("post");
		List<Post> posts = postService.findAll();
		modelAndView.addObject("posts", posts);
		return modelAndView;
		
	}
}
