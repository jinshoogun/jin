package Q10_01_1;

public class APhone implements IFunction {

	@Override
	public void callSenderReceive() {
		System.out.println("��/���� �����մϴ�.");
	}

	@Override
	public void canLte() {
		System.out.println("3G ���� �մϴ�.");
	}

	@Override
	public void tvRemoteController() {
		System.out.println("TV ������ ��� ��ž�� �Ǿ����ϴ�.");
	}

}
