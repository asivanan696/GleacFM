package program;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=123456;
		int total=0;
		while(a!=0) {
			
			
			total=total+a%10;
			a=a/10;
			
			
		}
		System.out.println(total);
	}

}
