package ex04_08;

import java.io.InputStream; // ��Ʈ�� + ����Ʈ + "O" ���� �����Ͻʽÿ�. (�ܺ� Ŭ���� ��ȯ��)
import java.util.Scanner; // ��Ʈ�� + ����Ʈ + "O" ���� �����Ͻʽÿ�. (�ܺ� Ŭ���� ��ȯ��)

public class Oper03 {
	public static void main(String args[]) {
		InputStream is = System.in; // Ű���� �Է��� �� �� �ִ�.
		Scanner sc = new Scanner(is);
		// Ŭ������ ��ü ������ ������ ȣ��

		System.out.print("������ �Է��ϼ���?");
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println(n + "�� ¦��.");
		} else {
			System.out.println(n + "�� Ȧ��.");
		}

	}

}
