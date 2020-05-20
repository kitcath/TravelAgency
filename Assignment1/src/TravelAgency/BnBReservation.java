package TravelAgency;

public class BnBReservation extends HotelReservation {
	
	//public constructor
	public BnBReservation(String name,Hotel aHotel,String typeOfRoom, int nightSpent) {
		super(name,aHotel,typeOfRoom, nightSpent); // inherits all the fields of HotelReservation
		
	}
	
	//cost method 
	public int getCost() {
		int summing;
		
		summing = super.getCost()+1000*super.getNumOfNights();
		
		return summing;
	}
}
