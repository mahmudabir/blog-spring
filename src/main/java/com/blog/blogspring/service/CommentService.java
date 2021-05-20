package com.blog.blogspring.service;

import com.blog.blogspring.entity.Comment;
import com.blog.blogspring.entity.Post;
import com.blog.blogspring.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAllCommentsByPostId(int postId) {
        return commentRepository.findAllByPostId(postId);
    }

    public List<Comment> getCommentByPostIdAndCommentId(int postId, int commentId) {
        List<Comment> commentsByPostId = commentRepository.findAllByPostId(postId);
        List<Comment> commentsByCommentId = new ArrayList<>();
        commentsByPostId.stream().filter(c -> c.getId() == commentId).forEach(commentsByCommentId::add);
        return commentsByCommentId;
    }

    public void addCommentsByPostId(int postId, int userId, Comment comment) {
        comment.setPost(new Post(postId, "", "", userId));
        commentRepository.save(comment);
    }

    public Comment updateCommentByPostIdAndCommentId(int postId, int commentId, Comment comment) {
        comment.setId(commentId);
       return commentRepository.save(comment);
    }

    public void deleteCommentByPostIdAndCommentId(int postId, int commentId) {
        commentRepository.deleteById(commentId);
    }
}
