package ex10_04.math;

import ex10_04.geometry.polygon.Rectangle;

public class PackageExample2 {
	public static void main(String args[]) {
		Rectangle obj = new Rectangle(2, 3);
		System.out.println("넓이 = " + obj.width);
		System.out.println("높이 = " + obj.height);
		System.out.println("면적 = " + obj.getArea());
	}

}
