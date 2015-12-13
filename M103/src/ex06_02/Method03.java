package ex06_02;
public class Method03 {
	static void sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i;
		System.out.println("1~" + n + "까지의 합 : " + sum);
	}

	public static void main(String args[]) {
		sum(5);
		sum(10);
		sum(100);
	}
}
