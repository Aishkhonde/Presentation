package org.thbs;

import org.springframework.stereotype.Component;

@Component("service1")
public class ServiceA implements Service{

    @Override
    public String getInfo() {
        return "ServiceA info";
    }
}
