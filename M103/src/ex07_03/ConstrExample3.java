package ex07_03;

public class ConstrExample3 {
	public static void main(String args[]) {
		SubscriberInfo2 obj;
		obj = new SubscriberInfo2();
		printSubscriberInfo(obj);
	}

	static void printSubscriberInfo(SubscriberInfo2 obj) {
		System.out.println("�̸� : " + obj.name);
		System.out.println("���̵� : " + obj.id);
		System.out.println("�н����� : " + obj.password);
		System.out.println("��ȭ��ȣ : " + obj.phoneNo);
		System.out.println("�ּ� : " + obj.address);
		System.out.println();
	}

}