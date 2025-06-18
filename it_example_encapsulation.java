//it exmple for encapsulation

package java_bean;

public class Person {

	private String name;
	private int id;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setAge(int age) {
		if(age>=18) {
			System.out.println("valid age to vote");
		}else {
			System.out.println("invalid age to vote");
		}
		this.age= age;
		
	}

	public int getAge() {
		return age;
	}

}

----------

package java_bean;

import java.util.Scanner;

public class PersonMainClass {

	public static void main(String[] args) {
		Person p = new Person();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name ");
		String name = sc.next();
		System.out.println("Enter id ");
		int id = sc.nextInt();
		System.out.println("Enter age ");
		int age = sc.nextInt();

		p.setName(name);
		System.out.println("Name: " + p.getName());

		p.setId(id);
		System.out.println("Id: " + p.getId());

		p.setAge(age);
		System.out.println("Age: " + p.getAge());

	}
}

//-------------------