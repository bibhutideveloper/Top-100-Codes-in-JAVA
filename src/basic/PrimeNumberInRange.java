package basic;

import java.util.Scanner;

public class PrimeNumberInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start range: ");
		int start = sc.nextInt();
		System.out.println("Enter end range: ");
		int end = sc.nextInt();
		PrimeNumberInRange.check(start, end);
		sc.close();
	}

	public static void check(int start, int end) {
		System.out.println("\nPrime numbers are: ");
		for(int i=start; i<=end; i++) {
			int count = 0;
			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}
	}

}
