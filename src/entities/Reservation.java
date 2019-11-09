package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private Gest gest;
	private Date checkIn; 
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public Reservation() {
		
	}
	public Reservation(Gest gest, Date checkIn, Date checkOut) {
		this.gest = gest;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	public Gest getGest() {
		return gest;
	}
	public void setGest(Gest gest) {
		this.gest = gest;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
		long diff = checkOut.getTime()-checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	@Override
	public String toString() {
		return "Reservation "
				+ gest 
				+ ", checkIn: "
				+ sdf.format(checkIn)
				+ ", checkOut: "
				+ sdf.format(checkOut);
	}
	
	
	
}
