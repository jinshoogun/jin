package ex04_11;

public class Oper04 {
	public static void main(String args[]) {
		int a = 10, b = 4;
		boolean test;

		test = a > b;
		System.out.println(a + ">" + b + "=" + test);

		test = a < b;
		System.out.println(a + "<" + b + "=" + test);

		test = a >= b;
		System.out.println(a + ">=" + b + "=" + test);

		test = a <= b;
		System.out.println(a + "<=" + b + "=" + test);

		int a1 = 1, b1 = 10;

		test = a1 == b1;
		System.out.println(a1 + "==" + b1 + "=" + test);

		test = a1 != b1;
		System.out.println(a1 + "!=" + b1 + "=" + test);

		char a2 = 'a', b2 = 'a';

		test = a2 == b2;
		System.out.println(a2 + "==" + b2 + "=" + test);

		test = a2 != b2;
		System.out.println(a2 + "!=" + b2 + "=" + test);

	}

}
