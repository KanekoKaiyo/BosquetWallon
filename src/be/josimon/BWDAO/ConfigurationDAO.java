package be.josimon.BWDAO;

import java.sql.Connection;
import java.util.List;

import be.josimon.BWPOJO.Configuration;

public class ConfigurationDAO extends DAO<Configuration> {

	public ConfigurationDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Configuration obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Configuration obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Configuration obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Configuration find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Configuration> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
