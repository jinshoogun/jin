package ex08_12;

public class CheckingAccount extends Account {
	String cardNo;

	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance); // 파라미터 3개의 슈퍼클래스 생성자 호출
		this.cardNo = cardNo;

	}

	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("지불이 불가능합니다.");
		return withdraw(amount);
	}

}
