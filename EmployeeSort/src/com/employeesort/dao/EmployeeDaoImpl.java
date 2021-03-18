package com.employeesort.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import com.employeesort.model.*;

public class EmployeeDaoImpl {
	public static HashSet<Employee> tree;
	static {
		tree = new HashSet<Employee>();
	}

	HashSet<Employee> sortOnId() {
		return tree;
	}

	public boolean add(Employee employee) {

		boolean bool = false;
		Iterator<Employee> i = tree.iterator();
		while (i.hasNext()) {
			if (i.equals(employee)) {
				return false;

			} else
				bool = false;
		}
		if (bool == false) {
			int initialSize = tree.size();
			tree.add(employee);

			if (tree.size() > initialSize)
				return true;
		}
		return false;

	}

	public List<Employee> getList() {
		List<Employee> l1 = new ArrayList<Employee>();
		l1.addAll(tree);
		return l1;
	}

	public HashSet<Employee> getTree() {

		return tree;
	}

}
