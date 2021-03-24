public class PenUser3 {
	//Chapter3 OPP - 3.2 Class (Overloading) : Lab1-3 (2) PenUser3
	
	public static void main(String[] args) {
		System.out.println("Hello Pen!");
		
		System.out.println("\nmypen1 --------------------------");
		Pen3 mypen = new Pen3();
		mypen.write();
		mypen.write(10000);			//price
		mypen.write(1000, "Red");	//price, color
		
		System.out.println("\nmypen2 --------------------------");
		Pen3 mypen2 = new Pen3("IT공학전공");		//vender 지정
		mypen2.write();
		mypen2.write(20000);					//price
		mypen2.write(2000, "SMU2");				//price, colormypen.write()

		System.out.println("\nmypen3 --------------------------");
		Pen3 mypen3 = new Pen3();
		mypen3.write();
		mypen3.write(20000);					//price
		mypen3.write(3000, "SMU3");				//price, vender
		mypen3.write(3000, "SMU3", "Yello");	//price, vender, color
	}
}
