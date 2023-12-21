package basic;

import java.util.Scanner;

public class EvenOrOdd {
	public static void check(int num) {
		if(num%2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		EvenOrOdd.check(num);
		sc.close();
	}

}
