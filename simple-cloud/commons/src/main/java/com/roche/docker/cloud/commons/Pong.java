package com.roche.docker.cloud.commons;

import com.google.common.base.MoreObjects;

public class Pong {

    private String id;
    private String ping;
    private String pong;

    public Pong() { }

    public Pong(String id, String ping, String pong) {
        this.id = id;
        this.ping = ping;
        this.pong = pong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPong() {
        return pong;
    }

    public void setPong(String pong) {
        this.pong = pong;
    }

    public String getPing() {
        return ping;
    }

    public void setPing(String ping) {
        this.ping = ping;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("ping", ping)
                .add("pong", pong)
                .toString();
    }
}
