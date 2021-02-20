package com.cg.eis.service;
import java.util.*;
import com.cg.eis.bean.Employee;

public interface EmployeeService {
 Map<String,Employee> newMap(String str);
 Map<String,Employee> displayEmployee();
 String deleteEmployee(String s);
 
}