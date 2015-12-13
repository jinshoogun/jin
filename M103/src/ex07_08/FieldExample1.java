package ex07_08;

public class FieldExample1 {
	public static void main(String args[]) {
		Circle obj = new Circle(0.0);
		obj.radius = 5.0;
		double area = obj.getArea();
		System.out.println("원의 반지름 = " + obj.radius);
		System.out.println("원의 넓이  = " + area);
	}

}
