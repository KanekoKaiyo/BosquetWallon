package be.josimon.BWPOJO;

import java.util.List;

public class Configuration {
	// Variable
	private int id;
	private String type;
	private String description;
	
	private List<Category> listCategory;

	// Getter & Setter 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Category> getListCategory() {
		return listCategory;
	}

	public void setListCategory(List<Category> listCategory) {
		this.listCategory = listCategory;
	}

	// Constructor
	
	public Configuration(int id, String type, String description, List<Category> listCategory) {
		this.id = id;
		this.type = type;
		this.description = description;
		this.listCategory = listCategory;
	}
	
	

}
