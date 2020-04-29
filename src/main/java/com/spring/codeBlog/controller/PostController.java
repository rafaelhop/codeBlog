package com.spring.codeBlog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.codeBlog.model.Post;
import com.spring.codeBlog.service.PostServiceImpl;

@Controller
public class PostController {
	
	@Autowired
	private PostServiceImpl postService;

	@RequestMapping(value ="/posts", method = RequestMethod.GET)
	public ModelAndView getPosts() {
		ModelAndView modelAndView = new ModelAndView("post");
		List<Post> posts = postService.findAll();
		modelAndView.addObject("posts", posts);
		return modelAndView;
	}
	
	@RequestMapping(value = "/post/{id}", method = RequestMethod.GET)
	public ModelAndView getPostById(@PathVariable("id") Long id) {
		ModelAndView modelAndView = new ModelAndView("postDetails");
		Post post = postService.findById(id);
		modelAndView.addObject("post", post);
		return modelAndView;
		
	}
}
