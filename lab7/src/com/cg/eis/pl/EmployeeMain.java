package com.cg.eis.pl;

import java.util.*;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmpInsuranceScheme;

public class EmployeeMain {

	public static void main(String[] args) {
		EmpInsuranceScheme eService = new EmpInsuranceScheme();
		Scanner sc = new Scanner(System.in);
		String ch = "yes";
		while (ch.equalsIgnoreCase("yes")) {
			System.out.println("enter 1 for displaying emp details based on scheme: ");
			System.out.println("enter 2 for displaying all emp details: ");
			System.out.println("enter 3 for deleteing emp details based on id: ");
			int c = sc.nextInt();
			switch (c) {
			case 1:
				System.out.println("enter scheme: ");
				String str = sc.next();
				Map<String, Employee> result = eService.newMap(str);
				System.out.println(result);
				break;
			case 2:
				System.out.println(eService.displayEmployee());
				
				break;
			case 3:
				System.out.println("enter employee to be deleted: ");
				String s=sc.next();
				System.out.println(eService.deleteEmployee(s));
				
				break;
			default:
				System.out.println("invalid details");
			}
			System.out.println("want to continue again? ");
			ch = sc.next();
		}

	}

}
