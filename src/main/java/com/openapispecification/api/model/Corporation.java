package com.openapispecification.api.model;


public class Corporation {
    private String name;

    public Corporation(String name) {
        this.name = name;
    }

    public Corporation(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
