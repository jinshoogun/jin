package ex10_02.math;

public class PackageExample2 {
	public static void main (String args[]){
		ex10_02.geometry.polygon.Rectangle obj = new ex10_02.geometry.polygon.Rectangle(2,3);
		System.out.println("���� = " + obj.width);
		System.out.println("���� = " + obj.height);
		System.out.println("���� = " + obj.getArea());
	}

}
