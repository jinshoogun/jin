package ex05_05;

import java.util.Scanner;

public class For02 {
	public static void main(String args[]) {
		int dan, i;
		System.out.println("���ϴ� ���� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		dan = sc.nextInt();
		if (dan == 1 || dan >= 10)
			System.out.println("���Ұ�!");
		else if (dan != 1) {
			System.out.println("[" + dan + "��]");
			for (i = 1; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + dan * i);
			}
		}
	}
}
