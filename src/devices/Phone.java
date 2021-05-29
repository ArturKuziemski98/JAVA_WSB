package devices;

import com.company.Human;
import com.company.Sellable;

public class Phone extends Device implements Sellable{

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
    public void sell(Human buyer, Human seller, Double price){
        if (seller.mobilePhone == null){
            System.out.println("Buyer has to have an Animal to sell.");
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
}
