package ex10_08;

public class call {
	public static void main(String args[]) {
		//PersonalInfo p1 = new PersonalInfo("������", '��'); - �ΰ��� private���� ��� �Ұ� private�� �����Ͻÿ�.
		PersonalInfo p2 = new PersonalInfo("������", 21, '��');
		print(p2);

		PersonalInfo p3 = new PersonalInfo("������", 21, '��', "A");
		print(p3);

	}

	static void print(PersonalInfo obj) {
		System.out.println();
		System.out.println("�̸� : " + obj.name);
		System.out.println("���� : " + obj.age);
		System.out.println("���� : " + obj.gender);
		System.out.println("������ : " + obj.bloodType);
	}

}
