package Q10_08;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class A5 {
	public static void main(String[] args) {

		System.out.println("�⵵�� �Է��ϼ���!");

		GregorianCalendar calendar = new GregorianCalendar();

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		if (calendar.isLeapYear(year))
			System.out.println(year + "���� �����Դϴ�.");
		else
			System.out.println(year + "���� ����Դϴ�.");
	}
}
