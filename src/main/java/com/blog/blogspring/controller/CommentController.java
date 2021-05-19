package com.blog.blogspring.controller;

import com.blog.blogspring.entity.Comment;
import com.blog.blogspring.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/posts/{postId}")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/comments")
    public List<Comment> getAllCommentsByPostId(@PathVariable int postId){
        return commentService.getAllCommentsByPostId(postId);
    }

    @PostMapping("/comments/users/{userId}")
    public void addCommentsByPostId(@PathVariable int postId, @PathVariable int userId, @RequestBody Comment comment){
        commentService.addCommentsByPostId(postId, userId, comment);
    }

    @GetMapping("/comments/{commentId}")
    public List<Comment> getAllCommentsByPostId(@PathVariable int postId, @PathVariable int commentId){
        return commentService.getCommentByPostIdAndCommentId(postId, commentId);
    }

    @PutMapping("/comments/{commentId}")
    public void updateCommentByPostIdAndCommentId(@PathVariable int postId, @PathVariable int commentId, @RequestBody Comment comment){
        commentService.updateCommentByPostIdAndCommentId(postId, commentId, comment);
    }

    @DeleteMapping("/comments/{commentId}")
    public void deleteCommentByPostIdAndCommentId(@PathVariable int postId, @PathVariable int commentId){
        commentService.deleteCommentByPostIdAndCommentId(postId, commentId);
    }
}
