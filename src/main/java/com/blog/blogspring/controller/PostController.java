package com.blog.blogspring.controller;


import com.blog.blogspring.entity.Post;
import com.blog.blogspring.entity.User;
import com.blog.blogspring.service.PostService;
import com.blog.blogspring.service.UserService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/{postId}")
    public Post getPost(@PathVariable int postId) {
        return postService.getPost(postId);
    }

    @PostMapping("/users/{userId}")
    public Post addPost(@PathVariable int userId, @RequestBody Post post) {
       return postService.addPost(userId, post);
    }

    @PutMapping("/{postId}")
    public Post getUser(@PathVariable int postId, @RequestBody Post post) {
       return postService.updatePost(postId, post);
    }

    @DeleteMapping("/{postId}")
    public void getUser(@PathVariable int postId) {
        postService.deletePost(postId);
    }

    @GetMapping("/search/{s}")
    public List<Post> getSearchedPost(@PathVariable String s) {
        return postService.getSearchedPost(s);
    }
}
