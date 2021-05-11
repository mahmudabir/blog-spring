package com.blog.blogspring.controller;


import com.blog.blogspring.entity.Post;
import com.blog.blogspring.entity.User;
import com.blog.blogspring.service.PostService;
import com.blog.blogspring.service.UserService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping("")
    public void addPost(@RequestBody Post post) {
        postService.addPost(post);
    }

    @PutMapping("/{postId}")
    public void getUser(@PathVariable int postId, @RequestBody Post post) {
        postService.updatePost(postId, post);
    }

    @DeleteMapping("/{postId}")
    public void getUser(@PathVariable int postId) {
        postService.deletePost(postId);
    }
}
