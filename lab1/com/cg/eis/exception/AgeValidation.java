package com.cg.eis.exception;

import java.util.Scanner;

class AgeException extends Exception{
	public AgeException(String str) {
		System.out.println(str);
	}
}
public class AgeValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int age= s.nextInt();
		try {
			if(age<15)
				throw new AgeException("under-aged");
			else
				System.out.println("valid-age");
		}
		catch(AgeException a){
			System.out.println(a);
		}
	}

}
