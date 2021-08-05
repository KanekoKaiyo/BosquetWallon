package be.josimon.BWDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import be.josimon.BWPOJO.Planning;

public class PlanningDAO extends DAO<Planning> {

	public PlanningDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Planning obj) {
		try {
			String sql = "INSERT INTO Planning(beginDate,endDate,idBooking) VALUES(?,?,?)";
			PreparedStatement ps = this.connect.prepareStatement(sql);
			ps.setDate(1, new java.sql.Date(obj.getBeginDate().getTime()));
			ps.setDate(2, new java.sql.Date(obj.getEndDate().getTime()));
			ps.setInt(3, obj.getBook().getId());
			
			int result = ps.executeUpdate();
			if(result == 1) {
				return true;
			} else {
				return false;
			}
		} catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
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
	public Planning find(Planning obj) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Planning> getAll() {
		List<Planning> list = new ArrayList<Planning>();
		try {
			String sql = "SELECT * FROM Planning";
			PreparedStatement ps = this.connect.prepareStatement(sql);
			ResultSet result = ps.executeQuery();
			
			if(result.next()) {
				Planning plan = new Planning();
				plan.setId(result.getInt("idPlanning"));
				plan.setBeginDate(result.getDate("beginDate"));
				plan.setEndDate(result.getDate("endDate"));
				
				list.add(plan);
			}
			return list;
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Planning> getAll(Planning obj) {
		// TODO Auto-generated method stub
		return null;
	}



}
