package ex09_02;
//obj.변수에 null이라는 참조값이 있기 때문에 컴파일에러는 없으나 실행시 에러가 발생합니다. (런타임 오류)

public class RefTypeExample3 {
	public static void main(String args[]) {
		Point obj = null;
		System.out.println(obj.x);
		System.out.println(obj.y);
	}

}
