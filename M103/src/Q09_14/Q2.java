package Q09_14;

import java.io.InputStream;
import java.util.Scanner;

public class Q2 {
	public static void main(String args[]) {
		InputStream is = System.in; // 키보드 입력을 할 수 있다.
		Scanner sc = new Scanner(is);
		// 클래스명 객체 연산자 생성자 호출

		System.out.println("정수(숫자)를 입력하세요?");
		int n = sc.nextInt();

		if (n % 3 == 0) {
			System.out.println(n + "은 3의 배수이다.");
		} else {
			System.out.println(n + "은 3의 배수가 아니다.");
		}

	}

}
