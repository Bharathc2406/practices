//prime numbers
package examples;

import java.util.Scanner;

public class Demo2 {

	int x;
	int a;
	int b;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value ");
		int a = sc.nextInt();
		System.out.println(" enter second value");
		int b = sc.nextInt();
		boolean isPrime = true;
		for (int  x= a; x <= b; x++) {
			isPrime = true;

			if (x <= 1) {
				isPrime = false;
			} else {
				for (int i = 2; i <= x / 2; i++) {
					if (x % i == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime) {
				System.out.println(x + "is prime ");
			}
		}

//		else {
//			System.out.println(x+" is not prime");
//		}
	}

//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter value");
//		int x= sc.nextInt();
//		
//		
//		if(x <1) {
//			System.out.println(x+"is  not prime");
//		}
//		if(x ==2 || x==3) {
//			System.out.println(x +" is prime");
//		}
//		if( x%2 ==0 || x%3 ==0) {
//			System.out.println(x+ "is not prime");
//		}
//		
//		for(int i =5;i*i<=x;i+=6) {
//			if(x%1==0||x%(i+2) ==0) {
//				System.out.println( x+"is not prime");
//			}
//		}
//		System.out.println( x+"is prime");
//		
//	}

}
// ----------------------------------

// fibanocci

package examples;

import java.util.Scanner;

public class Demo3 {
	int first;
	int second;
	int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for n");
		int n = sc.nextInt();
		System.out.println("enter the value for first");
		int first = sc.nextInt();
		System.out.println("enter the value for second");
		int second = sc.nextInt();

		for(int i=0;i<=5;i++) {
			System.out.println("Fibannoic  series"+ " " +first);
			n = first + second;
			first = second;
			second = n;
		}
		
		

	}
}
