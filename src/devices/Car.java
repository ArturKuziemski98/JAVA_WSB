package devices;
import com.company.*;
import java.util.ArrayList;

public abstract class Car extends Device {
    public String color;
    public String speed;
    public Double value;
    public ArrayList<Human>  owner = new ArrayList<Human>(5);
    public Car(String model, String producer, String yearOfProduction, String color, String speed, Double value) {
        super(model, producer, yearOfProduction);
        this.color = color;
        this.speed = speed;
        this.value = value;
    }
    public String toString() {
        return "Model: " + model + ", Producer: " + producer + ", Year of production: " + yearOfProduction + ", Color: " + color + ", Spped: " + speed + ", Value: " + value;
    }
    public Double showData(){
    return this.value;
    }
    public void turnOn() {
        System.out.println("Car Started!");
    }

    abstract void refuel();
    public void sell(Human buyer, Human seller, Double price) {
        if (seller.garage == null) {
            System.out.println("Seller has to have a car to sell and be the last owner.");
        } else if (price > buyer.cash) {
            System.out.println("You have to have enough cash to buy something.");
        }
        else {
            for (int x=0;x<buyer.garage.length;x++){
                if (buyer.garage[x] == null){
                   buyer.garage[x] = seller.garage[x];
                    this.owner.add(buyer);
                    seller.garage[0] = null;
                    buyer.cash = buyer.cash - price;
                    seller.cash = seller.cash + price;
                    System.out.println("Transaction has been finalized.");
                    Human last = this.owner.get(this.owner.size() - 1);
                   break;
                }
                else{
                    continue;
                }
            }
        }
    }
    public void anyOwners(){
    System.out.println("Is the ownership list empty? "+owner.isEmpty());
    }
    public void transaction(Human human1,Human human2){

        for (int i =1;i<this.owner.size();i++){
        if (this.owner.get(i-1)==human1 &&  this.owner.get(i)==human2)
        {
            System.out.println("Owner A sold the car to owner B.(This is what we are looking for)");
            break;
        }
         System.out.println("This transaction is not the one we are looking for, if statement is true a message will pop up.");
        }
    }
    public void transactionsCount(){
        System.out.println("How many transactions: "+owner.size());
    }
}