public class DoWhileHelloFriends {
	//Chapter2 Java Language - 2.5 Lab2-5-3 (2) DoWhileHelloFriends
	public static void main(String args[]) {
		System.out.print("Hello ");
		
		int i = 0;
		if (args.length > 0) {
			do {
				System.out.print(args[i]);
				System.out.print(" ");
				i++;
			}while(i < args.length);
		}
		System.out.println();
	}

}
