package com.company;

public class Main {

    public static void main(String[] args) {
       // BankAccount account = new BankAccount("SK123456",
         //       1200,"Peter","peter@gmail.com","+421 918 857 852");
        /*BankAccount account = new BankAccount("Markus","marku@gmail.com","+421 918 857 890");
        System.out.println("Account number " + account.getAccountNumber());
        System.out.println("Account balance " + account.getBalance());
        System.out.println("Account customer " + account.getCustomerName());
        System.out.println("Account email " + account.getEmail());
        System.out.println("Account phone " + account.getPhoneNumber());
        System.out.println();

        account.makeDeposit(0.15);
        account.makeWithdraw(100000);
        account.makeWithdraw(1);*/

        /*VipCustomer vipCustomer = new VipCustomer("Peter",1000000000,"peter@gmail.com");
        System.out.println(vipCustomer.getName());
        System.out.println(vipCustomer.getCreditLimit());
        System.out.println(vipCustomer.getEmailAddress());*/

        //Wall wall = new Wall(4,5);
        //System.out.println(wall.getArea());

        /*Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println(first.distance());
        System.out.println(first.distance(2,2));
        System.out.println(first.distance(second));*/

        /*Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75,4.0);
        Calculator calculator = new Calculator(floor,carpet);
        System.out.println("Total cost " + calculator.getTotalCost());*/

        ComplexNumber one = new ComplexNumber(1,1);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        number.subtract(one);
        System.out.println(number.getReal());
        System.out.println(number.getImaginary());

    }
}
