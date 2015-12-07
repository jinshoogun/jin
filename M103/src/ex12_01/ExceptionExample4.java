package ex12_01;

//unchecked exception를 던지는 메소드
// throws 절이 없어도 try-catch 문으로 예외처리가 가능
public class ExceptionExample4 {
	public static void main(String args[]) {
		try {
			int result = divide(3, 0);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.err.println("에러 발생 빼애애애애액!");
		}
	}

	static int divide(int a, int b) {
		int result = a / b;
		return result;
	}
}
