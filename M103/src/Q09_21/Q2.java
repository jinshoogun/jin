package Q09_21;

public class Q2 {
	public static void main(String args[]) {
		int[][] pulsdan = new int[9][8];
		int row, dan;

		for (dan = 0; dan <= 7; dan++) {
			System.out.print((dan + 2) + "´Ü \t");
		}
		
		for (row = 0; row <= 8; row++) {
			System.out.println("");
			for (dan = 0; dan <= 7; dan++) {
				pulsdan[dan][row] = (dan + 2) + (row + 1);
				
				System.out.print((dan + 2) + "+" + (row + 1) + " = " 
				+ pulsdan[dan][row] + "\t");
			}
		}

	}

}