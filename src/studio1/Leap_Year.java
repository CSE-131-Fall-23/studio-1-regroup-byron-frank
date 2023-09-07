package studio1;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int n1 = in.nextInt();
	
		boolean tr = (n1%4 == 0)&(n1%100 > 0);
		
		boolean tr1 = tr;
		boolean tr = (n1%400 == 0);
		
		
		System.out.println(tr1);
		
		
		
		
	}

}
