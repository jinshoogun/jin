package Q10_01_1;

public class MainClass2 {

	public static void main(String args[]) {
		APhone obj1 = new APhone();
		System.out.println("*****APhone �Դϴ�.*****");
		printG(obj1);
		// �������� ���� �޼ҵ� ȣ��(Call by reference - �� �Ű������� ������(Ŭ����, �迭, �������̽�)�� ���)

		// �� ���޿� ���� �޼ҵ� ȣ��(Call by value-�Ű������� �⺻ �ڷ����� ���)

		BPhone obj2 = new BPhone();
		System.out.println("*****BPhone �Դϴ�.*****");
		printG(obj2);

		CPhone obj3 = new CPhone();
		System.out.println("*****CPhone �Դϴ�.*****");
		printG(obj3);

	}

	static void printG(IFunction obj) {
		obj.callSenderReceive();
		obj.canLte();
		obj.tvRemoteController();
	}

}
