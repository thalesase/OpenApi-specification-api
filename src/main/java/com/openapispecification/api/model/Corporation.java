package com.openapispecification.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Corporation {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

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
