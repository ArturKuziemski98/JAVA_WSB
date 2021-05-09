package devices;
import com.company.*;

public class Car {
    public final String model;
    public final String producent;
    public String color;
    public String speed;
    public Double value;

public Car(String model, String producent, String color, String speed, Double value){
    this.model = model;
    this.producent = producent;
    this.color = color;
    this.speed = speed;
    this.value = value;
}
public String toString(){
    return "Model: "+model+", Producent: "+producent+", Color: "+color+", Spped: "+speed+", Value: "+value;
}

}
