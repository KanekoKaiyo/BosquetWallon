package be.josimon.BWDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
			String sql = "INSERT INTO Person(firstname,lastname,discriminator,address,email,password,phonenumber) VALUES('" 
					+ obj.getFirstname() + "','" 
					+ obj.getLastname() + "','" 
					+ obj.getRole() + "','" 
					+ obj.getAddress() + "','"
					+ obj.getEmail() + "','" 
					+ obj.getPassword() + "','"
					+ obj.getPhoneNumber() + "')";
			PreparedStatement pstmt = this.connect.prepareStatement(sql);
			int result = pstmt.executeUpdate();
			if(result != 0) {
				return true;
			} else {
				System.out.println("Une soucis ? C'est pas normal :(");
				return false;
			}
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

}
