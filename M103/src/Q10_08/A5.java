package Q10_08;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class A5 {
	public static void main(String[] args) {

		System.out.println("년도를 입력하세요!");

		GregorianCalendar calendar = new GregorianCalendar();

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		if (calendar.isLeapYear(year))
			System.out.println(year + "년은 윤년입니다.");
		else
			System.out.println(year + "년은 평년입니다.");
	}
}
