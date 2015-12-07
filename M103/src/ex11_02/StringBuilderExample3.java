package ex11_02;

// StringBuffer 객체의 버퍼 크기를 인위적으로 늘리는 프로그램
// ensureCapacity 메소드를 이용하여 버퍼의 크기를 필요한 만큼 한꺼번에 늘릴 수 있기 때문에 효율이 높다.
public class StringBuilderExample3 {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("푸른 산빛을");
		sb.ensureCapacity(50);
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
