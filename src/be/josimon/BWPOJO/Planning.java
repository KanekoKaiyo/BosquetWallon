package be.josimon.BWPOJO;

import java.util.Date;
import java.util.List;

public class Planning {
	// variable
	private int id;
	private Date beginDate;
	private Date endDate;
	
	private List<Show> listShow;

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

	// Constructor
	
	public Planning(int id, Date beginDate, Date endDate, List<Show> listShow) {
		this.id = id;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.listShow = listShow;
	}

	public Planning(Date beginDate, Date endDate, List<Show> listShow) {
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.listShow = listShow;
	}
	
	
	
}
