public class Account {
	//Chapter3 OPP - 3.9 Exception Handling : Lab Account
	private long balance;
	private String name;
	
	public Account (String name) {
		this.name = name;
	}
	
	public void deposit(int amount) throws MalformedDataTest{
		if (amount <= 0) {
			throw new MalformedDataTest();
		}
		balance = balance + amount;
	}
	
	public void withdraw(int amount)
		throws BalanceOutOfBoundsExceptionTest, MalformedDataTest{
			if (amount <= 0) {
				throw new MalformedDataTest();
			}
			if (balance < amount) {
				throw new BalanceOutOfBoundsExceptionTest();
			}
			
			balance = balance - amount;
		}
	public void check() {
		System.out.println(name + " : " + balance);
	}
	
}
