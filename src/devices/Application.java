package devices;

import java.util.Comparator;

public class Application implements Comparable<Application>{
    public String name;
    public String version;
    public Double price;
    public Application(String name,String version,Double price){
        this.name = name;
        this.version = version;
        this.price = price;
    }

    @Override
    public int compareTo(Application o) {
        int i = this.name.compareTo(o.name);
        return i;
    }

    @Override
    public String toString(){
        return "| Name: "+name+", Price: "+price;
    }

}
