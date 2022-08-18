package com.pom;

/**
 * @author Sreej
 */
public class RegistrationBuilder {

    private String title;
    private String body;
    private Integer userId;


    public RegistrationBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public RegistrationBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public RegistrationBuilder setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Registration build(){
        return new Registration(title,body,userId);
    }


}
