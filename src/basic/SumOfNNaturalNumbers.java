package basic;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
	static Scanner sc = new Scanner(System.in);
	public static void check(int count) {
		int sum = 0;
		for(int i=1; i<=count; i++) {
			System.out.print("Enter number "+i+" :");
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println("Sum: "+sum);
	}
	
	public static void main(String[] args) {
		
		System.out.println("How many numbers you want to add?");
		int count = sc.nextInt();
		SumOfNNaturalNumbers.check(count);
		sc.close();
	}

}
