package ex08_16;

public class InterfaceExample2 {
	public static void main(String args[]) {

		SeparateVolume obj = new SeparateVolume("863��", "����", "�������� ��������");
		printState(obj);
		
		obj.checkOut("�̼���", "20060317");
		printState(obj);

	}

	static void printState(SeparateVolume obj) {
// System.out.println("obj.state = " + obj.state);
		if (obj.state == Lendable.STATE_NORMAL) { //STATE_NORMAL = 0
			System.out.println("-------------"); // �������̽� �������� �ʴ� Ŭ�����ε� ���� ������(�������̽���.�����)
			System.out.println("�������  : ���� ����");
			System.out.println("-------------");
		}
		if (obj.state == Lendable.STATE_BORROWED) {//STATE_BORROWED = 1
			System.out.println("-------------");
			System.out.println("�������  : ���� ��");
			System.out.println("������ : " + obj.borrower);
			System.out.println("������ : " + obj.checkOutDate);
			System.out.println("-------------");
		}
	}

}
