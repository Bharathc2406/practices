// month number is valid or invaild

package examples;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month number: ");
		int m = sc.nextInt();

		if (m >= 1) {
			if (m <= 12) {
				System.out.println("Valid month number");
			} else {
				System.out.println("Invalid month number");
			}
		} else {
			System.out.println("InValid month number..");
		}
	}
}

----------------



//subject marks pass or fail 

package examples;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the A  marks: ");
		int a = sc.nextInt();
		System.out.println("Enter the B  marks: ");
		int b = sc.nextInt();
		System.out.println("Enter the C  marks: ");
		int c = sc.nextInt();
		System.out.println("Enter the D  marks: ");
		int d = sc.nextInt();

		if (a < 35 || b < 35 || c < 35 || d < 35) {
			System.out.println("Fail");
		} else {
			System.out.println("Pass");
		}
	}
}


//----------------------------