package com.example.demo.restservice;

public class Greeting {

    private final long id;
    private final String content;
    private final String question;

    public Greeting(long id, String content, String question) {
        this.id = id;
        this.question = question;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getQuestion(){
        return question;
    }
}