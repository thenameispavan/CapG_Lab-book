package lab6;

import java.util.*;

public class VotersList {
	public static List<String> votersList(Map<String,Integer> m){
		List<String> li=new ArrayList<String>();
		Set<String> s= m.keySet();
		for(String i:s) {
			Integer age= m.get(i);
			if(age>=18)
				li.add(i);
		}
		return li;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> m= new HashMap<String,Integer>();
		m.put("ID121", 18);
		m.put("ID154", 12);
		m.put("ID272", 25);
		m.put("ID768", 18);
		System.out.println(votersList(m));
	}

}
