package com.cg.eis.exception;

import java.util.Scanner;
class NameException extends Exception {
	public NameException(String str1,String str2){
		System.out.println(str1);	
		System.out.println(str2);
	}
	
}

public class NameVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String fname= s.next();
		String lname= s.next();
		try {
			if(fname.isEmpty()&lname.isEmpty()) {
				throw new NameException("null value is invalid","null value is invalid");
			}
			else {
				System.out.println("name accepted");
			}
		}
		catch(NameException n) {
			System.out.println(n);
		}
	}

}
