package be.josimon.BWDAO;

import java.util.List;

public interface IDAO<T> {
	public abstract boolean create(T obj);
	public abstract boolean delete(T obj);
	public abstract boolean update(T obj);
	
	public abstract T find(int id);
	public abstract List<T> findAll();
}
