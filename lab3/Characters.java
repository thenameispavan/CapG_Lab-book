package lab3;

import java.util.*;

public class Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str= s.nextLine();
		int length= str.length();
		System.out.println("No.of Characters: "+length);
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
				
			}
		}
		
		System.out.println("no of words: "+count);
	}

}
