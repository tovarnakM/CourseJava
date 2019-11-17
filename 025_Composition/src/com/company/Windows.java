package com.company;

public class Windows {

    private boolean isOpen = false;
    private boolean isRain = false;

    public Windows(boolean isOpen, boolean isRain) {
        this.isOpen = isOpen;
        this.isRain = isRain;
    }

    public void openWindow(){
        if (!isRain){
            this.isOpen = true;
            System.out.println("Window has opened.");
        }else {
            this.isOpen = false;
            System.out.println("Window has closed");
        }
    }

    public boolean isOpen() {
        return isOpen;
    }

    public boolean isRain() {
        return isRain;
    }
}
