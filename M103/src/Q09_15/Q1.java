package Q09_15;

public class Q1 {
	public static void main(String args[]) {
		int a = 10, b = 20, c = 30, max, min;

		max = a < b ? b : a;
		max = max < c ? c : max;
		min = b < c ? b : c;
		min = min > a ? a : min;

		System.out.println(a + ", " + b + ", " + c + " 중 큰 수는 " + max + "입니다.");
		System.out.println(a + ", " + b + ", " + c + " 중 작은 수는 " + min + "입니다.");

	}

}
