package ex09_03;

//obj ������ Ÿ���� Account�̱� ������ Account�� ���� pay �޼ҵ峪 cardNo�ʵ�� �����Ϸ� ���� �߻�
public class RefTypeExample6 {
	public static void main(String args[]) {
		// 1
		// Account obj = new CheckingAccount("111-22-333333", "ȫ�浿", 10,
		// "4444-5555-6666-7777");
		// obj ������ Ÿ���� Account�̱� ������ Account�� ���� pay �޼ҵ峪 cardNo�ʵ�� �����Ϸ� ���� �߻�

		// 2
		// Account obj1 = new CheckingAccount("111-22-333333", "ȫ�浿", 10,
		// "4444-5555-6666-7777");
		// CheckingAccount obj2 = (CheckingAccount)obj1;
		// �����Ϸ��� ������ Ÿ�Ը� ���� ���԰��ɼ��� �˻��ϱ� ������ ���� �߻�

		Account obj1 = new CheckingAccount("111-22-333333", "ȫ�浿", 10000000, "4444-5555-6666-7777");
		// ��ĳ���� (�ڽ� Ŭ�󽺰� �θ�Ŭ�������� ȣ���ϴ� ����)
		// ����ȯ ���� ���� (�����Ϸ��� ���� �ӽ��� ����ȯ)
		// �ڽ�Ŭ������ �������̵� �� �޼ҵ带 ȣ��(���������� ��ҵȴ�.)
		
		CheckingAccount obj2 = (CheckingAccount) obj1;
		// int x = (int) x �� ������ �����غ��ƶ�!
		
		// �ٿ� ĳ����
		// �θ�Ŭ������ �ڽ�Ŭ�������� ȣ���ϴ� ����
		// ����ȯ ���
		// ���� ������ ��ĳ������ �Ϳ� ���ؼ��� �ٿ� ĳ���� ����Ѵ�.
		// ��ӹ��� �θ��� �޼ҵ嵵 ȣ�� ����(�������� Ȯ��)
		try {
			int amount = obj2.pay("4444-5555-6666-7777", 47000);
			System.out.println("����� = " + amount);
			System.out.println("ī���ȣ = " + obj2.cardNo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
