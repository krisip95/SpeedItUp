package SpeedItUp;

import java.util.Comparator;

/**
 *
 * @author user
 */
public class SortArea implements Comparator<Parking>{

    @Override
    public int compare(Parking o1, Parking o2) {
       int num1 = Math.round(o1.getArea());
       int num2 = Math.round(o2.getArea());
        return num1 - num2;
    }
    
}