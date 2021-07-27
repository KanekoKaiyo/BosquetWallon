package be.josimon.BWPOJO;

import java.sql.Connection;

import be.josimon.BWDAO.PersonDAO;
import be.josimon.util.SHA;

/**
 * @author Simon Jonathan
 * @version 1.0
 * 
 * 
 */

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
		this.password = SHA.hash(password);
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
		this.password = SHA.hash(password);
		this.role = role;
	}
	
	public Person(String firstname, String lastname, String address, String email, String password, String role) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.email = email;
		this.password = SHA.hash(password);
		this.role = role;
	}
	public Person() {
	}	
	
	// DAO
	
	public Person find(Connection conn) {
		PersonDAO dao = new PersonDAO(conn);
		return dao.find(this);
	}
}
