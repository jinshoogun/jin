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
		System.out.println("1~100���� Ȧ���� ���� " + sum + "�Դϴ�.");
		System.out.println("1~100���� ¦���� ���� " + sum1 + "�Դϴ�.");
	}
}