package lab6;
import java.util.*;
public class Secondsmallest {
	public static int getSecondSmallest(int[] a){
		List<Integer> li=new ArrayList<Integer>();
		for(int i:a) {
			li.add(i);
		}
		Collections.sort(li);
		return(li.get(1));
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,4,3,5,6};
		System.out.println(getSecondSmallest(a));
		
	}

}
