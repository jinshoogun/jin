package ex11_01;
// String �����ڴ� ���� ������ String ��ü�� �����ϱ� ������ ��ü ������ �ּҰ��� �ٸ���.
// 7,8�� ��ɹ��� str1�� str2 �׸��� new�� �����  "�ڹ�" ��ü�� �����Ƿ� 3��! 

public class StringExample5 {
	public static void main(String args[]) {
		String str1 = new String("�ڹ�"); // ��ü�� Ȯ���ϴ� ���� �ƴ� ���ڿ��� ���Ѵ�. ��� ���� ��ü�� �Ǵ�!
		String str2 = new String("�ڹ�");

		if (str1.equals(str2))
			System.out.println("str1.equals(str2)�� ����.");
		else
			System.out.println("str1.equals(str2)�� �ٸ�.");
	}
}
