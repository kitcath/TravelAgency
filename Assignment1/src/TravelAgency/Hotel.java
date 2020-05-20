package TravelAgency;
import TravelAgency.Room;

public class Hotel {
	//attributes of Hotel
	private String nameofHotel; 
	private Room[] rooms;
	
	
	//constructor
	public Hotel(String nameofHotel,Room[] inputRooms) {
		this.nameofHotel = nameofHotel;
	
		//create a new array of same size as the input array ( instantiate)
		Room[] cloneRoom = new Room [inputRooms.length];
	
		
		// loop to create a deep copy of the input array
		for(int i = 0; i <inputRooms.length; i++) {
			
			Room cloneInputs = new Room(inputRooms[i]);
			
			cloneRoom[i] = cloneInputs;			
		}
		
		//instantiate field array with the copy
		this.rooms = cloneRoom;
		
	}

	
	public int reserveRoom(String reservationType) {
		
	Room availableRoom =Room.findAvailableRoom(rooms, reservationType); // will look for a room in the array of rooms in the hotel with the specific type		
		
	if (Room.findAvailableRoom(rooms, reservationType) == null) {
	
			throw new IllegalArgumentException("no more rooms of that type available");
		
		}
	
	availableRoom.changeAvailability(); // change the value of the availability of the room
	return availableRoom.getPrice();
	
	}// end of reserveRoom
	
	public boolean cancelRoom(String typeToCancel) {
		
		
		boolean cancelRoom = Room.makeRoomAvailable(rooms,typeToCancel); // program will go through the array of rooms to find the particular type and will set true once availability is changed	
		return cancelRoom;
	} // end of makeRoomAvailable
	
	
}
	


