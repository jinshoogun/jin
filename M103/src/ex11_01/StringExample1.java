package ex11_01;

public class StringExample1 {
	public static void main(String args[]) {
		String str = "자바 커피";
		int len = str.length(); // length 호출 (변수 명명할때 같은 형태 int)

		for (int cnt = 0; cnt < len; cnt++) {
			char ch = str.charAt(cnt); // charAt 호출 (변수 명명할때 같은 형태 char)
			System.out.println("Index =" + cnt + " | 문자열 = " + ch);
		}
	}
}
