package com.roche.docker.cloud.pong.controller;

import com.roche.docker.cloud.commons.Ping;
import com.roche.docker.cloud.commons.Pong;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class PongController {

    @Value("${pong.message}")
    private String message;

    @RequestMapping(value = "/pong", method = RequestMethod.POST)
    public Resource<Pong> pongMessage(@RequestBody Ping input) {
        return new Resource<>(pong(input));
    }

    private Pong pong(Ping ping) {
        return new Pong(ping.getId(), ping.getContent(), message + " " + new Date(), ping.getMachineID());
    }

}
