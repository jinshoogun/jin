package ex08_01;

public class CheckingAccount extends Account {
	String cardNo; //����ī���ȣ

	int pay(String cardNo, int amount) throws Exception {
		if (!cardNo.equals(this.cardNo) || (balance < amount))
			throw new Exception("������ �Ұ����մϴ�.");
		return withdraw(amount);
	}

}
