package ex14_01;

// Wrapper객체 - 기본형 값으로 자동 UnBoxing 하는 예
// 기본형의 값을 써야할 자리에 Wrapper객체를 사용하면 그 Wrapper 객체로부터 기본형의 값이 자동으로 추출되어 사용된다.

public class WrapperExample4 {
	public static void main(String args[]) {
		// 문자열 "10"을 Wrapper 객체 Integer로 바꿈
		Integer obj = new Integer("10");

		// Integer 객체와 int타입의 값을 더하는 명령문
		int sum = obj + 20; // 자동(오토) - UnBoxing
		// int sum = obj.intValue() + 20;

		System.out.println(sum);
	}

}
