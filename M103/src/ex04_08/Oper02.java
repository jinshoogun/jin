package ex04_08;

public class Oper02 {
	public static void main(String[] args) {

		String a = "Apple";
		String b = "Banana";
		String c = a + ", " + b;
		System.out.println(c);

		String str = "����� : ";
		int n = 10;
		System.out.println(str + n);
		System.out.println("����� : " + n);

		System.out.println("num=" + 3 + 4); // ���� ���ڿ����� �ν��ϴ� �ڿ��� ���ڿ���
		System.out.println(3 + 4 + "=num"); // 3+4�� ���ں��� �ν��ؼ� ���� ������ ���´�
		System.out.println(3 + 4 + "=num" + 3 + 4);
		System.out.println("num=" + (3 + 4));

	}

}
