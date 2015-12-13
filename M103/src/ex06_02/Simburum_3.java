package ex06_02;

public class Simburum_3 {
	static void ddal() {
		System.out.println("딸을 호출했어요.");
	}

	static void ddal(int don) {
		System.out.println("딸을 호출했어요." + don + "을 받았어요.");
		
	}
	static void ddal(String name) {
		System.out.println(name+"딸을 호출했어요.");
	}
	
	

	public static void main(String args[]) {
		Simburum_2.ddal(); // 메소드 호출 - 클래스명, 메소드
		ddal(1000); // 메소드 호출
		ddal("김연아");
	}
}


