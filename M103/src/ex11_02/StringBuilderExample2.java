package ex11_02;

// StringBuffer ��ü�� ���� ũ�⸦ ����ϴ� ���α׷�
// StringBuffer ��ü�� ���� ����ũ�� : ���ڿ��� ���� + 16
public class StringBuilderExample2 {
	public static void main(String args[]) {
		System.out.println("--�ѿ���� ���� ħ������--");
		StringBuilder sb = new StringBuilder("Ǫ�� �����");
		printStringBuilder(sb);

		sb.append(" ������ ���� ���� �ɾ ���� ��ġ�� �����ϴ�.");
		printStringBuilder(sb);

		sb.insert(10, " ��ǳ���� ���� ���Ͽ� ��");
		printStringBuilder(sb);

		sb.delete(10, 29);
		printStringBuilder(sb);

	}

	static void printStringBuilder(StringBuilder sb) {
		String str = sb.toString();
		// ������ ���ڿ��� String ��ü�� ���� �����ϴ� �޼ҿ�����

		int len = sb.length();
		// ������ ���ڿ� ���̸� �����ϴ� �޼ҵ�

		int bufsize = sb.capacity();
		System.out.printf("%s(%d): %d %n", str, len, bufsize);

	}

}
