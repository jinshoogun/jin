package Q09_23;

public class Saram {
	String name; // �̸�
	double ki; // Ű
	int age; // ����
	boolean fm; // ���� ����(false), ���� (true)
	String blood; // ������ A, B, O, AB

	Saram(String name, int age, String blood, boolean fm) {

		this.name = name;
		this.age = age;
		this.blood = blood;
		this.fm = fm;

	}

	public void eat() {
		System.out.println(name + "���� �Դ´�.");
	}

	public void walk() {
		System.out.println(name + "�ȴ´�.");
	}

	public void sesu() {
		System.out.println(name + "�����Ѵ�.");
	}

	public void age() {
		System.out.println(name + age + "�� �̴�.");
	}

	public void blood() {
		System.out.println(name + blood + "���̴�.");
	}
	
	public void fm() {
		String a;
		if(fm==false)
			a="����";
		else
			a="����";
		System.out.println(name + a + "�̴�.");
	}
}
