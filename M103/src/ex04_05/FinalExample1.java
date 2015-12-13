package ex04_05;

public class FinalExample1 {
	public static void main(String args[]) {
		final double pi = 3.14;
		double radius = 2.0, circum;
		circum = 2 * pi * radius;
		System.out.println(circum);
		// pi = 3.14159;
		// circum = 2 * pi * radius ; - 3개 내용 작성시 에러 발생
		/// System.out.println(circum);

		System.out.println();

		double pi1 = 3.14;
		double radius1 = 2.0, circum1;
		circum1 = 2 * pi1 * radius1;
		System.out.println(circum1);
	}

}
