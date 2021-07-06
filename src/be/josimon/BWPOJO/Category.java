package be.josimon.BWPOJO;

public class Category {
	// variable
	private int id;
	private String type;
	private double price;
	private int availableTickets;
	private int maximumTickets;
	
	// Getter & Setter
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAvailableTickets() {
		return availableTickets;
	}
	public void setAvailableTickets(int availableTickets) {
		this.availableTickets = availableTickets;
	}
	public int getMaximumTickets() {
		return maximumTickets;
	}
	public void setMaximumTickets(int maximumTickets) {
		this.maximumTickets = maximumTickets;
	}
	
	// Constructor
	
	public Category(int id, String type, double price, int availableTickets, int maximumTickets) {
		this.id = id;
		this.type = type;
		this.price = price;
		this.availableTickets = availableTickets;
		this.maximumTickets = maximumTickets;
	}
	
	
}
