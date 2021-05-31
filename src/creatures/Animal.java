package creatures;
import com.company.*;

import java.io.File;

public abstract class Animal implements Sellable,Feedable {
    final String species;
    public String name;
    public Double weight;
    File pic;
    static public final double DEFAULT_ANIMAL_WEIGHT = 1.0;
    public Animal(String species) {
        this.species = species;
        switch (this.species){
            case "dog":this.weight = 2.0;break;
            case "cat":this.weight = 1.0;break;
            case "cow":this.weight = 400.0;break;
            default:this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }
    public void feed() {
        if (this.weight <= 0) {
            System.out.println("Animal is dead, you can't feed him.");
        } else {
            this.weight += 1;
        }
    }
    public void feed(int foodWeight){
        if (this.weight <= 0) {
            System.out.println("Animal is dead, you can't feed him.");
        } else {
            this.weight = weight + foodWeight;
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
    public void sell(Human buyer, Human seller, Double price){
        if (seller.pet == null){
            System.out.println("Buyer has to have an Animal to sell.");
        }
        else if(price> buyer.cash){
            System.out.println("You have to have enough cash to buy something.");
        }
        else{
            buyer.cash = buyer.cash - price;
            seller.cash = seller.cash + price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("Transaction has been finalized.");
        }
    }

}
