public class ForHelloFriends {
	//Chapter2 Java Language - 2.5 Lab2-5-2 (1) ForHelloNames
	public static void main(String args[]) {
		System.out.print("Hello");
		for (String name : args) {
			System.out.print(name);
			System.out.print(" ");
		}
		System.out.println();
		
	}

}
