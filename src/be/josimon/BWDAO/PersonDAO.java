package be.josimon.BWDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import be.josimon.BWPOJO.Person;

public class PersonDAO extends DAO<Person> {

	public PersonDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(Person obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Person obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Person obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Person find(Person obj) {
		// On créer un objet Personne
		Person pr = new Person();
		try {
			// On prepare la requete sql
			String sql = "SELECT * FROM Personne WHERE email=? AND motDePasse=?";
			PreparedStatement pS = this.connect.prepareStatement(sql);
			pS.setString(1,obj.getEmail());
			pS.setString(2, obj.getPassword());
			// on execute la requete sql
			ResultSet result = pS.executeQuery();
			// On set les valeur sur l'obj
			if(result.next()) {
				pr.setId(result.getInt("idPerson"));
				pr.setFirstname(result.getString("firstname"));
				pr.setLastname(result.getString("lastname"));
				pr.setAddress(result.getString("address"));
				pr.setRole(result.getString("discriminator"));
				pr.setEmail(result.getString("email"));
				pr.setPassword(result.getString("motDePasse"));
			}
			return pr;
		} catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex.toString());
			return null;
		}
	}

	@Override
	public List<Person> getAll(Person obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}





}
