package com.company;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("SK123456", 1200,"Peter","peter@gmail.com","+421 587 514 212");
        System.out.println("1. constructors");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("2. constructors");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999",100.5,customerName,email,phoneNumber);
        System.out.println("3. constructors");
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void makeDeposit(double deposit){
        this.balance += deposit;
        System.out.println("Deposit done, you entered " + deposit + " and total balance is now " + this.balance);
    }

    public void makeWithdraw(double withdraw){
        if (this.balance - withdraw < 0){
            System.out.println("You have not insufficient funds to withdraw on bank account");
        }else {
            this.balance -= withdraw;
            System.out.println("Withdraw " + withdraw + " done and total balance is now " + this.balance);
        }
    }
}
