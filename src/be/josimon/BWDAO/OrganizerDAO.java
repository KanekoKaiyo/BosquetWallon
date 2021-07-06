package be.josimon.BWDAO;

import java.sql.Connection;
import java.util.List;

import be.josimon.BWPOJO.Organizer;

public class OrganizerDAO extends DAO<Organizer> {

	public OrganizerDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Organizer obj) {
		// TODO Auto-generated method stub
		return false;
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
	public Organizer find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Organizer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
