package com.blog.blogspring.repository;

import com.blog.blogspring.entity.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Integer> {
}
