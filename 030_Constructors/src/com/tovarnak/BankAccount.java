package com.tovarnak;

public class BankAccount {

    private String acNumber;
    private double acBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("56789",2.5,"Default name","Default address","Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String acNumber, double acBalance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameter called");
        this.acNumber = acNumber;
        this.acBalance = acBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999",100,customerName,email,phoneNumber);
    }

    public void setAcNumber(String acNumber){
        this.acNumber = acNumber;
    }

    public String getAcNumber(){
        return this.acNumber;
    }

    public void setAcBalance(int acBalance){
        this.acBalance = acBalance;
    }

    public double getAcBalance(){
        return this.acBalance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void depositFunds(double funds){
        this.acBalance += funds;
        System.out.println("Deposit complete, your account status is now: " + this.acBalance);
    }

    public void withdrawFunds(double funds){
        if (funds <= this.acBalance){
            this.acBalance -= funds;
            System.out.println("Withdraw complete, your account status is now: " + this.acBalance);
        }else{
            System.out.println("You have not so many funds on account");
        }
    }
}















