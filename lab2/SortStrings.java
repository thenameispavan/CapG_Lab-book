package day2;

import java.util.Scanner;
//import java.util.Arrays;
public class SortStrings {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter length of string");
		int n= s.nextInt();
		System.out.println("enter the elements into the string");
		String str[]= new String[n];
		sortString(n,str);

}



	public static void sortString(int n, String[] str) {
		Scanner s= new Scanner(System.in);
		for(int i=0;i<n;i++) {
			str[i]= s.next();
			
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(str[i].compareTo(str[j])>0) {
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
					
				}
			}
		}
		if(n%2==0) {
	for(int i=0;i<n/2;i++) {
		str[i]= str[i].toUpperCase();	
	}
		}
		else
		{
			for(int i=0;i<(n/2)+1;i++) {
				str[i]= str[i].toUpperCase();	
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(str[i]);	
		}
	}
}

