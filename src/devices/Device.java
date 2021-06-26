package devices;

import com.company.Human;

import java.util.Locale;

public abstract class Device{
    public  String producer;
    public  String model;
    public  Integer yearOfProduction;
    public Double value;
    public Device(String producer,String model,Integer yearOfProduction){
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }
    public String toString(){
        return "Producer: "+producer+", Model: "+model+", Year od production: "+yearOfProduction;
    }
    public abstract void turnOn();

}
