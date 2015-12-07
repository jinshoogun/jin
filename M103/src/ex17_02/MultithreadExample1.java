package ex17_02;

public class MultithreadExample1 {
	public static void main(String args[]) {
		Thread thread = new DigitThread(); // ������ ����
		thread.start();

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
				// Sleep�޼ҵ� : �����ð��� ����Ǳ� ��ٸ��� �޼ҵ� / ������ block���¸� ����� ���� ������.
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
