package ex14_01;

public class WrapperExample1 {
	public static void main(String args[]) {
		// 박싱 - 기본형 타입의 값을 객체로 변환
		// int - Integer
		Integer obj1 = new Integer(12); // Integer 객체 생성
		Integer obj2 = new Integer(7);

		// 언박싱 - 객체를 기본형 타입의 값으로 변환
		// Integer -> int
		int n1 = obj1.intValue();
		int n2 = obj2.intValue(); // Integer객체 안에 int 값을 가져옴
		int sum = n1 + n2;
		System.out.println(sum);

		// String -> Integer -> int
		Integer n02 = new Integer("20"); // 박싱 X, "20"은 문자열로 기본형이 아니다.
		int n3 = n02.intValue(); // 언박싱이 이루어짐, 이것으로 형변화가 이루어진다.
		System.out.println(n3);
	}
}
