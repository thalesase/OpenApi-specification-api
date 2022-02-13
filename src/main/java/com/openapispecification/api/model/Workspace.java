package com.openapispecification.api.model;


public class Workspace {
    private String name;

    public Workspace(String name) {
        this.name = name;
    }

    public Workspace(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
