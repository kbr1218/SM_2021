import java.util.Date;
//사람들이 공유하기 때문에 Date같은 package도 public으로 되어있음

public class StringBufferDateTest {
	//Chapter1 Java(intro) - 1.8 Lab2 StringBufferDateTest
	public static void main(String[] args) {

		StringBuffer buf = new StringBuffer();
		//객체지향의 핵심, new가 생성자
		//buf : Class Instance Object --> Object
		//Object-Oriented : buf란 객체 내의 funtion을 실행 시킴
		
		buf.append("Hello ");
		buf.append("KBR --  ");
		
		System.out.println(buf.toString());
		
		Date date = new Date();
		buf.append(date);
		System.out.println(buf.toString());
	}

}
