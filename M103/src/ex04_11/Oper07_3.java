package ex04_11;

import java.util.Scanner;

public class Oper07_3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("수를 입력하십시오.");
		num = sc.nextInt();

		if (num == 1 || num == 11)
			System.out.println("1");
		else
			System.out.println("0");
	}

}
