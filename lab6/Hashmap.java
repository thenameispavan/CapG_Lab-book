package lab6;

import java.util.*;

public class Hashmap {
	public static List<Integer> getValues(Map<String, Integer> m,Collection li){
		
		List<Integer> l= new ArrayList<Integer>(li);
		Collections.sort(l);
		return l;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Map<String, Integer> m=new HashMap<String, Integer>();
		m.put("amit", 2000);
		m.put("amitab", 1000);
		m.put("bacchan", 1500);
		m.put("amit", 2000);
		Collection li= (m.values());
		System.out.println(getValues(m,li));
		
	}

}
