package Q10_06_1;

import ex10_09.geometry.shape.Square;

public class A2 {
	public static void main(String[] args) {
		Square obj = new Square(100, 200, 15);

		System.out.println("(" + obj.getX(0) + ", " + obj.getY(0) + ")");
		System.out.println("(" + obj.getX(1) + ", " + obj.getY(1) + ")");
		System.out.println("(" + obj.getX(2) + ", " + obj.getY(2) + ")");
		System.out.println("(" + obj.getX(3) + ", " + obj.getY(3) + ")");

	}
}
