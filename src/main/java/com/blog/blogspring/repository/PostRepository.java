package com.blog.blogspring.repository;

import com.blog.blogspring.entity.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer> {
}
