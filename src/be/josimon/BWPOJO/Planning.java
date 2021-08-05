package be.josimon.BWPOJO;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Interval;

import com.ibm.icu.util.Calendar;

import be.josimon.BWDAO.PlanningDAO;

public class Planning {
	// variable
	private int id;
	private Date beginDate;
	private Date endDate;
	private Booking book;
	
	private List<Show> listShow;

	private static int jourMois[] = {31, 28, 31, 30, 31, 30, 
	        31, 31, 30, 31, 30, 31};
	
	// Getter & Setter
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<Show> getListShow() {
		return listShow;
	}

	public void setListShow(List<Show> listShow) {
		this.listShow = listShow;
	}
	
	public Booking getBook() {
		return book;
	}

	public void setBook(Booking book) {
		this.book = book;
	}
	
	// Constructor
	
	public Planning() {}
	
	public Planning(int id, Date beginDate, Date endDate, List<Show> listShow) {
		this.id = id;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.listShow = listShow;
	}

	public Planning(Date beginDate, Date endDate, Booking book) {
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.book = book;
	}
	
	// dao
	public List<Planning> findAll(Connection conn) {
		PlanningDAO dao = new PlanningDAO(conn);
		return dao.getAll();
	}
	
	public boolean createPlanning(Connection conn) {
		PlanningDAO dao = new PlanningDAO(conn);
		return dao.create(this);
	}
	
	// methods
	public boolean Overlap(Planning datefin) {
		Interval inter1 = new Interval(new DateTime(this.getBeginDate()),new DateTime(this.getEndDate()));
		Interval inter2 = new Interval(new DateTime(datefin.getBeginDate()), new DateTime(datefin.getEndDate()));
		
		return inter1.overlaps(inter2);
	}
	
	public double CalculPrix() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(this.beginDate);
			
		// On calcul le nombre de jour et quel jour de la semaine la date de début ce trouve
		int nbJourEcart = CalculnbrJour()+1; // On ajoute un car si on reserve du 12/12=>12/12 c'est un jour de reservation
		int jourDepart = cal.get(Calendar.DAY_OF_WEEK);
		// On calcul le nombre de semaine et le reste de jour
		int nbSemaine = nbJourEcart / 7;
		int resteJour = nbJourEcart % 7;
				
		
		int nbVendredis = nbSemaine + ( resteJour + jourDepart - 7 > Calendar.WEDNESDAY ? 1 : 0 );
		int nbSamedis = nbSemaine + ( resteJour + jourDepart - 7 > Calendar.SUNDAY ? 1 : 0 );
		
		int nbJour = nbJourEcart-(nbVendredis+nbSamedis); // -1
		
		// On retourne le nombre de jour sans les vendredi/samedi a 3000euros la journée et les vendredi+samedi a 4500 euros
		return (nbJour*3000)+((nbVendredis+nbSamedis)*4500);
	}
	private int CalculnbrJour() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(this.beginDate);
		
		Calendar calFin = Calendar.getInstance();
		calFin.setTime(this.endDate);
		
		int nbr1 = 0;
		int nbr2 = 0;
		nbr1 = (cal.get(Calendar.YEAR) * 365) + cal.get(Calendar.DAY_OF_MONTH);
		
		for(int i = 0; i < cal.get(Calendar.MONTH); i++) {
			nbr1 = nbr1 + jourMois[i];
		}
		
		nbr1 = nbr1 + coutBissextiel(this.beginDate);
		
		nbr2 = (calFin.get(Calendar.YEAR) * 365) + calFin.get(Calendar.DAY_OF_MONTH);
		
		for(int i = 0; i < calFin.get(Calendar.MONTH); i++) {
			nbr2 = nbr2 + jourMois[i];
		}
		
		nbr2 = nbr2 + coutBissextiel(this.endDate);
		int temp = nbr2 - nbr1;
		return temp;
	}
	
	private int coutBissextiel(Date d) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		int annee = cal.get(Calendar.YEAR);
		
		if(cal.get(Calendar.MONTH) <= 2) {
			annee--;
		}
		int temp = (annee/4) - (annee/100) + (annee/400);
		 return temp;
	}
}
