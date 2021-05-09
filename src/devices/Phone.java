package devices;

public class Phone {
    public final String producer;
    public final String model;
    public final String operatingSystem;
    public final Double screenSize;

    public Phone(String producer, String model, String operatingSystem, Double screenSize) {
        this.producer = producer;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
    }

    String getOSVersion() {
        return "4.23.1";
    }
    public String toString(){
        return "Producer: "+producer+", Model: "+model+", Operating system: "+operatingSystem+", ScreenSize: "+screenSize;
    }
}
