package be.josimon.BWDAO;

import java.sql.Connection;
import java.util.List;

public abstract class DAO<T> extends IDAO<T> {
protected Connection connect = null;
	
	public DAO(Connection conn) {
		this.connect = conn;
	}	
	 public abstract boolean create(T obj);
	 public abstract boolean delete(T obj);
	 public abstract boolean update(T obj);
	 public abstract T find(T obj);
	 public abstract List<T> getAll(T obj);
	 public abstract List<T> getAll();
}
