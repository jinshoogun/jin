package ex06_01;

public class Arr05 {
	public static void main(String args[]) {
		String[] name = { "홍길동", "이순신", "세종대왕" };
		// 확장형 for문
		for (String na : name) {
			// name의 첫번째 방값부터 차례대로 na 변수로 저장한다.
			System.out.println(na);
		}
		System.out.println();
		for (int i = 0; i < name.length; i++)
			System.out.println(name[i]);
	}
}
