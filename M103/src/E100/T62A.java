package E100;

import java.io.InputStream;
import java.util.Scanner;

public class T62A {
	public static void main(String args[]) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);

		System.out.println("����(����)�� �Է��ϼ���?");
		int n = sc.nextInt();
		System.out.println("�����ڸ� �Է��ϼ���(+,-,*,/)?");
		String op = sc.next();
		System.out.println("����(����)�� �Է��ϼ���?");
		int n1 = sc.nextInt();

		if (op.equals("+")) {
			int result = n + n1;
			System.out.println(n + " ���ϱ� " + n1 + "�� " + result + " �Դϴ�.");
		} else if (op.equals("-")) {
			int result1 = n - n1;
			System.out.println(n + " ���� " + n1 + "�� " + result1 + "�Դϴ�.");
		} else if (op.equals("*")) {
			int result1 = n * n1;
			System.out.println(n + " ���ϱ� " + n1 + "�� " + result1 + "�Դϴ�.");
		} else if (op.equals("/")) {
			int result1 = n / n1;
			int result2 = n % n1;
			{
				if (result2 == 0)
					System.out.println(n + " ������ " + n1 + "�� ���� " + result1 + "�Դϴ�.");
				else
					System.out.println(n + " ������ " + n1 + "�� ���� " + result1 + "�̰� �������� " + result2 + "�Դϴ�.");
			}

		}

	}
}
