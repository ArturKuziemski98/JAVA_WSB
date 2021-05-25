package devices;

import java.util.Locale;

public abstract class Device {
    public  String producer;
    public  String model;
    public  String yearOfProduction;
    public Device(String producer,String model,String yearOfProduction){
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }
    public String toString(){
        return "Producer: "+producer+", Model: "+model+", Year od production: "+yearOfProduction;
    }
    public abstract String turnOn();
}
