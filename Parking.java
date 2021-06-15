package SpeedItUp;

public class Parking {
	  public static final  int PARKING_SPACE = 154;
	  private int parkingNumber;
	  private float area;
	  private String user_name;
	  private String description;
	  
	  public Parking(int parkingNumber, float area, String user_name, String description) {
			this.parkingNumber = parkingNumber;
			this.area = area;
			this.user_name = user_name;
			this.description = description;
		}

	    public int getParkingNumber() {
	        return parkingNumber;
	    }

	    public float getArea() {
	        return area;
	    }

	    public String getUser_name() {
	        return user_name;
	    }

	    @Override
	    public String toString() {
	        return "Number "+parkingNumber + " area: "+area+" user: "+user_name + " desc: "+description;
	    }

}

	  