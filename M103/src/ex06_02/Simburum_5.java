package ex06_02;

public class Simburum_5 {
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
		return 500;
	}

	static String ddal2(int dun) {
		System.out.println("���� ȣ���߰� �뵷����  " + dun + "�� �޾Ҿ��.");
		return "�� �� �� �ּ���."; // return���� ddal �޼ҽ����� �ڷ������� ���߶�! ex) ���ڸ� ��Ʈ, ���ڸ�
								// String
	}

	static void main(String args[]) {
		Simburum_5.ddal(); // �޼ҵ� ȣ�� - Ŭ������, �޼ҵ�
		ddal(1000); // �޼ҵ� ȣ��
		ddal("�迬��");
		ddal(1000, "������");
		int dun = ddal(2000, "�����");
		System.out.println("main: �޼ҵ� ȣ�� �� ���� �޴� �� = " + dun);
		String re = ddal2(1000);
		System.out.println(re);
	}
}
