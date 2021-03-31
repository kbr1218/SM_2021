public class NoMoneyException extends Exception {
	//Chapter3 OPP - 3.9 Exception Handling : NoMoneyException

	public NoMoneyException() {
		super("이 돈으로 커피를 살 수 없습니다. ");
	}
}
