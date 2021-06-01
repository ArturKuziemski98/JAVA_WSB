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
    public void transaction(){

    }
    public void transactionsCount(){
        System.out.println("How many transactions: "+owner.size());
    }
}