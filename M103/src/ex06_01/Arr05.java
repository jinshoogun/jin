package ex06_01;

public class Arr05 {
	public static void main(String args[]) {
		String[] name = { "ȫ�浿", "�̼���", "�������" };
		// Ȯ���� for��
		for (String na : name) {
			// name�� ù��° �氪���� ���ʴ�� na ������ �����Ѵ�.
			System.out.println(na);
		}
		System.out.println();
		for (int i = 0; i < name.length; i++)
			System.out.println(name[i]);
	}
}
