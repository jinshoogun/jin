package ex06_02;

public class Simburum2_2 {
	public static int dun = 1000; // 정적(static) 변수 초기화 :0

	static void ddal() {
		System.out.println("딸을 호출했고 " + dun + "을 받았습니다.");
	}

	public static void main(String args[]) {
		System.out.println(dun);
		ddal();
	}

}
