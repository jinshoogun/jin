package ex04_11;

import java.util.Scanner;

public class Oper07_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("나이를 작성하십시오.");
		num = sc.nextInt();

		if (num > 1 && num < 10)
			System.out.println("당신은 10대미만 입니다.");
		if (num > 10 && num <= 19)
			System.out.println("당신은 10대 입니다.");
		if (num >= 20 && num <= 29)
			System.out.println("당신은 20대 입니다.");
		if (num >= 30 && num <= 39)
			System.out.println("당신은 30대 입니다.");
		if (num >= 40 && num <= 49)
			System.out.println("당신은 40대 입니다.");
		if (num >= 50)
			System.out.println("당신은 50대이상 입니다.");

	}

}
