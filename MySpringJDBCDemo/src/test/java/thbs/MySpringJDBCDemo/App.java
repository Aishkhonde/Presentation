package thbs.MySpringJDBCDemo;

import java.util.ArrayList;

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
       // System.out.println( "Hello World!" );
    	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	EmployeeDAO empdao=(EmployeeDAO) context.getBean("employeeDAO");
    	//Employee emp=new Employee();
//    	emp.setEmployeeId(1002);
//    	emp.setEmployeeName("Aishwarya");
//    	emp.setSalary(70000);
//    	empdao.insert(emp);
//    	System.out.println("One record added");
//    	
    	
//    	ArrayList<Employee> elist=(ArrayList<Employee>) empdao.selectAll();
//    	for(Employee e:elist)
//    	{
//    		System.out.println(e);
//    	}
    	
    	Employee employee=empdao.selectAEmployee(1000);
    	System.out.println(employee);
    }
}
