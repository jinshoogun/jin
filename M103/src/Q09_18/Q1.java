package Q09_18;

import java.util.Scanner;

public class Q1 {
	public static void main(String args[]) {
		int a, a1, a2, a3, a4, i;
		int sum = 0;
		int average = 0;
		int num[];
		num = new int[5];
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 5개를 입력하세요.");
		a = sc.nextInt();
		a1 = sc.nextInt();
		a2 = sc.nextInt();
		a3 = sc.nextInt();
		a4 = sc.nextInt();

		num[0] = a;
		num[1] = a1;
		num[2] = a2;
		num[3] = a3;
		num[4] = a4;

		for (i = 0; i < num.length; i++) {
			System.out.println("score[" + i + "]" + "=" + num[i]);
			sum = sum + num[i];
			average = sum / num.length;
		}
		System.out.println("총합은 " + sum + "입니다.");
		System.out.println("평균은 " + average + "입니다.");
	}

}
