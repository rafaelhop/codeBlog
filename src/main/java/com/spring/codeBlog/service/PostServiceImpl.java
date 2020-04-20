package com.spring.codeBlog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.codeBlog.model.Post;
import com.spring.codeBlog.repository.PostRepository;

public class PostServiceImpl implements PostInterface {
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public List<Post> findAll() {
		return postRepository.findAll();
	}

	@Override
	public Post findById(Long id) {
		return postRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return postRepository.save(post);
	}

}
