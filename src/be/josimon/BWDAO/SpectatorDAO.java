package be.josimon.BWDAO;

import java.sql.Connection;
import java.util.List;

import be.josimon.BWPOJO.Spectator;

public class SpectatorDAO extends DAO<Spectator> {

	public SpectatorDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Spectator obj) {
		// TODO Auto-generated method stub
		return false;
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
	public Spectator find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Spectator> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
