package lab3;

import java.util.*;

public class Getimage {
	public static void getImage(String str) {
		StringBuffer sb= new StringBuffer(str);
		sb.reverse();
		String reverse= sb.toString();
		str= str+"|"+reverse;
		System.out.println(str);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str= s.next();
		getImage(str);
		
	}

}
