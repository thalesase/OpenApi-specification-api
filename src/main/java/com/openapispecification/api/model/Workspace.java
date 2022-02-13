package com.openapispecification.api.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Workspace {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Corporation corporation;

    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(
            name = "user_workspace",
            joinColumns = @JoinColumn(name = "id_workspace"),
            inverseJoinColumns = @JoinColumn(name = "id_user"))
    private List<User> userList;

    public Workspace() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Corporation getCorporation() {
        return corporation;
    }

    public List<User> getUserList() {
        return userList;
    }
}
