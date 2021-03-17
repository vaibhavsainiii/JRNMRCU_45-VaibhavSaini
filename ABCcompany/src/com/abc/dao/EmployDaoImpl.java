package com.abc.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.abc.model.Employ;

public class EmployDaoImpl implements IEmployDao {

	private static Map<Long, Employ> employees;
	private static long origin = 1200L;

	static {

		employees = new HashMap<Long, Employ>();

	}

	@Override
	public boolean addEmploy(Employ employ) {

		int initialSize = employees.size();

		employees.put(origin++, employ);

		if (employees.size() > initialSize)
			return true;
		else
			return false;

	}

	@Override
	public boolean updateEmploy(Employ employ,int employId) {
		for(Map.Entry<Long, Employ> entry:employees.entrySet())
		{
			Employ emp=new Employ();
			emp=entry.getValue();
			if(emp.getId()==employId)
			{
				employees.replace(entry.getKey(), employ);
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean delete(int employId) {
		for(Map.Entry<Long, Employ> entry:employees.entrySet())
		{
			Employ emp=new Employ();
			emp=entry.getValue();
			if(emp.getId()==employId)
			{
				employees.remove(entry.getKey());
				return true;
			}
		}
		return false;
	}

	@Override
	public Employ getEmploy(int employId) {
		for(Map.Entry<Long, Employ> entry:employees.entrySet())
		{
			Employ emp=new Employ();
			emp=entry.getValue();
			if(emp.getId()==employId)
			{
				return emp;
			}
		}
		return new Employ();
	}

	@Override
	public List<Employ> getAllEmploy() {
		ArrayList<Employ> list=new ArrayList<Employ>();
		for(Map.Entry<Long, Employ> entry:employees.entrySet())
		{
			Employ emp=new Employ();
			emp=entry.getValue();
			list.add(emp);
				return list;
			
		}	
		return null;
		}

}
