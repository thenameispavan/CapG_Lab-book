package lambdaexp;
import java.lang.Math;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a= sc.nextDouble();
		double b= sc.nextDouble();
		PowerOf p=(x,y)-> Math.pow(x, y);
		System.out.println(p.power(a,b));

	}

}
