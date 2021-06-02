package devices;

import java.util.Comparator;

public class CompareApp implements Comparator<Application> {
    @Override
    public int compare(Application o1, Application o2) {
        double i = o1.price.compareTo(o2.price);
        return 0;
    }
}
