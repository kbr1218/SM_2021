import java.util.Date;

public class HelloMEwithDate {
	//Chapter1 Java(intro) - 1.7 Lab1 (1) HelloMEwithDate
	public static void main(String[] args) {
		String msg = "Kim Bo Ri";
		
		System.out.println("Hello Java");
		System.out.println("ME is " + msg);
		
		Date date = new Date();
		System.out.println("Today: " + date);
		//Date = 생성자 construct
		//변수는 다 소문자, 클래스는 다 대문자
	}
}
