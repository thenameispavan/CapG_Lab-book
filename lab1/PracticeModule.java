package lab1;

import java.util.Scanner;
public class PracticeModule {

	public static void main(String[] args) {
		int sum=0;
		Scanner input= new Scanner(System.in);
		System.out.println("enter the number");
		int n= input.nextInt();
		while(n>0) {
			int m=n%10;
			sum+=Math.pow(m, 3);
			n=n/10;
			
		}	
		System.out.println(sum);
		}
		
	}