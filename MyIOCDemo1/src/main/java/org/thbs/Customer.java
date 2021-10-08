package org.thbs;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
    private int custId;
    private String custName;
    private  Address address;
    private Account account;
    public Customer(Account account)
    {
        this.account=account;
    }

    public Customer(Address address)
    {
        this.address=address;
    }

}
