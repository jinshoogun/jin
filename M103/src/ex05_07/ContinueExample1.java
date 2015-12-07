package ex05_07;

public class ContinueExample1 {
	public static void main(String args[]) {
		for (int cnt = 0; cnt < 10; cnt++) {
			if (cnt == 5)
				continue;
			System.out.println(cnt);
		}
		System.out.println("Done.");
	}

}
