// it example for abstraction
package it_example_abstraction;

abstract class OnlineOrder {

	

	protected abstract void selectItem(String name);
	protected abstract void makePay(int amount);
	protected abstract void generateOrder(int id);

	
}

-------------

package it_example_abstraction;

public class Flipkart extends OnlineOrder {

	@Override
	public void selectItem(String name) {
		System.out.println("item added to cart: "+name);
	}

	protected void makePay(int amount) {
		System.out.println("Payment done: "+amount);
	}

	protected void generateOrder(int id) {
		System.out.println("orderid generated: " +id);
	}
}

------------


package it_example_abstraction;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		OnlineOrder order = new Flipkart();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Item:");
		String name = sc.next();
		System.out.println("Enter amount:");
		int amount = sc.nextInt();
		System.out.println("Enter id:");
		int id = sc.nextInt();

		order.selectItem(name);
		order.makePay(amount);
		order.generateOrder(id);
		System.out.println("Order Confirmed!");
		
	}
}

//-----------------