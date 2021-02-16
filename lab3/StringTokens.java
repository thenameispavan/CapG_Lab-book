package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum=0;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the integers: ");
		String str= s.nextLine();
		StringTokenizer st= new StringTokenizer(str," ");
		while(st.hasMoreTokens()) {
			String temp= st.nextToken();
			n= Integer.parseInt(temp);
			System.out.println(n);
			sum+=n;
			
		}
		System.out.println("sum: "+sum);

	}

}
