package be.josimon.BWPOJO;

import java.time.LocalTime;
import java.util.Date;

/**
 * @author Simon Jonathan
 * @version 0.1
 */

public class Representation {
	// variable
	private int id;
	private Date date;
	private LocalTime beginHour;
	private LocalTime endHour;
	private Show show;
	
	// Getter & Setter
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public LocalTime getBeginHour() {
		return beginHour;
	}
	public void setBeginHour(LocalTime beginHour) {
		this.beginHour = beginHour;
	}
	public LocalTime getEndHour() {
		return endHour;
	}
	public void setEndHour(LocalTime endHour) {
		this.endHour = endHour;
	}
	public Show getShow() {
		return show;
	}
	public void setShow(Show show) {
		this.show = show;
	}
	
	// Constructor
	
	public Representation(int id, Date date, LocalTime beginHour, LocalTime endHour, Show show) {
		this.id = id;
		this.date = date;
		this.beginHour = beginHour;
		this.endHour = endHour;
		this.show = show;
	}
	
	public Representation(Date date, LocalTime beginHour, LocalTime endHour, Show show) {
		this.date = date;
		this.beginHour = beginHour;
		this.endHour = endHour;
		this.show = show;
	}
		
}
