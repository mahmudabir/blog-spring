package com.blog.blogspring.repository;

import com.blog.blogspring.entity.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Integer> {
   public List<Post> findAllByContentContainingOrTitleContainingOrUserUsername(String content, String title, String user_username);
}
