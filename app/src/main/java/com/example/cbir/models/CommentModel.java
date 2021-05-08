package com.example.cbir.models;

public class CommentModel {
    private String username;
    private String comment;

    public CommentModel(String username, String comment){
        this.comment = comment;
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }

    public String getComment() {
        return this.comment;
    }
}
