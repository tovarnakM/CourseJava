package com.tovarnak;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validateModel = model.toLowerCase();
        if ((validateModel.equals("carrera")) || validateModel.equals("commodore")){
            this.model = model;
        }else {
            this.model = "Unknown";
        }
    }
    public String getModel(){
        return this.model;
    }
}
