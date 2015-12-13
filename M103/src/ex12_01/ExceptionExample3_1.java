package ex12_01;

//unchecked exception에 해당 - 컴파일 에러 없음
// 실행시 에러 발생 - 예외 발생
public class ExceptionExample3_1 {
	public static void main(String args[]) {
		try {
			int result = add(1, -2);
			System.out.println(result);
		} catch (Exception e) {
			System.err.println("에러 발생 빼애애애애액!");
		}
	}

	static int add(int a, int b) throws Exception {
		int result = a + b;
		if (result < 0)
			throw new Exception("에러 발생 빼애애애애액!");
		return result;
	}
}
