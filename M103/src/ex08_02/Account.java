package ex08_02;

public class Account {

		String accountNo; // 계좌번호
		String ownerName; // 이름
		int balance; // 잔액

		void deposit(int amount) { //예금
			balance += amount;

		}

		int withdraw(int amount) throws Exception { //인출
			if (balance < amount)
				throw new Exception("잔액이 부족합니다.");
			balance -= amount;
			return amount;
		}

	}


