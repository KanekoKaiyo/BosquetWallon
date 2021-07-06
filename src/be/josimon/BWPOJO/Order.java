package be.josimon.BWPOJO;

import java.util.List;

/**
 * @author Simon Jonathan
 * @version 0.1
 */
public class Order {
	// Variable
	private int id;
	private String paymentMethod;
	private String deliveryMethod;
	private double total;
	
	private List<Ticket> listTicket;

	// Getter & Setter
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<Ticket> getListTicket() {
		return listTicket;
	}

	public void setListTicket(List<Ticket> listTicket) {
		this.listTicket = listTicket;
	}

	// Constructor
	
	public Order(int id, String paymentMethod, String deliveryMethod, double total, List<Ticket> listTicket) {
		this.id = id;
		this.paymentMethod = paymentMethod;
		this.deliveryMethod = deliveryMethod;
		this.total = total;
		this.listTicket = listTicket;
	}

	public Order(String paymentMethod, String deliveryMethod, double total, List<Ticket> listTicket) {
		this.paymentMethod = paymentMethod;
		this.deliveryMethod = deliveryMethod;
		this.total = total;
		this.listTicket = listTicket;
	}
	
	
}
