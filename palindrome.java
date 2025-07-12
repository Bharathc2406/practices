// example for palindrome

package examples;

import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");

		int n = sc.nextInt();

		int a = n;
		int b = 0;

		while (n != 0) {
			int c = n % 10;
			b = b * 10 + c;
			n = n / 10;
		}

		if (a == b) {
			System.out.println("This number is  palindrome :" + a);
		} else {
			System.out.println("This  number is not palindrome :" + a);
		}
	}
}


//---------------------