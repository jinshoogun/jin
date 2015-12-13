package ex08_05;

public class BonusPointAccount2 extends Account {
	int bonusPoint;

	BonusPointAccount2(String accountNo, String ownerName, int balance, int bonusPoint) {
		super(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}

	void deposit(int amount) {
		super.deposit(amount);
		bonusPoint += (int) (amount * 0.001);

	}

}
