package TravelAgency;
import TravelAgency.Airport;

public class FlightReservation extends Reservation{	
	//attributes
	private Airport Departure;
	private Airport Arrival;
	
	//constructor
	public FlightReservation(String clientName, Airport Departure, Airport Arrival) {
		super(clientName);
		this.Departure= Departure; // initialize the fields
		this.Arrival = Arrival; // initialize the fields
		
		if(Departure.equals(Arrival)) {
			throw new IllegalArgumentException("The Depature Airport cannot be the same as the Arrival Airport");
		} // if statement
	}//end of constructor
	

	public int getCost() {
		
		int airportFees = this.Departure.getFees() + this.Arrival.getFees(); // yields values in CENTS	
		double otherExpenses = 53.75; // in dollars
		
		double fuelCost = (((double) TravelAgency.Airport.getDistance( this.Departure, this.Arrival))/ 167.52) * 1.24;
		double flightCost = (fuelCost + otherExpenses)*100;
		int centCost = (int) Math.ceil(flightCost);
		
		
		int totalCentsCost = centCost + airportFees;
	
		
		
		return totalCentsCost;
		
	} // end of getCost
	
	public boolean equals(Object o) {
		
		//if the object is compared with itself then return true
		if(	o == null) {
			return false;
		} 				 
		 if(o instanceof FlightReservation) {
			 if(((FlightReservation) o).Departure.equals(Departure)&&(((FlightReservation) o).Arrival.equals(Arrival))) {
				 return true;
			 };
		 }
		return false;
	}

} // end of FlightReservation class
