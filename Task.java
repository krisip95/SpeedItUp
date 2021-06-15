package SpeedItUp;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task {

    /**
     * @param args the command line arguments
     */
	
	private static Parking enterData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number of parking lot!");
        String number = scanner.nextLine();
        System.out.println("Please, enter the name:");
        String user = scanner.nextLine();
        System.out.println("Please, enter a description.");
        String description = scanner.nextLine();
        System.out.println("Please, enter an area of parking lot!");
        String area = scanner.nextLine();
        return new Parking(Integer.parseInt(number), Float.parseFloat(area), user,description);
    }
	
    public static void main(String[] args) {
       Parking park1 = enterData();//enter data by console
       ArrayList<Parking> parking = new ArrayList<>(Parking.PARKING_SPACE);//init array list with size of 154
       parking.add(park1);
       //init test data
       
       boolean has74= false;
       for(int i =0; i<Parking.PARKING_SPACE-1; i++)
       {
    	   Parking park = enterData();//enter data by console
    	   parking.add(park);
    	   if(park.getParkingNumber()==74)
    	   {
    		   has74=true;
    	   }
       }
      if(has74==false)
      {
       Parking park74 = new Parking(74, 10.0f, "Paul", "test message");
       parking.add(park74);
      }
      
       Iterator<Parking> it = parking.iterator();
       Parking p = null;
       Parking firstLot = null;
       while(it.hasNext()){
           p = it.next();
         
           if(p.getParkingNumber() == 74){
               firstLot = p;
               it.remove();
           }
       }
       Collections.sort(parking, new SortNames());
       System.out.println("After sorting by name:");
       System.out.println(firstLot);
       parking.forEach((n) -> System.out.println(n));
       System.out.println("#################################");
       System.out.println("After sorting by number:");
       Collections.sort(parking, new SortNumberLot());
       System.out.println(firstLot);
       parking.forEach((n) -> System.out.println(n));
       System.out.println("#################################");
       System.out.println("After sorting by area:");
       System.out.println(firstLot);
       Collections.sort(parking, new SortArea());
       parking.forEach((n) -> System.out.println(n));
    }
    /**
     * 
     * @return new Parking()
     * this method gets input by console
     */
    
}

