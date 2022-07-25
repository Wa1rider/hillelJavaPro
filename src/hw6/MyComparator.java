package hw6;

import java.util.Comparator;

public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Car) o1).getBrand().compareTo(((Car) o2).getBrand());
    }
}
