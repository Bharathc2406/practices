// example for polymorphism rtp

package example_polymorphism_rtp;

public class User {

	void start() {
		System.out.println("User login to system !!");
	}

}

class CreatingAccount extends User {

	@Override
	void start() {
		System.out.println("Creating account for customer");
	}
}

class RemoveAccount extends User {

	@Override
	void start() {
		System.out.println("Removing account");
	}
}


--------------------



package example_polymorphism_rtp;

public class UserMainClass {

	static void display(User u) {
		u.start();
	}

	public static void main(String[] args) {

		display(new User());
		display(new CreatingAccount());
		display(new RemoveAccount());

		System.out.println("--------------");

		User u;
		u = new User();
		u.start();
		u = new CreatingAccount();
		u.start();
		u = new RemoveAccount();
		u.start();

		System.out.println("---------------");

		User u1 = new User();
		u1.start();

		User u2 = new CreatingAccount();
		u2.start();

		User u3 = new RemoveAccount();
		u3.start();
	}
}


//-------------