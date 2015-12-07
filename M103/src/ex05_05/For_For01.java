package ex05_05;

public class For_For01 {
	public static void main(String args[]) {
		System.out.println("구구단을 외우자.");
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}
}
