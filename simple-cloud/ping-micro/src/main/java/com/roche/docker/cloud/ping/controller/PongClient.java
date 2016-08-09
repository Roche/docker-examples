package com.roche.docker.cloud.ping.controller;

import com.roche.docker.cloud.commons.Ping;
import com.roche.docker.cloud.commons.Pong;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("pongmicro")
public interface PongClient {

    @RequestMapping(method = RequestMethod.POST, value = "/pong",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    Pong sendMessage(Ping ping);
}