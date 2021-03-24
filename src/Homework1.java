public class Homework1 {
	//Chapter2 Java Language - 2.4 Homework1
	public static void main(String args[]) {
		char stars[][];
		char tree[][];
		
		char sign[] = new char[5];
		
		sign[0] = 'T';
		sign[1] = 'R';
		sign[2] = 'E';
		sign[3] = 'E';
		sign[4] = '!';

		stars = new char[6][];
		for (int i = 0; i < stars.length; i++) {
			stars[i] = new char[i + 1];
			for (int k = 6 - stars[i].length ; k > 0; k--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 2 * stars[i].length - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		tree = new char[2][];
		for (int m = 0; m < tree.length; m++) {
			tree[m] = new char[m + 1];
			System.out.println("    ||");
			}
			
		System.out.print((char)sign[0]);
		System.out.print((char)sign[1]);
		System.out.print((char)sign[2]);
		System.out.print((char)sign[3]);
		System.out.println((char)sign[4]);
	}
}
