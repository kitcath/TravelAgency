package TravelAgency;

public class Customer {
	String customerName;
	int customerBalance;
	Basket basket;
	
	//constructor
	public Customer(String customerName, int customerBalance) {
		this.customerName = customerName;
		this.customerBalance = customerBalance;
		basket = new Basket();
	}
	
	public String getName() {
		return customerName;
	}
	
	public int getBalance() {
		return customerBalance;
	}
	
	public Basket getBasket() {
		return basket;
		
	}
	
	public int addFunds(int addCents) {
		if ( addCents < 0) {
			throw new IllegalArgumentException(" Cannot add desired reservation");
		}
		
		 customerBalance = customerBalance + addCents;
		 return customerBalance;
	} 
	
	public int addToBasket(Reservation reservations) {
	
		if (reservations.reservationName().equalsIgnoreCase(customerName)){
			return basket.add(reservations);
			
		} else {
			throw new IllegalArgumentException(" name on reservation does not match name of client");
		}
	}
		
	public int addToBasket(Hotel anotherHotel, String roomType, int nightSpent, boolean breakfast) {
		
		
		if( breakfast == true) {
			
			BnBReservation	breakfastReservation = new BnBReservation(customerName,anotherHotel, roomType, nightSpent);
			int moreInBasket = basket.add(breakfastReservation); 
			return moreInBasket;
			} 
		
			if(breakfast == false) {
			HotelReservation noBreakfastReservation = new HotelReservation(customerName,anotherHotel, roomType,nightSpent);
			int moreBreakfast = basket.add(noBreakfastReservation);
			return moreBreakfast;
		}
			return 0;	
		
		
		
		
		
	} // end of second addToBasket method
	
	public int addToBasket(Airport One, Airport Two) {
		
		
		FlightReservation aFlightReservation = new FlightReservation (customerName, One, Two); // create an instance of a flight reservation
		return basket.add(aFlightReservation);
	} // end of third addToBASKET METHOD
	
	public boolean removeFromBasket(Reservation eliminateReservation ) {
				
		return basket.remove(eliminateReservation);
	
	}
	
	public int checkOut() {
		
		int grandTotalCost = basket.getTotalCost();
		int poorCustomerBalance = this.customerBalance - grandTotalCost;
		
		if (customerBalance < grandTotalCost ) {
			
			throw new IllegalStateException(" You don't have enough money!");
		} 
		
		else {
			
			basket.clear();
			return poorCustomerBalance;
			
		}
	}
	
	
}
