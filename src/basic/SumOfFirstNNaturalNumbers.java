package basic;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
	
	public static void check(int num) {
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println("Sum of first "+num+" numbers:\n"+sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range of number:");
		int num = sc.nextInt();
		SumOfFirstNNaturalNumbers.check(num);
		sc.close();
	}

}
