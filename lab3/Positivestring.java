package lab3;

import java.util.*;

public class Positivestring {
	public static boolean positiveString(String str) {
		String str1=str;
		char temp[]= str1.toCharArray();
		Arrays.sort(temp);
		str1= new String(temp);
		return(str.equals(str1));
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str= s.next();
		System.out.println(positiveString(str));
	}

}
