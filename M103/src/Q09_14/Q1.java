package Q09_14;

import java.io.InputStream;
import java.util.Scanner;

public class Q1 {
	public static void main(String args[]) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);

		System.out.println("정수(숫자)를 입력하세요?");
		int n = sc.nextInt();
		System.out.println("정수(숫자)를 입력하세요?");
		int n1 = sc.nextInt();

		System.out.println(n + "더하기 " + n1 + "은 " + (n + n1) + "입니다.");
		System.out.println(n + "빼기 " + n1 + "은 " + (n - n1) + "입니다.");
		System.out.println(n + "곱하기 " + n1 + "은 " + (n * n1) + "입니다.");
		System.out.println(n + "나누기 " + n1 + "은 " + (n / n1) + "입니다.");
	}
}
