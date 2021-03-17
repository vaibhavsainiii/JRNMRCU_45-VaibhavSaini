package com.abc.service;

import java.util.List;

import com.abc.dao.EmployDaoImpl;
import com.abc.dao.IEmployDao;
import com.abc.model.Employ;

public class EmployServiceImpl implements IEmployService {

	private static IEmployDao employDao = new EmployDaoImpl();

	@Override
	public boolean add(Employ employ) {
		return employDao.addEmploy(employ);
	}

	@Override
	public boolean update(Employ employ,int id) {

		return employDao.updateEmploy(employ,id);
	}

	@Override
	public boolean delete(int employId) {
		return employDao.delete(employId);
	}

	@Override
	public Employ getEmploy(int employId) {
		return null;
	}

	@Override
	public List<Employ> getAllEmploy() {
		return null;
	}

}
