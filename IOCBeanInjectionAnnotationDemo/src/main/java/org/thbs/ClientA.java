package org.thbs;




public class ClientA implements Client{

    Service service;


    public ClientA(Service service1) {
        this.service = service1;
    }

    @Override
    public void doSomething() {
        System.out.println(service.getInfo());

    }
}
