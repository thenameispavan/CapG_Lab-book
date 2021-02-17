package lab6;
import java.util.*;
public class GetStudents {
	public static Map<String,String> getStudents(Map<String, Integer> m ){
		Map<String,String> m1=new HashMap<String,String>();
		Set<String> st=m.keySet();
		for(String i:st) {
			Integer marks= m.get(i);
			if(marks>=90)
				m1.put(i, "gold");
			else if(marks>=80)
				m1.put(i, "silver");
			else if(marks>=70)
				m1.put(i, "bronze");
		}
		return m1;
	}

	public static void main(String[] args) {
		
		Map<String,Integer> m= new HashMap<String,Integer>();
		m.put("1001", 89);
		m.put("1002", 72);
		m.put("1003", 95);
		m.put("1004", 85);
		System.out.println(getStudents(m));
		
	}

}
