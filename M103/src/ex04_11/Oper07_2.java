package ex04_11;

import java.util.Scanner;

public class Oper07_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("���̸� �ۼ��Ͻʽÿ�.");
		num = sc.nextInt();

		if (num > 1 && num < 10)
			System.out.println("����� 10��̸� �Դϴ�.");
		if (num > 10 && num <= 19)
			System.out.println("����� 10�� �Դϴ�.");
		if (num >= 20 && num <= 29)
			System.out.println("����� 20�� �Դϴ�.");
		if (num >= 30 && num <= 39)
			System.out.println("����� 30�� �Դϴ�.");
		if (num >= 40 && num <= 49)
			System.out.println("����� 40�� �Դϴ�.");
		if (num >= 50)
			System.out.println("����� 50���̻� �Դϴ�.");

	}

}
