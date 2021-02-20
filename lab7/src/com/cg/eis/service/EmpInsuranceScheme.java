package com.cg.eis.service;

import java.util.*;

import com.cg.eis.bean.Employee;
import com.cg.eis.config.EmployeeData;

public class EmpInsuranceScheme implements EmployeeService{

	@Override
	public Map<String, Employee> newMap(String str) {
		Map<String,Employee> m1= new HashMap<String,Employee>(EmployeeData.getEmplist());
		Map<String,Employee> m2= new HashMap<String,Employee>();
		Set<String> set= m1.keySet();
		for(String i:set) {
			Employee emp= m1.get(i);
			if(emp.getInsuranceScheme().equals(str)) {
				m2.put(str, emp);
			}
		}
		return m2;
		
	}

	@Override
	public Map<String, Employee> displayEmployee() {
		Map<String,Employee> display= new HashMap<String,Employee>(EmployeeData.getEmplist());
		
		return display;
	}

	@Override
	public String deleteEmployee(String s) {
		Map<String,Employee> delete= new HashMap<String,Employee>(EmployeeData.getEmplist());
		delete.remove(s);
		return "Deleted!";
	}

	}


