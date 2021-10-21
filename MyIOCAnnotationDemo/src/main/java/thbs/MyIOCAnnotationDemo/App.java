package thbs.MyIOCAnnotationDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
    	context.scan("thbs.MyIOCAnnotationDemo");
    	context.refresh();
    	
    	Customer cust=(Customer) context.getBean("customer");
    	cust.setCustId("100");
    	cust.setCustName("Aish");
    	Address addrs=cust.getAddress();
    	addrs.setDoorNo("1234");
    	addrs.setStreet("VK Colony");
    	addrs.setState("Karnataka");
    	addrs.setPin("585328");
    	
    	System.out.println(cust);
    	context.close();
    	
    }
}
