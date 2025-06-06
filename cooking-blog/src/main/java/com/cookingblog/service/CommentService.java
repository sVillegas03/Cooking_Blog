package com.cookingblog.service;

import com.cookingblog.model.Comment;
import com.cookingblog.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class CommentService {
  private final CommentRepository commentRepository;

  @Autowired
  public CommentService(CommentRepository commentRepository) {
    this.commentRepository = commentRepository;
  }

  public List<Comment> getAllComments() {
    return commentRepository.findAllByOrderByCreatedAtDesc();
  }

  public Comment saveComment(Comment comment) {
    comment.setCreatedAt(LocalDateTime.now());
    return commentRepository.save(comment);
  }
}
