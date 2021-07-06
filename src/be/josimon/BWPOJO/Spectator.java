package be.josimon.BWPOJO;

import java.util.Date;
import java.util.List;

/**
 * @author Simon Jonathan
 * @version 1.0
 * 
 * 
 */

public class Spectator extends Person {
	// variable
	private String phoneNumber;
	private String gender;
	private Date birthdate;
	private List<Order> listOrder;
	
	// Getter & Setter
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public List<Order> getListOrder() {
		return listOrder;
	}
	public void setListOrder(List<Order> listOrder) {
		this.listOrder = listOrder;
	}
	
	// Constructor
	public Spectator(int id, String firstname, String lastname, String address, String email, String password,
			String role, String phoneNumber, String gender, Date birthdate, List<Order> listOrder) {
		super(id, firstname, lastname, address, email, password, role);
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.birthdate = birthdate;
		this.listOrder = listOrder;
	}
	
	public Spectator(String firstname, String lastname, String address, String email, String password, String role,
			String phoneNumber, String gender, Date birthdate) {
		super(firstname, lastname, address, email, password, role);
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.birthdate = birthdate;
	}
	
	// Methods
	
}
