package ex14_01;

public class WrapperExample1 {
	public static void main(String args[]) {
		// �ڽ� - �⺻�� Ÿ���� ���� ��ü�� ��ȯ
		// int - Integer
		Integer obj1 = new Integer(12); // Integer ��ü ����
		Integer obj2 = new Integer(7);

		// ��ڽ� - ��ü�� �⺻�� Ÿ���� ������ ��ȯ
		// Integer -> int
		int n1 = obj1.intValue();
		int n2 = obj2.intValue(); // Integer��ü �ȿ� int ���� ������
		int sum = n1 + n2;
		System.out.println(sum);

		// String -> Integer -> int
		Integer n02 = new Integer("20"); // �ڽ� X, "20"�� ���ڿ��� �⺻���� �ƴϴ�.
		int n3 = n02.intValue(); // ��ڽ��� �̷����, �̰����� ����ȭ�� �̷������.
		System.out.println(n3);
	}
}
