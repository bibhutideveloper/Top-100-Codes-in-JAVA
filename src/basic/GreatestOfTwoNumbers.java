package basic;

import java.util.Scanner;

public class GreatestOfTwoNumbers {

	public static void check(int num1, int num2) {
		if(num1 > num2) {
			System.out.println(num1+" is greatest.");
		}else if(num2 > num1) {
			System.out.println(num2+" is greatest.");
		}else {
			System.out.println("Both numbers are same.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int num2 = sc.nextInt();
		GreatestOfTwoNumbers.check(num1, num2);
		sc.close();
	}

}
