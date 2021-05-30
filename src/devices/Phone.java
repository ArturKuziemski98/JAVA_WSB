package devices;
import java.util.*;
import com.company.Human;
import com.company.Sellable;

public class Phone extends Device implements Sellable{

    public  String operatingSystem;
    public  Double screenSize;
    static final String server = "https://server.com";
    static final String protocol = "Protcol";
    static final String version = "A1429";

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
    public void sell(Human buyer, Human seller, Double price){
        if (seller.mobilePhone == null){
            System.out.println("Buyer has to have an mobile phone to sell.");
        }
        else if(price> buyer.cash){
            System.out.println("You have to have enough cash to buy something.");
        }
        else{
            buyer.cash = buyer.cash - price;
            seller.cash = seller.cash + price;
            buyer.mobilePhone = seller.mobilePhone;
            seller.mobilePhone = null;
            System.out.println("Transaction has been finalized.");
        }
    }
    public void installAnnApp(String name){
    System.out.println(name);
    }
    public void installAnnApp(String name,String version){
    System.out.println(name+version);
    }
    public void installAnnApp(String name,String version,String server){
    System.out.println(name+version+server);
    }
    public void installAnnApp(List<String> name){
        System.out.println(name);
    }
}
