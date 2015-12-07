package ex09_01;

public class RefTypeExample1 {
	public static void main (String args[]){
		Point obj1 = new Point(10, 20);
		Point obj2 = obj1;
		System.out.printf("obj1 = (%d, %d) %n", obj1.x, obj1.y);
		System.out.printf("obj2 = (%d, %d) %n", obj2.x, obj2.y);
		obj2.x = 30;
		System.out.printf("obj1 = (%d, %d) %n", obj1.x, obj1.y);
		System.out.printf("obj2 = (%d, %d) %n", obj2.x, obj2.y);
	}// printf는 C언어에서 사용할수 있도로 함으로 (%d, %d, %d)이라면 obj.x, obj.x, obj.z - new 세개 변수를 작성되어야 한다.
	// %n = println("");
	// 고로 printf()으로 단독으로 사용은 불가능하다!
}
