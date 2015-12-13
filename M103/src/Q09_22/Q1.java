package Q09_22;

public class Q1 {
	public static void main(String args[]) {
		int result1, result2;
		result1 = max1(50, 100);
		result2 = min1(50, 100);
		System.out.println("최대값은 = " + result1);
		System.out.println("최소값은 = " + result2);
	}

	static int max1(int num1, int num2) {
		int max1 = num1 > num2 ? num1 : num2;
		return max1;
	}

	static int min1 (int num1, int num2) {
		int min1 = num1 < num2 ? num1 :num2;
		return min1;
	}
}
