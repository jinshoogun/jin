package Q09_14;

import java.io.InputStream;
import java.util.Scanner;

public class Q2 {
	public static void main(String args[]) {
		InputStream is = System.in; // Ű���� �Է��� �� �� �ִ�.
		Scanner sc = new Scanner(is);
		// Ŭ������ ��ü ������ ������ ȣ��

		System.out.println("����(����)�� �Է��ϼ���?");
		int n = sc.nextInt();

		if (n % 3 == 0) {
			System.out.println(n + "�� 3�� ����̴�.");
		} else {
			System.out.println(n + "�� 3�� ����� �ƴϴ�.");
		}

	}

}
