package basic;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		PalindromeNumber.display(num);
		sc.close();
	}

	public static void display(int num) {
		int tmp = num;
		int rev = 0;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			rev = rev*10+rem;
		}
		System.out.println("Original: "+tmp);
		System.out.println("Reversed: "+rev);
		if(tmp==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}

}
