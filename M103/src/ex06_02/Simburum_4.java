package ex06_02;

public class Simburum_4 {
	static void ddal() {
		System.out.println("딸을 호출했어요.");
	}

	static void ddal(int don) {
		System.out.println("딸을 호출했어요." + don + "을 받았어요.");

	}

	static void ddal(String name) {
		System.out.println(name + "딸을 호출했어요.");
	}

	static int ddal(int dun, String name) {
		System.out.println(name + "딸을 호출했고 " + dun + "을 받았어요.");
		return 500; //return사용시 ddal 메소스에서 자료형식을 맞추라! ex) 숫자면 인트, 글자면 String
	}

	public static void main(String args[]) {
		Simburum_2.ddal(); // 메소드 호출 - 클래스명, 메소드
		ddal(1000); // 메소드 호출
		ddal("김연아");
		ddal(1000, "김태희");
		
		int dun = ddal(2000, "김소희");
		System.out.println ("main: 메소드 호출 뒤 돌려 받는 값 = " + dun);
	}
}
