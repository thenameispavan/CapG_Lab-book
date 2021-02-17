package lab6;

public class Getsorted {

	public static void main(String[] args) {
		int[] a= {23,34,56,76,43};
		int reversed=0;
		for(int i:a) {
			while(i>0) {
				int num=i%10;
				reversed=reversed*10+num;
				num=num/10;
			}
		}
		System.out.println(reversed);

	}

}
