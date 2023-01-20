package com.example.serverlessfunction.model;

public class Subscriber {
    private Integer id;
    private String email;

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Subscriber(Integer id, String email) {
        this.id = id;
        this.email = email;
    }
}
