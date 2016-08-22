package com.roche.docker.cloud.commons;

import com.google.common.base.MoreObjects;

public class Pong extends MachineIDAwareImpl {

    private String id;
    private String ping;
    private String pong;
    private String pingIP;

    public Pong() { }

    public Pong(String id, String ping, String pong, String pingIP) {
        this.id = id;
        this.ping = ping;
        this.pong = pong;
        this.pingIP = pingIP;
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

    public String getPingIP() {
        return pingIP;
    }

    public void setPingIP(String pingIP) {
        this.pingIP = pingIP;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("ping", ping)
                .add("pong", pong)
                .add("ping-machine", pingIP)
                .add("pong-machine", getMachineID())
                .toString();
    }
}
