package ex08_04;

public class InheritanceExample3 {
	public static void main(String args[]) {
		CreditLineAccount obj = new CreditLineAccount("000-11-111111", "�輱��", 10000, 20000000);
		try {
			int Amount = obj.withdraw(50000);
			System.out.println("����� = " + Amount);
			System.out.println("�ܾ� = " + obj.balance);
			System.out.println("���̳ʽ� �ѵ� = " + obj.creditLine);
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}

	}

}
