package ex04_11;

public class EqualityExample1 {
	public static void main(String args[]) {
		long num1 = 5000000000000000000l;
		long num2 = 2000000000000000000l + 3000000000000000000l;

		if (num1 == num2)
			System.out.println(num1 + "�� " + num2 + "�� ���� �����մϴ�.");

		if (num1 != num2)
			System.out.println(num1 + "�� " + num2 + "�� ���� �������� �ʽ��ϴ�.");

		if ((num1 != num2) == false)
			System.out.println("�ٸ��ٰ� �ϸ� ��������!");

	}

}
