package devices;

public class LPG extends Car{
    public LPG(String model, String producer,String yearOfProduction, String color, String speed, Double value) {
        super(model, producer, yearOfProduction, color, speed, value);
    }
    public void refuel(){
    System.out.println("Car has been refueld.");
    }
}
