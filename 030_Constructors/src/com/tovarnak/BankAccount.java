package com.tovarnak;

public class BankAccount {

    private String acNumber;
    private double acBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

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















