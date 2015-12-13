package Q09_14;

import java.io.InputStream;
import java.util.Scanner;

public class P3 {
	public static void main(String args[]) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);

		System.out.println("정수(숫자)를 입력하세요?");
		int n = sc.nextInt();
		System.out.println("연산자를 입력하세요(+,-,*,/)?");
		String op = sc.next();
		System.out.println("정수(숫자)를 입력하세요?");
		int n1 = sc.nextInt();

		if (op.equals("+")) {
			int result = n + n1;
			System.out.println(n + " 더하기 " + n1 + "은 " + result + " 입니다.");
		} else if (op.equals("-")) {
			int result1 = n - n1;
			System.out.println(n + " 빼기 " + n1 + "은 " + result1 + "입니다.");
		} else if (op.equals("*")) {
			int result1 = n * n1;
			System.out.println(n + " 곱하기 " + n1 + "은 " + result1 + "입니다.");
		} else if (op.equals("/")) {
			int result1 = n / n1;
			int result2 = n % n1;
			{
				if (result2 == 0)
					System.out.println(n + " 나누기 " + n1 + "은 몫이 " + result1 + "입니다.");
				else
					System.out.println(n + " 나누기 " + n1 + "은 몫이 " + result1 + "이고 나머지는 " + result2 + "입니다.");
			}

		}

	}
}
