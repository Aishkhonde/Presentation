package org.thbs;

import org.springframework.stereotype.Component;

@Component("service2")
public class ServiceB implements Service{
    @Override
    public String getInfo() {
        return "ServiceB info";
    }
}
