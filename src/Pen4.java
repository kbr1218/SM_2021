public class Pen4 {
	//Chapter3 OPP - 3.2 Class (Package) : Lab1-4 (1) Pen4
	String vender;
	String color;
	int price;
	
	public Pen4() {
	}
	
	public Pen4(String name) {
		vender = name;
	}
	
	public Pen4(String name, String col, int pp) {
	vender = name;
	color = col;
	price = pp;
	}
	
	public void write() {
		System.out.println("Pen : wirte()");
		System.out.print("Pen vender : " + vender);
		System.out.print(", Pen color : " + color);
		System.out.println(", Pen price : " + price);
	}
	
	public void write(int xx) {
		System.out.println("Pen : wirte(int xx)");
		System.out.print("Pen vender : " + vender);
		System.out.print(", Pen color : " + color);
		System.out.println(", Pen price : " + xx);
	}
	
	public void write(int xx, String yy) {
		System.out.println("Pen : wirte(int, String)");
		System.out.print("Pen vender : " + yy);
		System.out.print(", Pen color : " + color);
		System.out.println(", Pen price : " + xx);
	}
	
	public void write(int xx, String yy, String zz) {
		System.out.println("Pen : wirte(int, String, String)");
		System.out.print("Pen vender : " + yy);
		System.out.print(", Pen color : " + zz);
		System.out.println(", Pen price : " + xx);
	}
	
	public void erase() {
		System.out.println("Pen : erase()");
	}
}