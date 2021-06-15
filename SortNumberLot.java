package SpeedItUp;


import java.util.Comparator;

/**
 *
 * @author user
 */
public class SortNumberLot implements Comparator<Parking>{

    @Override
    public int compare(Parking p1, Parking p2) {
       return p1.getParkingNumber() - p2.getParkingNumber();
    }
    
}