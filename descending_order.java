// example for descending order


package examples;

import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int n;

		if (a < b) {
			n = a;
			a = b;
			b = n;
		}
		if (a < c) {
			n = a;
			a = c;
			c = n;
		}

		if (a < d) {
			n = a;
			a = d;
			d = n;
		}

		if (b < c) {
			n = b;
			b = c;
			c = n;
		}
		if (b < d) {
			n = b;
			b = d;
			d = n;
		}

		if (c < d) {
			n = c;
			c = d;
			d = n;
		}

		System.out.println("Descending order : " + a + " " + b + " " + c + " " + d);

	}
}


// ----------------------

