package com.blog.blogspring.repository;

import com.blog.blogspring.entity.Comment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepository extends CrudRepository<Comment, Integer> {

    public List<Comment> findAllByPostId(int postId);
}
