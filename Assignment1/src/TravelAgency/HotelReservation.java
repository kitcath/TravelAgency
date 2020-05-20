package TravelAgency;

public class HotelReservation extends Reservation {
	//attributes
	private Hotel aHotel; // this object has a hotel name and an array of rooms
	private String typeOfRoom;
	private int nightSpent;
	private int price; // in cents
	
	//constructors
	public HotelReservation( String name, Hotel aHotel, String typeOfRoom, int nightSpent) {
		super(name);
		this.aHotel = aHotel;
		this.typeOfRoom = typeOfRoom;
		this.nightSpent = nightSpent; // returns an integer of nights
		this.price = aHotel.reserveRoom(typeOfRoom); // return the price of the input typeOfRoom
			
	}
	
	public int getNumOfNights() {
		return nightSpent;
	}
	
	public int getCost() {
		
		
	return (price * nightSpent);
		
	}
	public boolean equals (Object o) {
		//if the object is compared with itself then return true
				if(	this == o) {
					return true;
					
				} 				 
				 if(o instanceof HotelReservation) {
					 
					 HotelReservation compares = (HotelReservation) o;
				if((this.reservationName()).equalsIgnoreCase(compares.reservationName()) &&this.aHotel.equals(compares.aHotel) && this.typeOfRoom.equalsIgnoreCase(compares.typeOfRoom)&&(this.nightSpent == compares.nightSpent) &&(this.getCost() == compares.getCost())) {
				
						return true;
				 }
		
	}// end of instanceofHotelReservation loop
	
		return false;

}// end of boolean method
}// end of class
