package ex07_06;

public class ConstrExample4 {
	public static void main(String args[]) {
		SubscriberInfo2 obj;
		obj = new SubscriberInfo2("���ӽ� ����", "java", "java", "010-111-2222", "ã��������");
		printSubscriberInfo2(obj);
	}

	static void printSubscriberInfo2(SubscriberInfo2 obj) {
		System.out.println("�̸� : " + obj.name);
		System.out.println("���̵� : " + obj.id);
		System.out.println("�н����� : " + obj.password);
		System.out.println("��ȭ��ȣ : " + obj.phoneNo);
		System.out.println("�ּ� : " + obj.address);
		System.out.println();
	}

}

