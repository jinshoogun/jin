package ex10_04.math;

import ex10_04.geometry.polygon.Rectangle;

public class PackageExample2 {
	public static void main(String args[]) {
		Rectangle obj = new Rectangle(2, 3);
		System.out.println("���� = " + obj.width);
		System.out.println("���� = " + obj.height);
		System.out.println("���� = " + obj.getArea());
	}

}
