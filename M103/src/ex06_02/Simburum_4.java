package ex06_02;

public class Simburum_4 {
	static void ddal() {
		System.out.println("���� ȣ���߾��.");
	}

	static void ddal(int don) {
		System.out.println("���� ȣ���߾��." + don + "�� �޾Ҿ��.");

	}

	static void ddal(String name) {
		System.out.println(name + "���� ȣ���߾��.");
	}

	static int ddal(int dun, String name) {
		System.out.println(name + "���� ȣ���߰� " + dun + "�� �޾Ҿ��.");
		return 500; //return���� ddal �޼ҽ����� �ڷ������� ���߶�! ex) ���ڸ� ��Ʈ, ���ڸ� String
	}

	public static void main(String args[]) {
		Simburum_2.ddal(); // �޼ҵ� ȣ�� - Ŭ������, �޼ҵ�
		ddal(1000); // �޼ҵ� ȣ��
		ddal("�迬��");
		ddal(1000, "������");
		
		int dun = ddal(2000, "�����");
		System.out.println ("main: �޼ҵ� ȣ�� �� ���� �޴� �� = " + dun);
	}
}
