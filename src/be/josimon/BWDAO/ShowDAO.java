package be.josimon.BWDAO;

import java.sql.Connection;
import java.util.List;

import be.josimon.BWPOJO.Show;

public class ShowDAO extends DAO<Show> {

	public ShowDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Show obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Show obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Show obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Show find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Show> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
