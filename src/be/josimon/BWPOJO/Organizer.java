package be.josimon.BWPOJO;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import be.josimon.BWDAO.OrganizerDAO;

public class Organizer extends Person {
	// Variable
	private String phoneNumber;
	
	private List<Booking> listBooking = new ArrayList<Booking>();

	// Getter & Setter
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Booking> getListBooking() {
		return listBooking;
	}

	public void setListBooking(List<Booking> listBooking) {
		this.listBooking = listBooking;
	}

	// Constructor
	
	public Organizer(int id, String firstname, String lastname, String address, String email, String password,
			String role, String phoneNumber, List<Booking> listBooking) {
		super(id, firstname, lastname, address, email, password, role);
		this.phoneNumber = phoneNumber;
		this.listBooking = listBooking;
	}

	public Organizer(String firstname, String lastname, String address, String email, String password, String role,
			String phoneNumber) {
		super(firstname, lastname, address, email, password, role);
		this.phoneNumber = phoneNumber;
	}
	
	public Organizer(Person person) {
		this.id = person.id;
		this.firstname = person.firstname;
		this.lastname = person.lastname;
		this.address = person.address;
		this.email = person.email;
		this.password = person.password;
		this.role = person.role;
	}
	
	public Organizer() {}

	// dao
	public boolean create(Connection conn) {
		OrganizerDAO dao = new OrganizerDAO(conn);
		return dao.create(this);
	}
	
	public void getReservation(Connection conn) {
		// on recupere la liste de toutes les booking et on ne garde que celle avec l'id de notre organisateur
		List<Booking> temp = Booking.getBooking(conn);
		for(Booking book:temp) {
			if(book.getOrga().getId() == this.id) {
				listBooking.add(book);
			}
		}
	}
	
	public void getPlaning(Connection conn) {
		// Pour chaque booking il faut aller chercher les planing
		for(Booking book:listBooking) {
			book.getAllPlanning(conn);
		}
	}
	
	public boolean createReservation(double acompte, double solde, String statut, double prix,Date dateDébutReservation, Date dateFinReservation, Connection conn) {
		// L'organisateur crée un objet reservation avant de le mettre dans la base de donnée
		try {
			Booking res = new Booking(acompte,solde,statut,prix,this);
			// On va l'ajouter dans la base de donnée si c'est possible
			boolean test = res.CreateReservation(conn);
			if(test) {
				// Si la création c'est bien faites, il faut demander a la DB de nous renvoyé les informations car il nous manque l'id !
				res.findId(conn);
				if(test) {
					// On test si la reservation a bien été ajouté, si c'est le cas on va demander a la classe Reservation de créer les plannings lié au date
					boolean test2 = res.createPlanning(dateDébutReservation,dateFinReservation,conn);
					// Si on reçoit true alors la reservation et le planning auront bien été ajouté dans la DB
					if(test2)
						return true;
					else
						return false;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} catch (Exception ex) {
			return false;	
		}
	}

	public boolean payReservation(int id) {
		// TODO Auto-generated method stub
		return false;
	}
}
