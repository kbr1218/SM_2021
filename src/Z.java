public class Z extends Y{
	//Chapter3 OPP - HW (Inheritance) : Z
	int iz = 30;
	String msg = "I am a Z.";
	
	void print() {
		System.out.println(msg);
	}
	
	void play() {
		System.out.println("Play.." + msg);
	}
	
	void doZ() {
		System.out.println("do somthing in Z");		
	}
	
	void test (int i) {
		Z z = new Z();
		Y y = new Y();
		X x = new X();
		z.print();
		y.print();
		
		super.print();
		play();
		super.play();
		//y.doZ();							//컴파일에러
		//super.super.print();				//컴파일에러
		
		System.out.println("\ni = " + i);		
		System.out.println("this.i = " + this.iz);
		System.out.println("super.i = " + super.iy);
		System.out.println("y.i = " + y.iy);
		System.out.println("x.i = " + x.ix);
		System.out.println("((Y)this).i = " + ((Y)this).iy);
		System.out.println("((X)this).i = " + ((X)this).ix);
		//super.super.i = 10;

	}
}
