package TravelAgency;

public class Room {
	// attributes of Room
	private String type; 
	private int price;
	private boolean availability; 
	
	
		
	/*
	 * CONSTRUCTOR THAT STORES ROOM TYPE AND PRICES 
	 */
	public Room( String type) {
		this.type = type; 
		this.availability = true; //set the availability for a new room to be true 
		
		
		if (this.type == "double") {
			this.price = 90*100; // return in cents
		
		} else if (this.type == "queen") {
			this.price  = 110*100;
		} else if (this.type == "king") {
			this.price  = 150*100;
			
		} else  {
		
			throw new IllegalArgumentException("There is no room of such type can be create");
		}
		
	}
	
	/*
	 * Constructor that takes a Room as input and creates a copy of the input room
	*/
	
	public Room(Room inputRooms) {
		this.type = inputRooms.type;
		this.price = inputRooms.price;
		this.availability = inputRooms.availability;
	}
	// getter methods for room type and price of the room 
	
	public String getType() {
		return this.type;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void changeAvailability() {
		
		
		if(availability == true) {
			this.availability = false;
		} else if(availability == false) {
			this.availability = true;
		}
		
	}
	
	
	public static Room findAvailableRoom(Room[] rooms, String type) {
	
		
		for (int i = 0; i < rooms.length; i++) {
			
			if((rooms[i].getType()).equalsIgnoreCase(type) && rooms[i].availability == true) {
				return rooms[i];
			}
			
		}
		
		return null;
		
	} // end of findAvailableRoom method
	
	public static boolean  makeRoomAvailable(Room[] rooms, String type) {
		
		for(int count = 0; count < rooms.length; count++) {
			
			if((rooms[count].getType()).equalsIgnoreCase(type) && rooms[count].availability== false) {
				rooms[count].availability = true;	
			
				return true;
			} // end of if statement		
		} // end of for statement
		
	return false;
	} // end of makeRoomAvailable
	

}
