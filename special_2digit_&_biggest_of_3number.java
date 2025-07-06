// special two digit number 

package examples;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int a1 = n / 10;
		int a2 = n % 10;

		int sum = a1 + a2 + a1 * a2;
		if (sum == n) {
			System.out.println(n + " is a special two digit number");
		} else {
			System.out.println(n + " is not a special two digit number");
		}

	}
}



//---------------------



// Biggest of three number

package examples;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number a: ");
		int a = sc.nextInt();
		System.out.println("Enter the number b: ");
		int b = sc.nextInt();
		System.out.println("Enter the number c: ");
		int c = sc.nextInt();

		int big = a;
		if (b > big)
			big = b;
		if (c > big)
			big = c;

		System.out.println("Biggest of three number is :" + big);
	}
}


//---------------------------

