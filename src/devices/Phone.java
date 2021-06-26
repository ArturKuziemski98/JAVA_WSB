package devices;
import java.net.URL;
import java.util.*;
import com.company.Human;
import com.company.Sellable;

public class Phone extends Device implements Sellable{

    public  String operatingSystem;
    public  Double screenSize;
    static public final String DEFAULT_APP_VERSION = "latest";
    static final String server = "https://server.com";
    static final String protocol = "Protcol";
    static final String version = "A1429";
    public HashSet<Application> appSet = new HashSet<Application>();

    public Phone(String model, String producer,Integer yearOfProduction, String operatingSystem, Double screenSize) {
       super(model,producer,yearOfProduction);
       this.operatingSystem = operatingSystem;
       this.screenSize = screenSize;
    }

    String getOSVersion() {
        return "4.23.1";
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
    this.installAnnApp(name,DEFAULT_APP_VERSION);
    }
    public void installAnnApp(String name,String version){
        this.installAnnApp(name,version,server);
    }
    public void installAnnApp(String name,String version,String server){
        this.installAnnApp(name,version,server);
    }
    public void installAnnApp(List<String> name){
        for (String names : name) {
            this.installAnnApp(name);
        }
    }
    public void installAnnApp(URL url){
        //sprawdzenie czy aplikacja jest płatna
        //obsługa akceptacji płatności
        //sprawdzanie czy mam kasę jeżeli jest płatna
        //sprawdzenie miejsca na dysku
        //obsługa płatności
        //pobieranie
        //walidacja pliku
        //skanowanie wirusów
        //rozpakowanie
        //instalacja
    }
    public void installNewApp(Human owner,Application app){
        if ( owner.cash > app.price){
                this.appSet.add(app);
                owner.cash -= app.price;
                System.out.println("Installed new App!");
        }
        else System.out.println("Not enought cash.");
    }
    public void appCheck(Application app){
        System.out.println( this.appSet.contains(app) );
    }
    public void appCheck(String name2){
        int index = 0;
        for (Application x:appSet){
            if (x.name == name2) {
                index += 1;
                break;
            }
        }
        if (index == 1) System.out.println("App with that name is installed.");
        else System.out.println("App with that name is not installed");
    }
    public void appFree() {
        int index = 0;
        for (Application x : appSet) {
            if (x.price == 0.00) {
                index +=1;
                System.out.println(x.name);
            }
        }
        if (index >= 1) System.out.println("These are free apps^");
        else System.out.println("There are no free apps.");
    }
    public void appAll() {
        for (Application x : appSet) {
                System.out.println("Apps installed on this phone: "+x.name+x.version+x.price);
        }
    }
    public void appsAZ(){
    List<Application> sortedList = new ArrayList<Application>(appSet);
    Collections.sort(sortedList);
    System.out.println(sortedList);
    }
    public void apps0(){
    List<Application> sortedList = new ArrayList<Application>(appSet);
    Collections.sort(sortedList, new CompareApp());
    System.out.println(sortedList);
    }
}
