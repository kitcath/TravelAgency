package TravelAgency;


public class Basket {
	//attributes	
	 private Reservation[] reservations;
	
	//constructor
	public Basket() {
	this.reservations = new Reservation [0]; //initialize array with no reservations
	}
	
	public Reservation[] getProducts() {
		
		
		//create new array of the same size 
		Reservation[] shallowCopyReservation = new Reservation [reservations.length] ;
		for ( int i = 0; i < reservations.length; i++ ) {
		shallowCopyReservation[i] = reservations[i];
		}		
		
		return shallowCopyReservation;
	
	}

	
	public boolean remove(Reservation reservationOne) {
		
		//create another array of size one less
		Reservation[] smallerReservation = new Reservation[reservations.length-1];
		
		for ( int i = 0; i < reservations.length; i ++ ) {
			// find if there is a match
			if (reservations[i].equals(reservationOne)){
				
				//copy all elements until removed index
				for(int j= 0; j < i; j++) {
					
					smallerReservation [j] = reservations[j];
				}// end of copying
				
				for ( int k = i; k <reservations.length-1; k++) {
					
					// if it isnt, copy the data from input array to the new one
					smallerReservation[k] = reservations[k+1];
					
					
					
				} // end of  removal for loop
				
			reservations= smallerReservation; // assign the reservation array in the basket to the smaller reservation 
			return true;	
				
			}// end of check if equal loop
		}// end of for loop trying to find if a reservation exists
	return false;
	}// end of method

	public void clear() {
		reservations = new Reservation[0];
					
	}// end of clear method
	
	public int getNumOfReservations() {
		int sizeOfReservations = reservations.length;
		return sizeOfReservations;
	}
	
	public int getTotalCost() {
		int sum = 0;
		
		for ( int h = 0; h < reservations.length; h++) {
			sum = sum + reservations[h].getCost();
		}
		
		return sum;
		
	}

	public int add(Reservation reservations2) {
		
		int n = reservations.length;
		//create a new array with extra index;
				Reservation[] anotherReservation = new Reservation[n +1];
				
				
				//copy the reservations from reservation to anotherReservation. insert all elements
				// till reservations.length
				// then insert input at reservation.length
			
				for (int i = 0; i< reservations.length; i++) {
					
					anotherReservation[i] = reservations[i];
					
					
				}// end of for loop 
				
				//add  element to reservation +1
				
				anotherReservation[n] = reservations2;
				
				this.reservations = anotherReservation; //instantiate the field array with the added data
				
				
				return reservations.length;
		
	}

	
	
}// end of class


