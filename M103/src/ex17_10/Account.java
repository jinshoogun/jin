package ex17_10;

public class Account {

	String accountNo; // 계좌번호
	String ownerName; // 이름
	int balance; // 잔액
	Account(String accountNo, String ownerName, int balance){
			this.accountNo = accountNo;
			this.ownerName = ownerName;
			this.balance = balance;
	
	}void deposit(int amount) { // 예금
		balance += amount;

	}int withdraw(int amount) { // 인출
		if (balance < amount)
			return 0;
		balance -= amount;
		return amount;
	}
}
