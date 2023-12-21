package basic;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		SumOfDigits.calculate(num);
		sc.close();
	}

	public static void calculate(int num) {
		int sum = 0;
		
		// for loop
		int length = String.valueOf(num).length();
		for(int i=1; i<=length; i++) {
			int rem = num%10;
			sum = sum+rem;
			num = num/10;
		}
	
		// while loop
//		while(num>0) {
//			int rem = num%10;
//			sum = sum+rem;
//			num = num/10;
//		}
		
		System.out.println("Sum: "+sum);
	}

}
