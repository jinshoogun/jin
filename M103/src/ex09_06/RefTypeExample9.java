package ex09_06;

// ������ ������ ������ ���࿡�� �߻�
public class RefTypeExample9 {
	public static void main(String args[]) {
		Account obj1 = new Account("111-22-333333", "ȫ�浿", 10000000);
		// ���η����η� .. cannot be cast to ..���η����η� - ��ĳ���� �� �ٿ� ĳ�����ؾ� �Ǵµ� ��ĳ���þ��� �ٿ�
		// ĳ�����Ϸ��� �ϴ� ������ ���׾׾׾׾�!!!
		// ��� �ڳ�Ŭ������ new CheckingAccount�� �����ؾߵ˴ϴ�.(��ĳ���� �ؾߵǴϱ��)
		CheckingAccount obj2 = (CheckingAccount) obj1;

		try {
			int amount = obj2.pay("4444-5555-6666-7777", 47000);
			System.out.println("����� = " + amount);
			System.out.println("ī���ȣ = " + obj2.cardNo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
