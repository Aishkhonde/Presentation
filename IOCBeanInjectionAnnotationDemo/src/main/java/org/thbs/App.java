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
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        Client c1=(Client) context.getBean("client1");
        c1.doSomething();

        Client c2=(Client) context.getBean("client2");
        c2.doSomething();

        context.close();


    }
}
