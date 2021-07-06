package be.josimon.BWPOJO;


// TODO CREATE HASH
import be.josimon.hash.SHA;

public class Person {
	// variable
	protected int id;
	protected String firstname;
	protected String lastname;
	protected String address;
	protected String email;
	protected String password;
	protected String role;
	
	// Getter & Setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	// Constructor
	
	public Person(int id, String firstname, String lastname, String address, String email, String password,
			String role) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	
	public Person(String firstname, String lastname, String address, String email, String password, String role) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.email = email;
		this.password = password;
		this.role = role;
	}	
	
	
}
