package Q10_08;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GregorianCalendar cal = new GregorianCalendar();
		int year;
		boolean bool;

		System.out.print("�⵵�� �Է��ϼ��� : ");
		year = sc.nextInt();

		bool = cal.isLeapYear(year); // is: X�� Y�̴�.(����ó�� ���� ������.)

		if (bool)
			System.out.println("�����Դϴ�.");
		else
			System.out.println("����Դϴ�.");
	}
}
