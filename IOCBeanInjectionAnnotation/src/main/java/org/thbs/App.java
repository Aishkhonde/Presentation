package org.thbs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
        context.scan("org.thbs");
        context.refresh();

        Customer customer=(Customer) context.getBean("customer");
        customer.setCustId(100);
        customer.setCustName("Aishwarya");

        Address address=customer.getAddress();
        address.setDoorNo("120");
        address.setStreet("Dream Meadows");
        address.setCity("Bang");
        address.setState("Karnataka");
        address.setPin("560100");

        System.out.println(customer);
    }
}
