package org.thbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("client2")
public class ClientB implements Client {
    Service service;
    @Autowired
    public ClientB(Service service2) {
        this.service = service2;
    }

    @Override
    public void doSomething() {
        System.out.println(service.getInfo());
    }
}
