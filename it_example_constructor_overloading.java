// example for constructor overloading

package it_example_constructor_overloading;

import java.util.Scanner;

public class Employee {

	String name;
	int id;
	double sal;

	Employee(String name) {
		this.name = name;
	}

	Employee(String name, int id) {
		this(name);
		this.id = id;
	}

	Employee(String name, int id, double sal) {
		this(name);
		this.id = id;
		this.sal = sal;
	}

	public static void main(String[] args) {
		Employee emp = new Employee("samsung", 101, 20000);

		System.out.println("Mobile name: " + emp.name);
		System.out.println("Mobile id: " + emp.id);
		System.out.println("Mobile price: " + emp.sal);

	}
}
