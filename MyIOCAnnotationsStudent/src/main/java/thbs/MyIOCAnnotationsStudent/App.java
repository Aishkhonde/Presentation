package thbs.MyIOCAnnotationsStudent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
    	context.scan("thbs.MyIOCAnnotationsStudent");
    	context.refresh();
    	
    	Student s=(Student) context.getBean("student");
    	s.setId("100");
    	s.setName("Aish");
    	Address a=s.getAddress();
    	a.setCity("Bang");
    	a.setState("karnataka");
    	Chair c=s.getChair();
    	c.setColour("blue");
    	c.setType("stretch");
    	
    	System.out.println(s);
    	context.close();
    }
}
