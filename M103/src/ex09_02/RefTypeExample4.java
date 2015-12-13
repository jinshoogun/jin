package ex09_02;
// 레퍼런스 변수를 null 참조값과 비교해서 처리하는 프로그램!!!
// 안쓰면 Exception in thread "main" java.lang.NullPointerException 요런 벩이 생길지도.....
public class RefTypeExample4 {
	public static void main(String args[]) {
		Point obj = null;
		if (obj == null){
			System.out.println("obj 변수가 가르키는 객체가 없습니다.");
			return;
		}
		System.out.println("x = " + obj.x);
		System.out.println("y = " + obj.y);
	}

}
