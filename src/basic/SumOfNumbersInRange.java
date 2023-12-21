package basic;

import java.util.Scanner;

public class SumOfNumbersInRange {

	public static void calculate(int start, int end) {
		int sum = 0;
		for(int i=start; i<=end; i++) {
			sum += i;
		}
		System.out.println("Sum: "+sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start range: ");
		int start = sc.nextInt();
		System.out.println("enter end range: ");
		int end = sc.nextInt();
		SumOfNumbersInRange.calculate(start, end);
		sc.close();
	}

}
