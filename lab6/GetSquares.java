package lab6;

import java.util.*;

public class GetSquares {
	public static Map<Integer,Integer> getSquares(int[] a){
	Map<Integer,Integer> m1= new HashMap<Integer,Integer>();
	for(int i:a) {
		m1.put(i,i*i);
	}
	return m1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		int[] a= {2,3,4,5,6};
		System.out.println(getSquares(a));
	}

}
