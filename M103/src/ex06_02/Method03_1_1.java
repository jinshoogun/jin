package ex06_02;

import java.util.Scanner;

public class Method03_1_1 {
	static void sum(int a, int b) {
		int sum = 0;
		if (a < b) {
			for (int i = a; i <= b; i++)
				sum += i;
			System.out.println(a + " ~ " + b + "������ �� : " + sum);
		} else {
			for (int i = a; i >= b; i--)
				sum += i;
			System.out.println(b + " ~ " + a + "������ �� : " + sum);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է��� ���ΰ���?");
		int from = sc.nextInt();
		System.out.println("�� ������ ���� ���ұ��?");
		int to = sc.nextInt();
		sum(from, to);
	}
}
