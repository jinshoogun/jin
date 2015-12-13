package ex11_02;

// StringBuilder 객체의 버퍼크기를 문자열에 맞게 줄이는 방법
public class StringBuilderExample4 {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder(100);
		sb.append("자바");
		System.out.println(sb + ": " + sb.capacity());

		// 버퍼가 저장된 문자의 수에 비해 과도하게 크면 문자의 수에 맞는 적당한 크기로 줄이는 메소소소오드
		sb.trimToSize();
		System.out.println(sb + ": " + sb.capacity());

	}

}
