package basic;

import java.util.Scanner;

public class LeapYear {

	public static void check(int year) {
		if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not a Leap Yaer");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = sc.nextInt();
		LeapYear.check(year);
		sc.close();
	}

}
