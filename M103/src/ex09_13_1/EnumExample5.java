package ex09_13_1;

import java.io.InputStream;
import java.util.Scanner;

public class EnumExample5 {
	public static void main(String args[]) {

		InputStream is = System.in;
		Scanner sc = new Scanner(is);

		System.out.println("0~3까지 숫자를 입력하세요");
		int n = sc.nextInt();

		switch (n) {
		case 0:
			printSeason(Season.SPRING);
		case 1:
			printSeason(Season.SUMMER);
		case 2:
			printSeason(Season.FALL);
		case 3:
			printSeason(Season.WINTER);
			break;

		default:
			System.out.println("잘못 작성하였습니다.");

		}
	}

	static void printSeason(Season season) {
		System.out.println("계절은 " + season.value() + "입니다.");

	}
}
