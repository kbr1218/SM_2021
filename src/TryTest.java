public class TryTest {
	//Chapter2 Java Language - 2.6 Lab2-6-2 TryTest
	public static void main(String[] args) {
		String msg[] = {"Kim", "Bo", "Ri"};
		int n = msg.length;
		
		for (int i = 0; i <= n; i++) {
			try {
				System.out.println(msg[i]);				
			}catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Sorry. There is an exception.");
			}
		}
		System.out.println("Everything is done.");
		
	}



}
