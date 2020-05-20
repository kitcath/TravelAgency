package TravelAgency;
import java.lang.Math;


public class Airport {
	//attributes of Airport
	private int xCoordinates; 
	private int yCoordinates; 
	private int fees; //in cents
	
	/*
	 * Constructor for Airport class
	 */
	public Airport(int xCoordinates, int yCoordinates, int fees) {
		this.xCoordinates = xCoordinates; //the inputs initializes the corresponding attributes
		this.yCoordinates = yCoordinates; 
		this.fees = fees; 
	}
	
	// getFees method to retrieve the fees of the airport 
	
	public int getFees() {
		return this.fees;
	} 
	
	
	public static int getDistance(Airport Airport1, Airport Airport2) {
		double rawDistance = Math.sqrt(Math.pow((Airport1.xCoordinates-Airport2.xCoordinates),2)+Math.pow((Airport1.yCoordinates-Airport2.yCoordinates),2));
		int distance = (int) Math.ceil(rawDistance);
		
		return distance; // integer
	
	}

	
	
	
}// end of class



