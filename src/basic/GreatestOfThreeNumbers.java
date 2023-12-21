package basic;

import java.util.Scanner;

public class GreatestOfThreeNumbers {

	public static void check(int num1, int num2, int num3) {
		if(num1>num2 && num1>num3) {
			System.out.println(num1+" is greatest.");
		}else if(num2>num1 && num2>num3) {
			System.out.println(num2+" is greatest.");
		}else if(num3>num1 && num3>num2) {
			System.out.println(num3+" is greatest.");
		}else {
			System.out.println("All numbers are same.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter 3rd number: ");
		int num3 = sc.nextInt();
		GreatestOfThreeNumbers.check(num1, num2, num3);
		sc.close();
	}

}
