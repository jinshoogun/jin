package Q09_24;

public class ConstrExample {
	public static void main(String args[]) {
		SubscriberInfo obj, obj1, obj2;
		obj = new SubscriberInfo("��̼�", "172", "31");
		obj1 = new SubscriberInfo("������", "169", "56", "����", "AB");
		obj2 = new SubscriberInfo("����", "170", "51", "����", "B");

		printSubscriberInfo(obj);
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);
	}

	static void printSubscriberInfo(SubscriberInfo obj) {
		System.out.println("�̸� : " + obj.name);
		System.out.println("Ű : " + obj.ki);
		System.out.println("���� : " + obj.age);
		System.out.println("���� : " + obj.fm);
		System.out.println("������ : " + obj.blood);
		System.out.println();
	}

}