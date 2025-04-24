package com.cookingblog.controller;

import com.cookingblog.model.Comment;
import com.cookingblog.model.Recipe;
import com.cookingblog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
public class BlogController {
    private final CommentService commentService;

    @Autowired
    public BlogController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Recipe> recipes = Recipe.getAllRecipes();
        model.addAttribute("recipes", recipes);
        model.addAttribute("comments", commentService.getAllComments());
        model.addAttribute("newComment", new Comment());
        return "index";
    }

    @PostMapping("/comment")
    public String addComment(@ModelAttribute Comment newComment) {
        commentService.saveComment(newComment);
        return "redirect:/";
    }
}
