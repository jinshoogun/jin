package Q10_13;

import java.util.Scanner;

public class T2 {

	// String 변수에 두 수를 입력 받은 후 정수로 변환하여 최대값과 최소값을 구하는 프로그램 완성하기
	// Integer.valueOf(String) 메소드 사용방법(String -> Integer)

	public static void main(String args[]) {
		String a, b;
		int max, min;
		Scanner sc = new Scanner(System.in);

		System.out.println("두 수를 입력하세요 ? ");
		a = sc.next();
		b = sc.next();

		max = max(Integer.valueOf(a), Integer.valueOf(b));
		min = min(Integer.valueOf(a), Integer.valueOf(b));

		System.out.println("최대값은 = " + max);
		System.out.println("최소값은 = " + min);
	}

	// public static int max(Integer a, Integer b) {
	public static int max(int a, int b) {// 오토 언박싱
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		return max;
	}

	public static int min(int a, int b) {
		int min;
		if (a < b) {
			min = a;
		} else {
			min = b;
		}
		return min;
	}
}