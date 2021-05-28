package program;

import java.util.ArrayList;

public class Splitnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 554278;
		//String number = String.valueOf(num);
		
		
				
//			    char j = (char) Character.digit(number.charAt(0), 10);
//			    int j1 = Character.digit(number.charAt(1), 10);
//			    int j2 = Character.digit(number.charAt(2), 10);
//			    int j3 = Character.digit(number.charAt(3), 10);
//			    int j4 = Character.digit(number.charAt(4), 10);
//			    int j5 = Character.digit(number.charAt(5), 10);
//		
//			    System.out.println("digit: " + j);
//			    System.out.println("digit: " + j1);
//			    System.out.println("digit: " + j2);
//			    System.out.println("digit: " + j3);
//			    System.out.println("digit: " + j4);
//			    System.out.println("digit: " + j5);
			    
	
				int first  =  num % 10;
				int second =  ( num - first ) % 100 / 10;
				int third  =  ( num - first - second ) % 1000 / 100;
				int fourth =  ( num - first - second - third ) % 10000 / 1000;
				
				first=first+5;
				System.out.print(first);
				System.out.println(second);
				System.out.println(third);
				System.out.println(fourth);
				
				

			      //System.out.println(a);

			   }
		
		
	}	
	

