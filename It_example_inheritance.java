// It example inheritance

package It_examples_inheritance;

public class Employee {

	String name;

	public void login() {
		System.out.println(name + "Emp login");
	}

	public void logout() {
		System.out.println(name + "Emp logout");
	}
}
---------------------

package It_examples_inheritance;

public class EmployeeHr extends Employee {
	public void records() {
		System.out.println(name + " opening the records");
	}

	public static void main(String[] args) {

		EmployeeHr emphr = new EmployeeHr();
		emphr.name = "Bharath";
		emphr.login();
		emphr.logout();
		emphr.records();
	}
}
/------------------------------------

