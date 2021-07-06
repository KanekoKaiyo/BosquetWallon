package be.josimon.BWPOJO;


/**
 * @author Simon Jonathan
 * @version 0.1
 */


public class Ticket {
	// Variable
	private int id;
	private double price;
	private Representation representation;
	
	// Getter & Setter
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Representation getRepresentation() {
		return representation;
	}
	public void setRepresentation(Representation representation) {
		this.representation = representation;
	}
	
	
	// Constructor
	
	public Ticket(double price) {
		this.price = price;
	}
	
	public Ticket(int id, double price) {
		this.id = id;
		this.price = price;
	}
	
}
