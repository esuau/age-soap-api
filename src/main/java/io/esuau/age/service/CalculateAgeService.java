package io.esuau.age.service;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalculateAgeService {

    @PayloadRoot(localPart = "a")
    @ResponsePayload
    public void calculate() {

    }

}
