public class ForHelloNames {
	//Chapter2 Java Language - 2.5 Lab2-5-2 (1) ForHelloNames
	public static void main (String args[]) {
		int i;
		
		System.out.print("Hello ");
		for (i = 0; i < args.length; i++) {
			System.out.print(args[i]);
			System.out.print(" ");
		}
		System.out.println();
	}

}
