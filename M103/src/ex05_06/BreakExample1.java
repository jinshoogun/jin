package ex05_06;

public class BreakExample1 {
	public static void main(String args[]) {
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.println(cnt);
			if (cnt == 5)
				break;

		}
		System.out.println("done.");
	}

}
