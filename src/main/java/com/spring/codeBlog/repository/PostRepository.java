package com.spring.codeBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.codeBlog.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
