package devices;

import java.util.Comparator;

public class CarSort implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
      if (o1 == null && o2 ==null){
          return 0;
      }
       else if (o1 == null){
           return -1;
       }
       else if (o2 == null){
           return 1;}

    if(o1.yearOfProduction > o2.yearOfProduction ){
        return -1;
    }else if (o1.yearOfProduction < o2.yearOfProduction){
        return 1;}
    else{
      return 0; }
}
}
