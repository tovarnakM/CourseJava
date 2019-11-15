package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());

        SimpleCalculator calc = new SimpleCalculator();
        calc.setFirstNumber(5);
        calc.setSecondNumber(4);
        System.out.println(calc.getAdditionResult());
        System.out.println(calc.getSubtractionResult());
        System.out.println(calc.getMultiplicationResult());
        System.out.println(calc.getDivisionResult());

        Person person = new Person();
        person.setFirstName("Martin");
        person.setLastName("Week");
        System.out.print(person.getFullName());
    }
}
