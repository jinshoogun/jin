package ex11_02;

// StringBuilder ��ü�� ����ũ�⸦ ���ڿ��� �°� ���̴� ���
public class StringBuilderExample4 {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder(100);
		sb.append("�ڹ�");
		System.out.println(sb + ": " + sb.capacity());

		// ���۰� ����� ������ ���� ���� �����ϰ� ũ�� ������ ���� �´� ������ ũ��� ���̴� �޼ҼҼҿ���
		sb.trimToSize();
		System.out.println(sb + ": " + sb.capacity());

	}

}
