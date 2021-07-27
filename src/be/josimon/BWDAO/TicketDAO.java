package be.josimon.BWDAO;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import be.josimon.BWPOJO.Ticket;

public class TicketDAO extends DAO<Ticket> {

	public TicketDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Ticket obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Ticket obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Ticket obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Ticket find(Ticket obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> getAll(Ticket obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Ticket> findAll() {
		// TODO Auto-generated method stub
		return null;
	}





}
