package ex10_05.math_1;

import ex10_05.geometry.*;
import ex10_05.geometry.polygon.*;
// *는 단 바로 하위 폴더만 하하위폴더는 인식이 불가!
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
