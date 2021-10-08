package org.thbs;




public class ClientB implements Client {
    Service service;

    public ClientB(Service service2) {
        this.service = service2;
    }

    @Override
    public void doSomething() {
        System.out.println(service.getInfo());
    }
}
