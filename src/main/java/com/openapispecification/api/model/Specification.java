package com.openapispecification.api.model;

import javax.persistence.*;

@Entity
public class Specification {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String version;

    private String description;

    private String content;

    @ManyToOne
    private Workspace workspace;

    public Specification() {}

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getVersion() {
        return version;
    }

    public String getDescription() {
        return description;
    }

    public String getContent() {
        return content;
    }

    public Workspace getWorkspace() {
        return workspace;
    }
}
