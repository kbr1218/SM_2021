public class ExceptionHW_Cafe {
	//Chapter3 OPP - 3.9 Exception Handling : Exception HW Cafe
	private long profit;
	private int coffee;
	
	public ExceptionHW_Cafe (int coffee) {
		this.coffee = coffee;				//내가 팔 수 있는 커피의 수
	}
	
	public void order(int numofcoffee) throws MalformedDataTest{
		if (numofcoffee <= 0) {				//주문받은 커피의 수가 0이하일 경우 MalformedDataTest 예외 발생
			throw new MalformedDataTest();
		}
		coffee = coffee - numofcoffee;		//정상적인 수를 얻었다면 coffee - numofcoffee
		System.out.println("주문한 커피의 수 : " + numofcoffee);
		System.out.println("남은 커피의 수 : " + coffee);
	}
	
	public void earning(int numofcoffee, int money)
		throws NoMoneyException, MalformedDataTest{
		System.out.println("주문한 커피의 수 : " + numofcoffee);
		System.out.println("받아야 하는 돈 : " + (numofcoffee * 1000));
		//커피 하나 당 1000원
			if (numofcoffee <= 0) {			//주문받은 커피의 수가 0이하일 경우 MalformedDataTest 예외 발생
				throw new MalformedDataTest();
			}
			if (money < (numofcoffee * 1000)) {
			// 받은 돈이 커피 가격보다 작다면 NoMoneyException 발생
				throw new NoMoneyException();
			}
			profit = numofcoffee * 1000;
			//수입은 판매한 커피 수 * 1000
		}
	
	public void check() {
		System.out.println("-------------------------");
		System.out.println("커피 팔아서 번 돈 : " + profit);
	}
	
}
