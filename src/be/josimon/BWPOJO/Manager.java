package be.josimon.BWPOJO;

import java.sql.Connection;
import java.util.List;

import be.josimon.BWDAO.ManagerDAO;

public class Manager extends Person {
	// variable
	private String phoneNumber;
	
	private List<Planning> listPlanning;

	// Getter & Setter
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Planning> getListPlanning() {
		return listPlanning;
	}

	public void setListPlanning(List<Planning> listPlanning) {
		this.listPlanning = listPlanning;
	}

	// Constructor
	
	public Manager(int id, String firstname, String lastname, String address, String email, String password,
			String role, String phoneNumber, List<Planning> listPlanning) {
		super(id, firstname, lastname, address, email, password, role);
		this.phoneNumber = phoneNumber;
		this.listPlanning = listPlanning;
	}

	public Manager(String firstname, String lastname, String address, String email, String password, String role,
			String phoneNumber) {
		super(firstname, lastname, address, email, password, role);
		this.phoneNumber = phoneNumber;
	}
	
	// dao
	
	public boolean create(Connection conn) {
		ManagerDAO dao = new ManagerDAO(conn);
		return dao.create(this);
	}
}
