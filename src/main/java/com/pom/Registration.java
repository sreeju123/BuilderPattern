package com.pom;

/**
 * @author Sreej
 */
public class Registration {

    private String title;
    private String body;
    private Integer userId;

    public Registration(String title, String body, Integer userId) {
        this.title = title;
        this.body = body;
        this.userId = userId;
    }

    public Registration(String body, Integer userId) {
        this.body = body;
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void getTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }



}
