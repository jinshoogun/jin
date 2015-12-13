package Q09_17;

public class Q1 {
	public static void main(String args[]) {
		int a = 0;
		int sum = 0, sum1 = 0;

		for (a = 1; a <= 100; a++) {
			if (a % 2 == 1) {
				sum = sum + a;
			} else {
				sum1 = sum1 + a;
			}
		}
		System.out.println("1~100까지 홀수의 합은 " + sum + "입니다.");
		System.out.println("1~100까지 짝수의 합은 " + sum1 + "입니다.");
	}
}