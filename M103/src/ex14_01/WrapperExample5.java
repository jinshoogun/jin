package ex14_01;

// 기본형 값 -> Wrapper 객체로의 자동 (오토) Boxing


public class WrapperExample5 {
	public static void main(String args[]) {
		printDouble(new Double (123.45));
		printDouble(123.45);
	}
	
	// 자동 (오토) Boxing
	static void printDouble (Double obj){
		//Double타입의 값을 가지고 Double타입 파라미터를 받는 메소드를 호출한다.
		System.out.println("obj = " + obj);
		System.out.println("obj.toString = " + obj.toString());
	}

}
