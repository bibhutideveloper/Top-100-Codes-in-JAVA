package basic;

import java.util.Scanner;

public class PositiveOrNegativeNumber {
	public static void check(int num) {
		if(num>=0) {
			System.out.println("Positive");
		}else if(num<0) {
			System.out.println("Negative");
		}else {
			System.out.println("Number is ZERO");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		PositiveOrNegativeNumber.check(num);;
	}

}
