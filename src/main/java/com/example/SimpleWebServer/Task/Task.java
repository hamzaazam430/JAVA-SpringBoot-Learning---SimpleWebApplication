package com.example.SimpleWebServer.Task;

public class Task {
    private Long id;
    private String description;

    public Long getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":\"" + this.id + "\"" +
                "\"description\":\"" + this.description + "\"" +
                "}";
    }
}