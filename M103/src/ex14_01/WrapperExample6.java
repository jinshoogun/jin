package ex14_01;
// 기본형 값 -> Wrapper 객체로의 자동 (오토) Boxing
//Wrapper객체 -> 기본형의 값으로  자동 (오토) UnBoxing
public class WrapperExample6 {
	public static void main(String args[]) {
		int n01 = 10;
		int n02;
		Integer obj01; // obj01은 주소값이 갖고 있지 않다.

		// 박싱- 기본형 타입의 값을 객체화
		// int -> Integer
		Integer obj02 = new Integer(20); // Integer 객체생성

		obj01 = n01; // 오토 박싱 jdk 1.5 이상 지원
		// obj01 = new Integer(n01); //박싱

		n02 = obj02; // 오토 언박싱
		//n02 = obj02.intValue();; // 언박싱

		System.out.println(n01 + ", " + obj01);
		System.out.println(n02 + ", " + obj02);
		System.out.println(n01 + ", " + obj01.toString());
		System.out.println(n02 + ", " + obj02.toString());
	}

}
