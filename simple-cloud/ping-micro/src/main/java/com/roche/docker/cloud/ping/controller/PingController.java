package com.roche.docker.cloud.ping.controller;

import com.roche.docker.cloud.commons.Ping;
import com.roche.docker.cloud.commons.Pong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class PingController {

    @Autowired
    @Qualifier("pongClient")
    private PongClient pongClient;

    @RequestMapping(value = "/ping")
    public Pong sendMessage(String content) {
        return pongClient.sendMessage(new Ping(UUID.randomUUID().toString(), content));
    }
}
