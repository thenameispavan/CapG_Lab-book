package com.cg.eis.config;

import java.util.*;

import com.cg.eis.bean.*;

public class EmployeeData {
	private static Map<String,Employee> emplist;
	static {
		emplist=new HashMap<String,Employee>();
		emplist.put("123",new Employee(101,"ravi",13000,"System Associate"));
		emplist.put("124",new Employee(102,"raju",32000,"Programmer"));
		emplist.put("125",new Employee(103,"rama",45000,"Manager"));
		emplist.put("126",new Employee(104,"rao",4000,"Clerk"));
	}
	public static Map<String,Employee> getEmplist(){
		return emplist;
}

}
