package org.thbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {
    private int custId;
    private String custName;
    private  Address address;

    public Customer() {

    }

    public Customer(Address address) {
        this.address = address;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Address getAddress() {
        return address;
    }
@Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", address=" + address +
                '}';
    }
}
