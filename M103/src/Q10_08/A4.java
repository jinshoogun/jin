package Q10_08;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class A4 {
	public static void main(String[] args) {

		System.out.println("년도를 입력하세요!");

		// GregorianCalendar calendar = new GregorianCalendar();

		for (int year = 1970; year <= 2015; year++) {
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
				System.out.println(year + "년은 윤년입니다.");
			/* else System.out.println(year + "년은 평년입니다."); */
		}
	}
}
