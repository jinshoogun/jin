package Q10_08;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GregorianCalendar cal = new GregorianCalendar();
		int year;
		boolean bool;

		System.out.print("년도를 입력하세요 : ");
		year = sc.nextInt();

		bool = cal.isLeapYear(year); // is: X는 Y이다.(논리형처럼 같고 논리형임.)

		if (bool)
			System.out.println("윤년입니다.");
		else
			System.out.println("평년입니다.");
	}
}
