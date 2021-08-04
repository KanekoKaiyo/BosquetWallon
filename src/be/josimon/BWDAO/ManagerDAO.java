package be.josimon.BWDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import be.josimon.BWPOJO.Manager;

public class ManagerDAO extends DAO<Manager> {

	public ManagerDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Manager obj) {
		try {
			String sql = "INSERT INTO Person(firstname,lastname,discriminator,address,email,password,phonenumber) VALUES('" 
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
	public boolean delete(Manager obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Manager obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Manager find(Manager obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Manager> getAll(Manager obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Manager> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
