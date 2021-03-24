public class Pen3 {		//overloading
	//Chapter3 OPP - 3.2 Class (Overloading) : Lab1-3 (1) Pen3
	String vender;
	String color;
	int price;
	
	public Pen3() {
	}
	
	public Pen3(String name) {
		vender = name;
	}
	
	public Pen3(String name, String col, int pp) {
	vender = name;
	color = col;
	price = pp;
	}
	
	void write() {
		System.out.println("Pen : wirte()");
		System.out.print("Pen vender : " + vender);
		System.out.print(", Pen color : " + color);
		System.out.println(", Pen price : " + price);
	}
	
	void write(int xx) {
		System.out.println("Pen : wirte(int xx)");
		System.out.print("Pen vender : " + vender);
		System.out.print(", Pen color : " + color);
		System.out.println(", Pen price : " + xx);
	}
	
	void write(int xx, String yy) {
		System.out.println("Pen : wirte(int, String)");
		System.out.print("Pen vender : " + yy);
		System.out.print(", Pen color : " + color);
		System.out.println(", Pen price : " + xx);
	}
	
	void write(int xx, String yy, String zz) {
		System.out.println("Pen : wirte(int, String, String)");
		System.out.print("Pen vender : " + yy);
		System.out.print(", Pen color : " + zz);
		System.out.println(", Pen price : " + xx);
	}
	
	public void erase() {
		System.out.println("Pen : erase()");
	}
}
