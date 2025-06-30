//  example for type casting

package example_type_casting;

public class User {

	String name = "Ravi";
	int age = 20;
	long id = 101;
}

--------------

package example_type_casting;

public class UserAccount extends User {

	void createAccount() {
		System.out.println("Creating User Account");
	}

}

class TestAccount extends User {
	void testAccount() {
		System.out.println("Testing User Account");
	}

}

class RemoveAccount extends User {
	void removeAccount() {
		System.out.println("Removing User Account");
	}
}


-------------------


package example_type_casting;

public class UserMain extends User {

	static void display(User u) {
		if (u instanceof UserAccount) {
			UserAccount ua = (UserAccount) u;
			System.out.println("Name :" + u.name + " Age :" + u.age + " Id :" + u.id);
			ua.createAccount();
		} else if (u instanceof TestAccount) {
			TestAccount ta = (TestAccount) u;
			System.out.println("Name :" + u.name + " Age :" + u.age + " Id :" + u.id);
			ta.testAccount();
		} else if (u instanceof RemoveAccount) {
			RemoveAccount ra = (RemoveAccount) u;
			System.out.println("Name :" + u.name + " Age :" + u.age + " Id :" + u.id);
			ra.removeAccount();
		}

	}

	public static void main(String[] args) {
		display(new UserAccount());
		System.out.println("---------------");
		display(new TestAccount());
		System.out.println("---------------");
		display(new RemoveAccount());
	}
}


//------------------------------