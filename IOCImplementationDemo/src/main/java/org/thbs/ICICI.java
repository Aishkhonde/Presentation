package org.thbs;

public class ICICI implements Bank{
    @Override
    public double getBalance(long accid) {
        System.out.println("ICICI:getBalance");
        return Math.random()*10000;
    }

    @Override
    public double withdraw(long accid, double amount) {
        System.out.println("ICICI:withdraw");
        return Math.random()*10000;
    }

    @Override
    public double deposit(long accid, double amount) {
        System.out.println("ICICI:deposit");
        return Math.random()*10000;
    }
}
