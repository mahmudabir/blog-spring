package com.blog.blogspring.service;

import com.blog.blogspring.entity.Post;
import com.blog.blogspring.entity.User;
import com.blog.blogspring.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        List<Post> posts = new ArrayList<>();
        postRepository.findAll().forEach(posts::add);
        return posts;
    }

    public void addPost(Post post) {
        postRepository.save(post);
    }

    public void updatePost(int postId, Post post) {
        post.setId(postId);
        postRepository.save(post);
    }

    public void deletePost(int postId) {
        postRepository.deleteById(postId);
    }

    public Post getPost(int postId) {
        return postRepository.findById(postId).get();
    }

    public List<Post> getSearchedPost(String s) {
        List<Post> posts = new ArrayList<>();
        postRepository.findAllByContentContainingOrTitleContainingOrUserUsername(s, s, s)
                .forEach(posts::add);

        return posts;
    }
}
