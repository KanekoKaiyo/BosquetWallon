package be.josimon.BWDAO;

import java.sql.Connection;

public abstract class DAO<T> implements IDAO<T> {
	protected Connection connect = null;
	
	public DAO(Connection conn) {
		this.connect = conn;
	}
	
}
