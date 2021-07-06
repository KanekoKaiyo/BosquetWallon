package be.josimon.BWPOJO;

public class Booking {
	// Variable
	private int id;
	private double deposite;
	private double balance;
	private double price;
	private String status;
	private Planning planning;
	
	// Getter & Setter
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getDeposite() {
		return deposite;
	}
	public void setDeposite(double deposite) {
		this.deposite = deposite;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Planning getPlanning() {
		return planning;
	}
	public void setPlanning(Planning planning) {
		this.planning = planning;
	}
	
	// Constructor
	
	public Booking(int id, double deposite, double balance, double price, String status, Planning planning) {
		this.id = id;
		this.deposite = deposite;
		this.balance = balance;
		this.price = price;
		this.status = status;
		this.planning = planning;
	}
	public Booking(double deposite, double balance, double price, String status, Planning planning) {
		this.deposite = deposite;
		this.balance = balance;
		this.price = price;
		this.status = status;
		this.planning = planning;
	}
	
	
	
}
