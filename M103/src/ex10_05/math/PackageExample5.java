package ex10_05.math;

import ex10_05.geometry.Circle;
import ex10_05.geometry.polygon.Rectangle;

public class PackageExample5 {
	public static void main(String args[]) {
		Circle obj1 = new Circle(5);
		Rectangle obj2 = new Rectangle(8, 9);

		if (obj1.getArea() > obj2.getArea())
			System.out.println("원의 면적이 더 넓습니다.");

		else
			System.out.println("원의 면적이 더 작거나 같습니다.");
	}

}
