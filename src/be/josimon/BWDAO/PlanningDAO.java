package be.josimon.BWDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
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
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String temp1 = sdf.format(obj.getBeginDate().getTime());
			String temp2 = sdf.format(obj.getBeginDate().getTime());
			
			ps.setString(1, temp1);
			ps.setString(2, temp2);
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
		Planning plan = new Planning();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			String sql = "SELECT * FROM Planning WHERE idBooking = ?";
			PreparedStatement ps = this.connect.prepareStatement(sql);
			ps.setInt(1, obj.getBook().getId());
			
			ResultSet result = ps.executeQuery();
			
			if(result.next()) {
				plan.setId(result.getInt("idPlanning"));
				plan.setBeginDate(sdf.parse(result.getString("beginDate")));
				plan.setEndDate(sdf.parse(result.getString("endDate")));
				plan.setBook(obj.getBook());
			}
			return plan;
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
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
		return null;
	}



}
