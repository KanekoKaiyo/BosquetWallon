package be.josimon.BWDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import be.josimon.BWPOJO.Organizer;

public class OrganizerDAO extends DAO<Organizer> {

	public OrganizerDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Organizer obj) {
		try {
			String sql = "INSERT INTO Personne(firstname,lastname,discriminator,address,email,password,phonenumber) VALUES('" 
					+ obj.getFirstname() + "','" 
					+ obj.getLastname() + "','" 
					+ obj.getRole() + "','" 
					+ obj.getAddress() + "','"
					+ obj.getEmail() + "','" 
					+ obj.getPassword() + "','"
					+ obj.getPhoneNumber() + "')";
			this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery(sql);
			return true;
		} catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Organizer obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Organizer obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Organizer find(Organizer obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Organizer> getAll(Organizer obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Organizer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ArrayList<Organizer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}





}
