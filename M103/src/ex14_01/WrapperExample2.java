package ex14_01;

public class WrapperExample2 {
	public static void main(String args[]) {
		int total = 0;
		for (int cnt = 0; cnt < args.length; cnt++) {
			total = args[cnt] + total; //에러발생 - String -> int 형변환 요구
		}
		System.out.println(total);

	}
}
