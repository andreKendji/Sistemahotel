package entities;

public class Gest {
	
	private String name;
	private String email;
	private Integer phone;
	private Rooms room;
	public Gest() {
		
	}
	public Gest(String name, String email, Integer phone, Rooms room) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.room = room;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return 	room 
				+" gest: " 
				+name 
				+", email= " 
				+email 
				+", phone= " 
				+ phone;
	}
	
	
	

}
