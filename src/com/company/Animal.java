package com.company;

import java.io.File;

public class Animal {
    final String species;
    public String name;
    private Double weight;
    File pic;
    static public final double DEFAULT_ANIMAL_WEIGHT = 1.0;

    public void feed() {
        if (this.weight <= 0) {
            System.out.println("Animal is dead, you can't feed him.");
        } else {
            this.weight += 1;
        }
    }

    Animal(String species) {
        this.species = species;
        switch (this.species){
            case "dog":this.weight = 2.0;break;
            case "cat":this.weight = 1.0;break;
            case "cow":this.weight = 400.0;break;
            default:this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

   public void takeForAWalk() {
        System.out.println(this.weight);
        if (this.weight <= 0) {
            System.out.println("Animal is dead, you can't take it for a walk");
        } else {
            this.weight -= 1;
        }
    }
    public String toString(){
        return "Species: "+species+", Name: "+name+", Weight: "+weight;
    }
}
