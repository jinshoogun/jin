package ex17_04;

public class MultithreadExample3 {
	public static void main(String args[]) {
		// Runnable �������̽��� �����ϴ� Ŭ������ ��ü�� �����Ͽ� Thread �������� �Ķ���͸� ����Ѵ�.
		Thread thread = new Thread(new SmallLetters()); // ������ ����
		thread.start();

		char arr[] = { '��', '��', '��', '��', '��', '��', '��', '��', '��', '��', '��', '��', '��' };

		for (char ch : arr)
			System.out.println(ch);
	}

}
