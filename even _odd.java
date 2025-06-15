// even_odd

package examples;

import java.util.Scanner;

public class Demo4 {

	int x;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		int x= sc.nextInt();
		System.out.println("Enter second value");
		int y= sc.nextInt();
		
		int a=0;
		int b=0;
		
		for(int i=x;i<=y;i++) {
			if(i%2==0) {
				System.out.println(i+ "is even");
				a=a+i;
				
			}
			
		}
		System.out.println("total value: "+a+" double value: "+a*2);
		
		
		for(int j=x;j<=y;j++) {
			if(j%3==0) {
				System.out.println(j);
				b=b+j;
			}
		}
		System.out.println("total value: "+b);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter first value");
//		int x = sc.nextInt();
//		System.out.println("enter  second value");
//		int y = sc.nextInt();
//		
//		int a=0;
//		
//		
//		for (int i = x; i <= y; i++) {
//			if (i % 2 == 0 ) {
//				System.out.println(i + " is even");
//				a=a+i;
//				
//			}
//			
//			
//		}
//		System.out.println(a +"total");
		
	

	}

}
