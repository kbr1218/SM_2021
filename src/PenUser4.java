public class PenUser4 {
	//Chapter3 OPP - 3.2 Class (Package) : Lab1-4 (2) PenUser4
	public static void main(String[] args) {
		System.out.println("Hello Pen!");
			
		Pen4 mypen = new Pen4("SMU", "Green", 1000);
			
		mypen.erase();
		mypen.write();
		mypen.write(2000);
		mypen.write(3000, "Dept. IT Engineering");
			}
	}
