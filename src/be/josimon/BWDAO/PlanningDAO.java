package be.josimon.BWDAO;

import java.sql.Connection;
import java.util.List;

import be.josimon.BWPOJO.Planning;

public class PlanningDAO extends DAO<Planning> {

	public PlanningDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Planning obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Planning obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Planning obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Planning find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Planning> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
