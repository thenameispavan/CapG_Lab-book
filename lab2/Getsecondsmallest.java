package day2;

import java.util.Scanner;
import java.util.Arrays;
public class Getsecondsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n= new Scanner(System.in);
		int x= n.nextInt();
		int[] num= new int[x];
		getSecondSmallest(x,num);
		
	}
		

	public static void getSecondSmallest(int x, int[] num) {
		Scanner n= new Scanner(System.in);
		for(int i=0;i<x;i++) 
		{
			num[i]= n.nextInt();
		
		}
		for(int i=0;i<x;i++) {
			for(int j=0;j<i;j++) {
				if(num[i]<num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
	System.out.println(num[1]);
	}
	}


