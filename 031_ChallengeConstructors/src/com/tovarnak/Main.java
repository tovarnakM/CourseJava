package com.tovarnak;

public class Main {

    public static void main(String[] args) {

        //
        //
        //          ****CHALLENGE****
        //
        //
        //  Create a new class VipCustomer
        //  It should have 3 fields: name, credit limit, email
        //  Create 3 constructors
        //  1st constructor empty should call the constructor with 3 parameters with default values
        //  2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        //  3rd constructor should save all fields
        //  Create getters only for this using code generation of Intellij as setters wont be needed
        //  Test and confirm it works

        VipCustomer myCustomer1 = new VipCustomer();
        System.out.println(myCustomer1.getName() + " client");
        System.out.println(myCustomer1.getCreditLimit() + " credit limit.");
        System.out.println(myCustomer1.getEmail() + " address");
        System.out.println();

        VipCustomer myCustomer2 = new VipCustomer(499,"email@tuke.sk");
        System.out.println(myCustomer2.getName() + " client");
        System.out.println(myCustomer2.getCreditLimit() + " credit limit.");
        System.out.println(myCustomer2.getEmail() + " address");
        System.out.println();

        VipCustomer myCustomer3 = new VipCustomer("Peter",120,"azet@sk");
        System.out.println(myCustomer3.getName() + " client");
        System.out.println(myCustomer3.getCreditLimit() + " credit limit.");
        System.out.println(myCustomer3.getEmail() + " address");
    }
}
