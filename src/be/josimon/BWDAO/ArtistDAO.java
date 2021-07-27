package be.josimon.BWDAO;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import be.josimon.BWPOJO.Artist;

public class ArtistDAO extends DAO<Artist> {

	public ArtistDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Artist obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Artist obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Artist obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Artist find(Artist obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Artist> getAll(Artist obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Artist> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Artist find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Artist> findAll() {
		// TODO Auto-generated method stub
		return null;
	}




}
