package org.thbs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/main/java/beans.xml");
        Customer customer=(Customer)context.getBean("customer");
        customer.setCustId(100);
        customer.setCustName("Aishwarya");

        Address address=(Address)customer.getAddress();
        address.setDoorNo("130");
        address.setStreet("Dream Meadows street");
        address.setCity("Bang");
        address.setState("karnataka");
        address.setPin("560100");

        Account account=(Account)customer.getAccount();
        account.setAccId("123");
        account.setAcctype("Savings");
        System.out.println(customer);
        ClassPathXmlApplicationContext cpc=(ClassPathXmlApplicationContext) context;
        cpc.close();
    }
}
