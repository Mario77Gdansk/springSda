package com.example.demo.module.dashboard.dto;

public class CommentDto {
    private String author;
    private String text;

    public CommentDto(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }
}
