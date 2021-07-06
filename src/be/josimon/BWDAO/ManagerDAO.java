package be.josimon.BWDAO;

import java.sql.Connection;
import java.util.List;

import be.josimon.BWPOJO.Manager;

public class ManagerDAO extends DAO<Manager> {

	public ManagerDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Manager obj) {
		// TODO Auto-generated method stub
		return false;
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
	public Manager find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Manager> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
