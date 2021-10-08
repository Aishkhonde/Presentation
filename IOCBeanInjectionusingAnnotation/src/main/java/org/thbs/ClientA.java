package org.thbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("client1")
public class ClientA implements Client{

    Service service;
    @Autowired

    public ClientA(Service service1) {
        this.service = service1;
    }

    @Override
    public void doSomething() {
        System.out.println(service.getInfo());

    }
}
