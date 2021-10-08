package org.thbs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean("service1")
    public Service getService()
    {
        return new ServiceA();
    }
    @Bean("client1")
    public Client getClient(Service service1)
    {
        return  new ClientA(service1);
    }
    @Bean
    public Service service2()
    {
        return  new ServiceB();
    }
    @Bean("client2")
    public Client client2(Service service2)
    {
        return new ClientB(service2);
    }
}
