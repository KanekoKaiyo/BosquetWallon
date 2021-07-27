package be.josimon.BWDAO;

import java.util.ArrayList;

public abstract class IDAO<T> {
	public abstract boolean create(T obj);

	public abstract boolean delete(T obj);

	public abstract boolean update(T obj);

	public abstract T find(T obj);
	
	public abstract ArrayList<T> findAll();
	
}
