package ex10_02.math;

public class PackageExample2 {
	public static void main (String args[]){
		ex10_02.geometry.polygon.Rectangle obj = new ex10_02.geometry.polygon.Rectangle(2,3);
		System.out.println("넓이 = " + obj.width);
		System.out.println("높이 = " + obj.height);
		System.out.println("면적 = " + obj.getArea());
	}

}
