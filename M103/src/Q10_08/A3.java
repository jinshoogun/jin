package Q10_08;

import java.util.GregorianCalendar;
//import java.util.Scanner;

public class A3{
	public static void main(String[] args) {

		GregorianCalendar calendar = new GregorianCalendar();

		for (int year = 1970; year <= 2015; year++) {
			if (calendar.isLeapYear(year))
				System.out.println(year + "���� �����Դϴ�.");
			/*else
				System.out.println(year + "���� ����Դϴ�.");*/

		}
	}
}
