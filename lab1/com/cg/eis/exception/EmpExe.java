package com.cg.eis.exception;

import java.util.Scanner;
class EmployeeException extends Exception{
	public EmployeeException(String str) {
		System.out.println(str);
	}
}
public class EmpExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int salary= s.nextInt();
		try {
			if(salary<3000) {
				throw new EmployeeException("not enough salary");
			}
			else {
				System.out.println("salary credited");
			}
		}
		catch(EmployeeException a) {
			System.out.println(a);
		}
	}

}
