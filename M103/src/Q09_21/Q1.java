package Q09_21;

public class Q1 {
	public static void main(String args[]) {
		int row, dan;
		int gugudan[][] = new int [9][8];
		for (dan = 0; dan <= 7; dan++) {
			System.out.print((dan + 2) + "´Ü \t");
		}
		
		for (row = 0; row <= 8; row++) {
			System.out.println("");
			for (dan = 0; dan <= 7; dan++) {
				gugudan[row][dan] = (dan + 2) * (row + 1);

				System.out.print((dan + 2) + "*" + (row + 1) + "=" 
				+ (gugudan[row][dan]) + "\t");
			}

		}
	}

}
