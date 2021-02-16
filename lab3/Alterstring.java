package lab3;

import java.util.*;

public class Alterstring {
	public static void alterString(String str) {
		char alter[]= str.toCharArray();
		for(int i=0;i<alter.length;i++) {
			if(alter[i]!='a'&&alter[i]!='e'&&alter[i]!='i'&&alter[i]!='o'&&alter[i]!='u'&&alter[i]!=' '){
				char x= alter[i];
				alter[i]= (char) (x+1);
				
			}
			
		}
		System.out.println(alter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter the string: ");
		String str= s.next();
		alterString(str);
	}

}
