package ex05_07;

public class ContinueExample3 {
	public static void main(String args[]) {
		outerloop: for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 5; col++) {
				if ((row == 1) && (col == 3))
					continue outerloop;
				System.out.println("(" + row + ", " + col + ")");
			}

		}
		System.out.println("done.");
	}

}
