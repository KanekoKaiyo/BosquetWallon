package be.josimon.BWPOJO;

public class Artist extends Person {
	// variable
	private String ShowName;

	// get/set
	
	public String getShowName() {
		return ShowName;
	}

	public void setShowName(String showName) {
		ShowName = showName;
	}

	// Constructor
	
	public Artist(int id, String firstname, String lastname, String address, String email, String password, String role,
			String showName) {
		super(id, firstname, lastname, address, email, password, role);
		ShowName = showName;
	}

	public Artist(String firstname, String lastname, String address, String email, String password, String role,
			String showName) {
		super(firstname, lastname, address, email, password, role);
		ShowName = showName;
	}
	
	
}
