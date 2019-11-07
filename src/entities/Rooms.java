package entities;

public class Rooms {
	
	private Integer room;
	private String roomStatus;
	
	public Rooms() {
	
	}
	public Rooms(Integer room) {
		this.room = room;
		
	}
	public Integer getRoom() {
		return room;
	}
	public void setRoom(Integer room) {
		this.room = room;
	}
	public String getroomStatus() {
		return roomStatus;
	}
	@Override
	public String toString() {
		return "Room: " + room;
	}
	
	
	
	
	

}
