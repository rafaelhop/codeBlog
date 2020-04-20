package com.spring.codeBlog.service;

import java.util.List;

import com.spring.codeBlog.model.Post;

public interface PostInterface {
	
	List<Post> findAll();
	
	Post findById(Long id);
	
	Post save(Post post);

}
