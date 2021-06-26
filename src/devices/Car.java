package devices;
import com.company.*;
import java.util.ArrayList;

public abstract class Car extends Device implements Comparable<Car> {
    public String color;
    public String speed;
    public Double value;
    public ArrayList<Human>  owner = new ArrayList<Human>(5);
    public Car(String model, String producer, Integer yearOfProduction, String color, String speed, Double value) {
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
    public void sell(Human buyer, Human seller, Double price) throws Exception {
      if (!seller.haveCar(this)) {
          throw new Exception("STOLEN CAR!");
      }
      if (!buyer.haveFreeSpace()){
          throw new Exception("You need free space!");
      }
      if (buyer.getCash() < price){
          throw new Exception("You need cash!");
      }
      seller.removeCar(this);
      buyer.addCar(this);
      seller.setCash(seller.getCash() + price);
      buyer.setCash(buyer.getCash() - price);
      System.out.println("Transaction completed!");
    }
    public void anyOwners(){
    System.out.println("Is the ownership list empty? "+owner.isEmpty());
    }
    public void transaction(Human human1,Human human2){
        int index = 0;
        for (int i =1;i<this.owner.size();i++){
        if (this.owner.get(i-1)==human1 &&  this.owner.get(i)==human2)
        {
            index +=1;
            break;
        }
        }
        if (index >= 1)System.out.println("Person A sold a car to person B.");
        else System.out.println("Person A never sold a car to person B.");
    }
    public void transactionsCount(){
        System.out.println("How many transactions: "+owner.size());
    }
}