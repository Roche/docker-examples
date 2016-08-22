package com.roche.docker.cloud.commons;


import com.google.common.base.MoreObjects;

public class Ping extends MachineIDAwareImpl {
    private String id;
    private String content;

    public Ping() { }

    public Ping(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("content", content)
                .add("ping-machine", getMachineID())
                .toString();
    }
}
