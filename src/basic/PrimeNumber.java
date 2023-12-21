package basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void check(int num){
		int count = 0;
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not prime");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		PrimeNumber.check(num);
		sc.close();
	}

}
