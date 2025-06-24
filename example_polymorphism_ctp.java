//example for polymorphism ctp

package example_polymorphism_ctp;

public class Employee {

	void show(String name) {
		System.out.println("Name: " + name);
	}

	void show(long id) {
		System.out.println("Id: " + id);
	}

	void show(int age) {
		System.out.println("Age: " + age);
	}

	void show(double sal) {
		System.out.println("Salary: " + sal);
	}

	void show(String name ,long id, int age, double sal){
		System.out.println("Name: "+name+" Id: "+id+" Age: "+age+" Salary: "+sal);
	}
	
	void show(String name , int age, double sal, long id){
		System.out.println("Name: "+name+" Age: "+age+" Salary: "+sal+" Id: "+id);
	}
	
}


------------------

package example_polymorphism_ctp;

public class EmpMain {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.show("raju");
		emp.show(10001);
		emp.show(20);
		emp.show(10000.0);
		emp.show("Jhon",102,19,30000.0);
		emp.show("Ravi",21,25000.0,103);
	}
}

//-------------------