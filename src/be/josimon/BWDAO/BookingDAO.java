package be.josimon.BWDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import be.josimon.BWPOJO.Booking;
import be.josimon.BWPOJO.Organizer;

public class BookingDAO extends DAO<Booking> {

	public BookingDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Booking obj) {
		try {
			String sql = "INSERT INTO Booking(deposite,balance,statut,price,idPerson) VALUES(?,?,?,?,?)";
			PreparedStatement ps = this.connect.prepareStatement(sql);
			ps.setDouble(1, obj.getDeposite());
			ps.setDouble(2, obj.getBalance());
			ps.setString(3, obj.getStatus());
			ps.setDouble(4, obj.getPrice());
			ps.setInt(5, obj.getOrga().getId());
			
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
	public boolean delete(Booking obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Booking obj) {
		try {
			String sql = "UPDATE Booking SET Statut = ?, balance = ? WHERE idBooking = ?";
			PreparedStatement ps = this.connect.prepareStatement(sql);
			ps.setString(1, "Payé");
			ps.setDouble(2, 0);
			ps.setInt(3, obj.getId());
			
			int row = ps.executeUpdate();
			
			if(row == 1) {
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
	public Booking find(Booking obj) {
		Booking book = new Booking();
		try {
			String sql = "SELECT * FROM Booking WHERE idPerson = ? AND statut = ? AND balance = ? AND deposite = ?";
			PreparedStatement ps = this.connect.prepareStatement(sql);
			ps.setInt(1, obj.getOrga().getId());
			ps.setString(2, obj.getStatus());
			ps.setDouble(3, obj.getBalance());
			ps.setDouble(4, obj.getDeposite());
			
			ResultSet result = ps.executeQuery();
			
			if(result.next()) {
				book.setId(result.getInt("idBooking"));
				book.setDeposite(result.getDouble("deposite"));
				book.setBalance(result.getDouble("balance"));
				book.setStatus(result.getString("statut"));
				book.setPrice(result.getDouble("price"));
			}
			return book;
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Booking> getAll(Booking obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> getAll() {
		List<Booking> list = new ArrayList<Booking>();
		
		try {
			String sql = "SELECT * FROM Booking";
			PreparedStatement ps = this.connect.prepareStatement(sql);
			ResultSet result = ps.executeQuery();
			
			if(result.next()) {
				Booking book = new Booking();
				Organizer orga = new Organizer();
				orga.setId(result.getInt("idPerson"));
				
				book.setId(result.getInt("idBooking"));
				book.setBalance(result.getDouble("balance"));
				book.setDeposite(result.getDouble("deposite"));
				book.setPrice(result.getDouble("price"));
				book.setStatus(result.getString("Statut"));
				book.setOrga(orga);
				
				list.add(book);
			}
			
			return list;
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

}
