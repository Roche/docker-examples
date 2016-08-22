package com.roche.docker.cloud.commons;

public class MachineIDAwareImpl implements MachineIDAware {

    private String machineID = MachineID.getId();

    @Override
    public String getMachineID() {
        return machineID;
    }
}
