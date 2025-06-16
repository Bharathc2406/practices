// string_array finding longest
 package examples;

public class Demo6 {
	public static void main(String[] args) {

		String[] n = { "Apple", "Banana", "Mango", "Watermelon" };
	
		String longest = n[0];
		for (int i = 1; i < n.length; i++) {
			if (n[i].length() > longest.length()) {
				longest = n[i];
			}
		}

		System.out.println("Longest fruit name: " + longest);
	}

}


