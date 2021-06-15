package SpeedItUp;

import java.util.Comparator;

/**
 *
 * @author user
 */
public class SortNames implements Comparator<Parking>{

    @Override
    public int compare(Parking o1, Parking o2) {
      return   o1.getUser_name().compareTo(o2.getUser_name());
    }
    
}

