// example for static keyword

package example_static_keyword;

public class User {

	static String name = "Raju";
	static int id = 101;
	static long password = 123456789;

	static void create() {
		System.out.println("Creating account..");
	}

	static void update() {
		System.out.println("Updateing account..");
	}

	static void delete() {
		System.out.println("Deleteing account.. ");
	}
}


---------


package example_static_keyword;

public class UserMain {

	public static void main(String[] args) {
		System.out.println(User.name);
		System.out.println(User.id);
		System.out.println(User.password);
		System.out.println("-------");
		
		User.create();
		User.update();
		User.delete();
	}
}

//------------------------