package lab3;

import java.util.*;

public class Modifynumber {
	public static void modifyNumber(int num) {
		int num1=num%10;
		int result=0;	
		String str= Integer.toString(num);
		int a = str.length();
		//System.out.println(str);
		for(int i=0;i<a;i++) {
			int j=i+1;
			if(j==a) {
				break;
			}
			int c= Math.abs(str.charAt(i)-str.charAt(j));
			
			result=result*10+ c;
			
			
			
		}
		
	System.out.println(result*10+num1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number: ");
		int num= s.nextInt();
		//String str= toString();
		modifyNumber(num);
	}

}
