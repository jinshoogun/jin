package ex08_04;

public class InheritanceExample3 {
	public static void main(String args[]) {
		CreditLineAccount obj = new CreditLineAccount("000-11-111111", "김선달", 10000, 20000000);
		try {
			int Amount = obj.withdraw(50000);
			System.out.println("인출액 = " + Amount);
			System.out.println("잔액 = " + obj.balance);
			System.out.println("마이너스 한도 = " + obj.creditLine);
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}

	}

}
