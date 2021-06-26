package devices;

public class Disel extends Car{
    public Disel(String model, String producer,Integer yearOfProduction, String color, String speed, Double value) {
        super(model, producer, yearOfProduction, color, speed, value);
    }
    public void refuel(){
        System.out.println("Car has been refueld.");
    }

    @Override
    public int compareTo(Car o) {
        if (o.yearOfProduction < this.yearOfProduction){
            return 1;
        }else if ( o.yearOfProduction > this.yearOfProduction) {
            return -1;
        }else{
            return 0;}
    }
}
