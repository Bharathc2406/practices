// example for java libraries

package example_java_libraries;

public class User {

	String name;
	int id;
	int age;

	User(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User Name: " + name + "\nUser Id: " + id + "\nUser Age: " + age;
	}

	public static void main(String[] args) {
		User u1 = new User("Raju", 101, 20);
		User u2 = new User("Ravi", 102, 19);
		User u3 = new User("Ronny", 103, 23);
		System.out.println(u1);
		System.out.println("-------------");
		System.out.println(u2);
		System.out.println("-------------");
		System.out.println(u3);

	}

}

//----------------