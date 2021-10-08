package org.thbs;

public class HDFC implements Bank{
    @Override
    public double getBalance(long accid) {
        System.out.println("HDFC:getBalance");
        return Math.random()*10000;
    }

    @Override
    public double withdraw(long accid, double amount) {
        System.out.println("HDFC:withdraw");
        return Math.random()*10000;
    }

    @Override
    public double deposit(long accid, double amount) {
        System.out.println("HDFC:deposit");
        return Math.random()*10000;
    }
}
