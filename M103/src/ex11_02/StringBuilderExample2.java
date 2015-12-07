package ex11_02;

// StringBuffer 객체의 버퍼 크기를 출력하는 프로그램
// StringBuffer 객체의 최초 버퍼크기 : 문자열의 길이 + 16
public class StringBuilderExample2 {
	public static void main(String args[]) {
		System.out.println("--한용운의 님의 침묵에서--");
		StringBuilder sb = new StringBuilder("푸른 산빛을");
		printStringBuilder(sb);

		sb.append(" 깨지고 적은 길을 걸어서 차마 떨치고 갔습니다.");
		printStringBuilder(sb);

		sb.insert(10, " 단풍나무 숲을 향하여 난");
		printStringBuilder(sb);

		sb.delete(10, 29);
		printStringBuilder(sb);

	}

	static void printStringBuilder(StringBuilder sb) {
		String str = sb.toString();
		// 버퍼의 문자열을 String 객체로 만들어서 리턴하는 메소오오드

		int len = sb.length();
		// 버퍼의 문자열 길이를 리턴하는 메소드

		int bufsize = sb.capacity();
		System.out.printf("%s(%d): %d %n", str, len, bufsize);

	}

}
