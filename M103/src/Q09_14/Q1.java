package Q09_14;

import java.io.InputStream;
import java.util.Scanner;

public class Q1 {
	public static void main(String args[]) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);

		System.out.println("����(����)�� �Է��ϼ���?");
		int n = sc.nextInt();
		System.out.println("����(����)�� �Է��ϼ���?");
		int n1 = sc.nextInt();

		System.out.println(n + "���ϱ� " + n1 + "�� " + (n + n1) + "�Դϴ�.");
		System.out.println(n + "���� " + n1 + "�� " + (n - n1) + "�Դϴ�.");
		System.out.println(n + "���ϱ� " + n1 + "�� " + (n * n1) + "�Դϴ�.");
		System.out.println(n + "������ " + n1 + "�� " + (n / n1) + "�Դϴ�.");
	}
}
