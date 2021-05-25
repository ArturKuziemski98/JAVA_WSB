package devices;

public class Phone extends Device{

    public  String operatingSystem;
    public  Double screenSize;

    public Phone(String model, String producer,String yearOfProduction, String operatingSystem, Double screenSize) {
       super(model,producer,yearOfProduction);
       this.operatingSystem = operatingSystem;
       this.screenSize = screenSize;
    }

    String getOSVersion() {
        return "4.23.1";
    }
    public String toString(){
        return "Producer: "+producer+", Model: "+model+", Year of production: "+yearOfProduction+", Operating system: "+operatingSystem+", ScreenSize: "+screenSize;
    }
    public void turnOn(){
        System.out.println("Phone turned on!");
    }
}
