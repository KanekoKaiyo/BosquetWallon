package be.josimon.BWDAO;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import be.josimon.BWPOJO.Category;

public class CategoryDAO extends DAO<Category> {

	public CategoryDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Category obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Category obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Category obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Category find(Category obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> getAll(Category obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Category> findAll() {
		// TODO Auto-generated method stub
		return null;
	}




}
