package ex06_02;

public class Simburum_3 {
	static void ddal() {
		System.out.println("���� ȣ���߾��.");
	}

	static void ddal(int don) {
		System.out.println("���� ȣ���߾��." + don + "�� �޾Ҿ��.");
		
	}
	static void ddal(String name) {
		System.out.println(name+"���� ȣ���߾��.");
	}
	
	

	public static void main(String args[]) {
		Simburum_2.ddal(); // �޼ҵ� ȣ�� - Ŭ������, �޼ҵ�
		ddal(1000); // �޼ҵ� ȣ��
		ddal("�迬��");
	}
}


