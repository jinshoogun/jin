package ex08_12;

public class BonusPointAccount extends Account {
	int bonusPoint;

	BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint) {
		super(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}

	void deposit(int amount) {
		balance += amount;
		bonusPoint += (int) (amount * 0.001);
	}
}
