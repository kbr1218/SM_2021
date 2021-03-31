public class Bank {
	//Chapter3 OPP - 3.9 Exception Handling : Lab Bank
	public static void main(String args[]) {
		Account KBR = new Account("KBR");
		KBR.deposit(20);
		//KBR.deposit(-100) 		//MalformedData 예외 발생
		try {
			//1st-1 try : normal
			KBR.withdraw(15);
			//2nd try : abnormal
			//KBR.withdraw(-50);		//BalanceOutOfBoundsException 예외 발생
		} catch (BalanceOutOfBoundsExceptionTest be) {
			be.printStackTrace();
		} catch (MalformedDataTest me) {
			me.printStackTrace();
		}
		KBR.check();
		//1st try : abnormal
		//KBR.withdraw(1);				//BalanceOutOfBoundsException 예외 발생
		
		//2nd try-catch
		try {
			KBR.withdraw(10);
			//BalanceOutOfBoundsException 예외 발생
		} catch (BalanceOutOfBoundsExceptionTest be) {
			be.printStackTrace();
		}
		System.out.println("normal termination");
	}

}
