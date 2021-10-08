package org.thbs;

public class THClient {
    Bank bank;
    //for Constructor injection
    public THClient(Bank bank)
    {
        this.bank=bank;
    }

    public Bank getBank() {
        return bank;
    }
//for setter injection
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public double getBalance(long accid)
    {
        System.out.println("In torry Harris client:Get Balance");
        return bank.getBalance(accid);
    }
    public double withdraw(long accid,double amount)
    {
        System.out.println("In torry Harris client:Withdraw");
        return bank.withdraw(accid,amount);
    }
    public double deposit(long accid,double amount)
    {
        System.out.println("In torry Harris client:deposit");
        return bank.deposit(accid,amount);
    }

}
