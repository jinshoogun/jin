package ex10_05.math_1;

import ex10_05.geometry.*;
import ex10_05.geometry.polygon.*;
// *�� �� �ٷ� ���� ������ ������������ �ν��� �Ұ�!
public class PackageExample5 {
	public static void main(String args[]) {
		Circle obj1 = new Circle(5);
		Rectangle obj2 = new Rectangle(8, 9);

		if (obj1.getArea() > obj2.getArea())
			System.out.println("���� ������ �� �н��ϴ�.");

		else
			System.out.println("���� ������ �� �۰ų� �����ϴ�.");
	}

}
