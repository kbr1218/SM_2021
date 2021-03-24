public class PenUser {
//Chapter3 OPP - 3.2 Class : Lab1-1 (2) PenUser

	public static void main(String[] args) {
		System.out.println("Hello Pen!");
		
		Pen mypen = new Pen();	//객체 생성
		mypen.write();
		mypen.erase();
		//Pen class의 write/erase 함수 호출 = Method Invocation
	}
}
