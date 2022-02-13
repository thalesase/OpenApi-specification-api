package com.openapispecification.api.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String username;

    @ManyToOne
    private Corporation corporation;

    @ManyToMany(mappedBy = "userList")
    private List<Workspace> workspaceList;

    public User(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Corporation getCorporation() {
        return corporation;
    }


    public List<Workspace> getWorkspaceList() {
        return workspaceList;
    }
}
