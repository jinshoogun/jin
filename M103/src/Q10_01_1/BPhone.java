package Q10_01_1;

public class BPhone implements IFunction {

	@Override
	public void callSenderReceive() {
		System.out.println("��/���� �����մϴ�.");
	}

	@Override
	public void canLte() {
		System.out.println("4G ���� �մϴ�.");

	}

	@Override
	public void tvRemoteController() {
		System.out.println("TV ������ ��� ž�� �Ǿ����ϴ�.");
	}

}
