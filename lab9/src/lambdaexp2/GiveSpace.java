package lambdaexp2;

import java.util.Scanner;

public class GiveSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char c;
		for(int i=0;i<str.length();i++) {
			c= str.charAt(i);
			Space sp= c1->c1+"\t";
			System.out.print(sp.space(c));
		}
		
		

	}

}
