package com.roche.docker.cloud.commons;

import org.springframework.util.DigestUtils;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collection;
import java.util.Collections;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class MachineID {

    private static final Object MUTEX = new Object();

    private static MachineID machineID;
    private final String id;

    private MachineID() {
        String temp;
        try {
            temp = Collections.list(NetworkInterface.getNetworkInterfaces())
                            .stream()
                            .map(NetworkInterface::getInetAddresses)
                            .map(Collections::list)
                            .map(Collection::stream)
                            .flatMap(Function.identity())
                            .map(InetAddress::getHostAddress)
                            .map(String::getBytes)
                            .map(DigestUtils::md5DigestAsHex)
                            .collect(Collectors.joining());
        } catch (SocketException e) {
            temp = UUID.randomUUID().toString();
        }

        id = temp;
    }


    public static String getId() {
        if (machineID == null) {
            synchronized (MUTEX) {
                if (machineID == null) {
                    machineID = new MachineID();
                }
            }
        }
        return machineID.id;
    }
}
