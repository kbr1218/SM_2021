public class ExceptionHW_CafeMain {
//Chapter3 OPP - 3.9 Exception Handling : Exception HW_CafeMain
	public static void main(String args[]) {
		ExceptionHW_Cafe Today = new ExceptionHW_Cafe(20);		//판매할 수 있는 커피의 수 = 20
		
		System.out.println("try 1 : ");
		Today.order(5);					//5개 주문
		//Today.order(-3) 				//-3을 주문할 경우 MalformedData 예외 발생
		try {
			//1st-1 try : normal
			Today.earning(5, 5000);		//커피 5개 주문, 5000원 지불 : 정상
			//2nd try : abnormal
			//Today.earning(-5, 5000);	//음수일 경우 NoMoneyException 예외 발생
		} catch (NoMoneyException be) {
			be.printStackTrace();
		} catch (MalformedDataTest me) {
			me.printStackTrace();
		}
		//1st try : abnormal
		//Today.earning(5, 3000);		//돈이 부족한 경우 NoMoneyException 예외 발생
		
		//2nd try-catch
		System.out.println("try 2 : ");
		try {
			Today.earning(3, 2000);		//(3 * 1000) > 2000이므로 NoMoneyException 발생
		} catch (NoMoneyException be) {
			be.printStackTrace();
		}
		System.out.println("계산 완료");
		
		Today.check();
	}
}
