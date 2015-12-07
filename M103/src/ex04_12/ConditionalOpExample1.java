package ex04_12;

public class ConditionalOpExample1 {
	public static void main(String args[]) {
		int a = 20, b = 3, max;
		max = a > b ? a : b;
		System.out.println("최대값 = " + max);

		int a1 = 20, b1 = 3, min, min2;
		min = a1 < b1 ? a1 : b1;
		min2 = !(a1 > b1) ? a1 : b1;
		System.out.println("최소값 = " + min);
		System.out.println("최소값 = " + min2);

	}

}
