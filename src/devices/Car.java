package devices;
import com.company.*;

public abstract class Car extends Device{
    public String color;
    public String speed;
    public Double value;

public Car(String model, String producer,String yearOfProduction, String color, String speed, Double value){
 super(model,producer,yearOfProduction);
 this.color = color;
 this.speed =speed;
 this.value = value;
}
public String toString(){
    return "Model: "+model+", Producer: "+producer+", Year of production: "+yearOfProduction+", Color: "+color+", Spped: "+speed+", Value: "+value;
}
public void turnOn(){
    System.out.println("Car Started!");
}
abstract void refuel();
}
