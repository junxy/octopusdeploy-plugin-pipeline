package com.octopusdeploy.api;

/**
 * A simplified representation of a Channel in OctopusDeploy.
 */
public class Channel {
    private final String id;

    public String getId() {
        return id;
    }

    private final String projectId;

    public String getProjectId() {
        return projectId;
    }

    private final String name;

    public String getName() {
        return name;
    }

    private final String description;

    public String getDescription() {
        return description;
    }

    public Channel(String id, String projectId, String name, String description) {
        this.id = id;
        this.projectId = projectId;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Channel [id=" + id + ", projectId=" + projectId + ", name=" + name + ", description=" + description + "]";
    }

}
