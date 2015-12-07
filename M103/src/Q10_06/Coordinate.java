package Q10_06;

import ex10_09.geometry.common.Polygon;
import ex10_09.geometry.shape.Square;

public class Coordinate {
	public static void main(String args[]) {
		Square obj1 = new Square(100, 200, 15);
	
		for (int n = 0; n < 4; n++) {
			System.out.println("(" + obj1.getX(n)  + ")" +  "(" + obj1.getY(n) + ")");
		}
	}

}
