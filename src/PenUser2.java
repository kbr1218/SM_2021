public class PenUser2 {
//Chapter3 OPP - 3.2 Class (Constructor) : Lab1-2 (2) PenUser2
	public static void main(String[] args) {
		System.out.println("Hello Pen!");
		
		System.out.println("mypen1 --------------------------");
		Pen2 mypen1 = new Pen2();
		mypen1.write();
		
		System.out.println("mypen2 --------------------------");
		Pen2 mypen2 = new Pen2("IT공학전공");
		mypen2.write();

		System.out.println("mypen3 --------------------------");
		Pen2 mypen3 = new Pen2(2021);
		mypen3.write();
		
		System.out.println("mypen4 --------------------------");
		Pen2 mypen4 = new Pen2("SMU", "Green", 1000);
		mypen4.write();
		
/* null이 나오는 이유 : 첫 번째 함수를 실행했을 때 ()안에 아무것도 없기 때문에 초기화가 안되었다. 그래서 write 함수의 값이 null
 * 첫번째의 경우, String만 써서 IT공학전공으로 초기화시켰기 때문에 나머지는 null이고 String만 써있다.
 * 똑같은 pen class가 있지만 call structure에 따라서 다르게 이용할 수 있음 -> 똑같은 객체를 만드는데 구별해서 사용할 수 있음
 */
	}
}
