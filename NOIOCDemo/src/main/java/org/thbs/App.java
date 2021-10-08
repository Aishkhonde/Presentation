package org.thbs;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//       Address address=new Address();
//       address.setDoorNo("17");
//       address.setStreet("Dream Meadows layout Street");
//       address.setCity("Bangalore");
//       address.setState("Karnataka");
//       address.setPin("560100");

        Address address=new Address("17","Dream Meadows street","bang","Karnataka","560100");

       Customer cust=new Customer(address);
       cust.setCustId(100);
       cust.setCustName("Aishwarya");
       //cust.setAddress(address);
        //Customer cust=new Customer(100,"Aish",address);


        System.out.println(cust);

    }
}
