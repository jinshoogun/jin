package ex04_11;

import java.util.Scanner;

public class Oper07_1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("���� �Է��ϼ���!");
		num = sc.nextInt();

		if (num >= 1 && num <= 10)
			System.out.println("1~10 ������ ���Դϴ�.");
		else if (num >= 1 || num <= 10)
			System.out.println("1~10 ������ ���� �ƴմϴ�.");
		// else
		// System.out.println("1~10 ������ ���� �ƴմϴ�."); - ������ ȿ���Դϴ�.
	}

}
