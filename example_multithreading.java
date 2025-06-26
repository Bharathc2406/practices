// example for Multi Threading

package example_multithreading;

public class User implements Runnable {

	public void run() {
		System.out.println("Creating user account !!");
	}

	public static void main(String[] args) {

		User u = new User();
		Thread t = new Thread(u);
		t.setName("user");
		t.start();

		Thread t1 = new Thread(new User());
		t1.setName("user");
		t1.start();
		
		Thread t2 = new Thread(new User(),"user");
		t2.start();
		
		new Thread(new User(),"user").start();
	}
}

//-----------------