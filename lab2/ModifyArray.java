package day2;

import java.util.Scanner;

public class ModifyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int j=0;
		int num[]=new int[n];
		int temp[] = null;
		for(int i=0;i<n;i++) {
			num[i]=s.nextInt();
			if(num[i]!=num[i+1]) {
				temp[j++]=num[i];
				temp[j++]=num[n-1];
				
			}
		}
		for(int i=0;i<n;i++) {
			num[i]=temp[i];
			System.out.println(num[i]);
		}
	}

}
