package com.openapispecification.api.model;


public class Specification {
    private String title;

    private String version;

    private String description;

    private String content;

    public Specification(String title, String version, String description, String content) {
        this.title = title;
        this.version = version;
        this.description = description;
        this.content = content;
    }

    public Specification(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
