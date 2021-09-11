package p06class.p01textbook.exercise.p19;

public class Account {

	final static int MAX_BALANCE = 1000000;

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance >= 0 && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}

}
