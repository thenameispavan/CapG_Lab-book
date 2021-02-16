package day2;
import java.util.Scanner;

public class GetSorted {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int num[]= new int[n];
		getSorted(n,num);
		
	}

	public static void getSorted(int n, int[] num) {
		int num1[]= new int[n];
		int reversed[]= new int[n];
		Scanner s= new Scanner(System.in);
		for(int i=0;i<n;i++) {
			num[i]= s.nextInt(); 
			while(num[i]>0) {
				num1[i]=num[i]%10;
				reversed[i]= reversed[i]*10+num1[i];
				num[i]=num[i]/10;
			}
			
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(reversed[i]<reversed[j]) {
					int temp= reversed[i];
					reversed[i]=reversed[j];
					reversed[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(reversed[i]);
		}
	}
	

}


