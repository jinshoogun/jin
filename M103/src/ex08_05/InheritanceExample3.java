package ex08_05;

public class InheritanceExample3 {
	public static void main(String args[]) {
		BonusPointAccount obj = new BonusPointAccount("333-33-333333", "��̿�", 0, 0);
		obj.deposit(1000000);
		System.out.println("�ܾ� = " + obj.balance);
		System.out.println("���� ����Ʈ = " + obj.bonusPoint);
	}
}
