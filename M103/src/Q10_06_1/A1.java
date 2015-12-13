package Q10_06_1;

import ex10_09.geometry.shape.Square;

public class A1 {
	public static void main(String args[]) {
		Square s = new Square(100, 200, 15);

		int x, y;
		for (int i = 0; i < 4; i++) {
			x = s.getX(i);
			y = s.getY(i);
			System.out.print("x[" + i + "]=" + x + "\t");
			System.out.print("y[" + i + "]=" + y + "\n");
		}

		for (int i = 0; i < 4; i++) {
			x = s.getX(i);
			y = s.getY(i);
			System.out.print("(" + x + ",");
			System.out.print(y + ")" + "\n");
		}
	}
}
