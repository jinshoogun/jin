package ex05_05;

import java.util.Scanner;

public class For02 {
	public static void main(String args[]) {
		int dan, i;
		System.out.println("원하는 단을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		dan = sc.nextInt();
		if (dan == 1 || dan >= 10)
			System.out.println("사용불가!");
		else if (dan != 1) {
			System.out.println("[" + dan + "단]");
			for (i = 1; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + dan * i);
			}
		}
	}
}
