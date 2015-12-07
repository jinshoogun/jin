package ex04_08;

import java.io.InputStream; // 컨트롤 + 쉬프트 + "O" 에서 설정하십시요. (외부 클래스 소환시)
import java.util.Scanner; // 컨트롤 + 쉬프트 + "O" 에서 설정하십시요. (외부 클래스 소환시)

public class Oper03 {
	public static void main(String args[]) {
		InputStream is = System.in; // 키보드 입력을 할 수 있다.
		Scanner sc = new Scanner(is);
		// 클래스명 객체 연산자 생성자 호출

		System.out.print("정수를 입력하세요?");
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println(n + "은 짝수.");
		} else {
			System.out.println(n + "은 홀수.");
		}

	}

}
