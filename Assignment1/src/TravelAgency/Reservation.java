package TravelAgency;

public abstract class Reservation {
	//attributes
	private String name;
	
	//constructor 
	public Reservation(String clientName) {
		this.name = clientName; // name on reservation
	}
	
	public  final String reservationName() {
		return name; // get or retrieves name on reservation	
	}
	
	public abstract int getCost();
	public abstract boolean equals(Object O);
	
}

