package devices;

public class Disel extends Car{
    public Disel(String model, String producer,String yearOfProduction, String color, String speed, Double value) {
        super(model, producer, yearOfProduction, color, speed, value);
    }
    public void refuel(){
        System.out.println("Car has been refueld.");
    }
}
