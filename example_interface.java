// example for interface

package example_interface;

public interface Employee {

	void details(String name);
	
}


interface TeamLead extends Employee{
	
	void  empno(int id);
}


-------------------


package example_interface;

import java.util.Scanner;

public class EmpManager implements TeamLead{

	@Override
	public void details(String name) {
		System.out.println("Name: "+ name);
	}
	
	@Override
	public void empno(int id) {
		System.out.println("EmpNo: "+id);
	}
	
	public static void main(String[] args) {
		EmpManager empm = new EmpManager();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name =sc.next();
		System.out.println("Enter empNo");
		int id = sc.nextInt();
		
		empm.details(name);
		empm.empno(id);
		
		
		
	}
}


//-------------------------