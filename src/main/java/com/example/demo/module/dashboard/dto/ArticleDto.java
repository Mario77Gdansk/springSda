package com.example.demo.module.dashboard.dto;

import java.util.ArrayList;
import java.util.List;

public class ArticleDto {
    private String title;
    private String text;
    private List<CommentDto> comments = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public ArticleDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getText() {
        return text;
    }

    public ArticleDto setText(String text) {
        this.text = text;
        return this;
    }

    public List<CommentDto> getComments() {
        return comments;
    }

    public ArticleDto setComments(List<CommentDto> comments) {
        this.comments = comments;
        return this;
    }
}
