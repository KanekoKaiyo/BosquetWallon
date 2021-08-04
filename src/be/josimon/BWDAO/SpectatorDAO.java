package be.josimon.BWDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import be.josimon.BWPOJO.Spectator;

public class SpectatorDAO extends DAO<Spectator> {

	public SpectatorDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Spectator obj) {
		try {
			String sql = "INSERT INTO Person(firstname,lastname,discriminator,address,email,password,phonenumber,gender,birthdate) VALUES('" 
					+ obj.getFirstname() + "','" 
					+ obj.getLastname() + "','" 
					+ obj.getRole() + "','" 
					+ obj.getAddress() + "','"
					+ obj.getEmail() + "','" 
					+ obj.getPassword() + "','"
					+ obj.getPhoneNumber() + "','"
					+ obj.getGender() + "','" 
					+ obj.getBirthdate() + "')";
			// this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery(sql);
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
	public boolean delete(Spectator obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Spectator obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Spectator find(Spectator obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Spectator> getAll(Spectator obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Spectator> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
