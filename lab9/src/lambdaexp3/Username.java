package lambdaexp3;

import java.util.Scanner;

public class Username {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String in=sc.next();
		String pass=sc.next();
		Check c= (u_name,pword)->{
			
			if(u_name.equals(in)) {
				if(pword.equals(pass)) {
					return true;
				}
				else
					return false;
			}
			else 
				return false;
						
		};
		System.out.println(c.check("pavan", "12345"));

	}

}
