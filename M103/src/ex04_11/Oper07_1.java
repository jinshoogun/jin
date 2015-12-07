package ex04_11;

import java.util.Scanner;

public class Oper07_1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("수를 입력하세요!");
		num = sc.nextInt();

		if (num >= 1 && num <= 10)
			System.out.println("1~10 사이의 수입니다.");
		else if (num >= 1 || num <= 10)
			System.out.println("1~10 사이의 수가 아닙니다.");
		// else
		// System.out.println("1~10 사이의 수가 아닙니다."); - 동일한 효과입니다.
	}

}
