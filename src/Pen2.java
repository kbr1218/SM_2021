public class Pen2 {
//Chapter3 OPP - 3.2 Class (Constructor) : Lab1-2 (1) Pen2
	String vender;
	String color;
	int price;
			
	public Pen2() {
	}
		
	public Pen2(String name) {
		vender = name;
	}
			
	public Pen2(int value) {
		price = value;
	}
			
	public Pen2(String name, String col, int pp) {
	vender = name;
	color = col;
	price = pp;
	}
			
	public void write() {
		System.out.println("Pen : wirte()");
		System.out.println("Pen vender : " + vender);
		System.out.println("Pen color : " + color);
		System.out.println("Pen price : " + price);
	}
			
	public void erase() {
		System.out.println("Pen : erase()");
	}
}


