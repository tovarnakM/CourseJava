package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{

    private String name;
    private int hitsPoint;
    private int strength;

    public Monster(String name, int hitsPoint, int strength) {
        this.name = name;
        this.hitsPoint = hitsPoint;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitsPoint() {
        return hitsPoint;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoint=" + hitsPoint +
                ", strength=" + strength +
                '}';
    }


    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0,this.name);
        values.add(1,"" + this.hitsPoint);
        values.add(2, "" + this.strength);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0){
            this.name = savedValues.get(0);
            this.hitsPoint = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }
}
