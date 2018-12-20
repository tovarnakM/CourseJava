package com.tovarnak;

import java.util.Scanner;

public class Printer {
    private int tonerLevel = 100;
    private int numOfPagesPrinted;
    //for duplex using the similar process like in onePagePrinting
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int numOfPagesPrinted, boolean duplexPrinter) {
        if (tonerLevel > -1 && tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        }
        this.numOfPagesPrinted = numOfPagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel += tonerLevel;
        if (this.tonerLevel > 100){
            this.tonerLevel = 100;
        }
    }
    public boolean canPrint(){
        return this.numOfPagesPrinted <= this.tonerLevel;
    }

    public void onePagePrinting(int pages){
        // 1 pages require 2 tonerLever
        int num = 1;
        while (true) {
            if (this.tonerLevel > 0) {
                System.out.println("Printing " + num + ". page");
                this.tonerLevel -= 1;
                this.numOfPagesPrinted++;
                if (num == pages){
                    System.out.println("complete");
                    break;
                }
                num++;
            } else {
                System.out.println("Not enough tonerLevel, please fill up");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Confirm printing: (true/false)");
                boolean print = scanner.nextBoolean();
                scanner.nextLine();
                if (!print){
                    System.out.println("Printing denied");
                    break;
                }else {
                    System.out.println("Enter toner level");
                    int toner = scanner.nextInt();
                    setTonerLevel(toner);
                    scanner.nextLine();

                }
            }
        }
    }

    public int getTonerLevel() {
        return this.tonerLevel;
    }

    public int getNumOfPagesPrinted() {
        return this.numOfPagesPrinted;
    }

}
