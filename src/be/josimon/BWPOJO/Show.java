package be.josimon.BWPOJO;

import java.util.List;

public class Show {
	// variable
	private int id;
	private String title;
	private String description;
	// TODO Look for image storage java/sqlLite private ??? image;
	private int ticketPerPerson;
	private Configuration configuration;
	
	private List<Artist> listArtist;
	private List<Representation> listRepresentation;
	
	// Getter & Setter
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getTicketPerPerson() {
		return ticketPerPerson;
	}
	public void setTicketPerPerson(int ticketPerPerson) {
		this.ticketPerPerson = ticketPerPerson;
	}
	public Configuration getConfiguration() {
		return configuration;
	}
	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}
	public List<Artist> getListArtist() {
		return listArtist;
	}
	public void setListArtist(List<Artist> listArtist) {
		this.listArtist = listArtist;
	}
	public List<Representation> getListRepresentation() {
		return listRepresentation;
	}
	public void setListRepresentation(List<Representation> listRepresentation) {
		this.listRepresentation = listRepresentation;
	}
	
	// Constructor
	
	public Show(int id, String title, String description, int ticketPerPerson, Configuration configuration,
			List<Artist> listArtist, List<Representation> listRepresentation) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.ticketPerPerson = ticketPerPerson;
		this.configuration = configuration;
		this.listArtist = listArtist;
		this.listRepresentation = listRepresentation;
	}
	public Show(String title, String description, int ticketPerPerson, Configuration configuration,
			List<Artist> listArtist, List<Representation> listRepresentation) {
		this.title = title;
		this.description = description;
		this.ticketPerPerson = ticketPerPerson;
		this.configuration = configuration;
		this.listArtist = listArtist;
		this.listRepresentation = listRepresentation;
	}
	
	
	
	
}
