//example for middle value 

package examples;

import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		if (x > y && x < z || x > z && x < y) {
			System.out.println(x + "is middle number");
		} else if (y > z && y < x || y > x && y < z) {
			System.out.println(y + " is middle number");
		} else {
			System.out.println(z + " is middle number");
		}
	}
}




//---------------------