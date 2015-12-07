package ex17_02;

public class MultithreadExample1 {
	public static void main(String args[]) {
		Thread thread = new DigitThread(); // 쓰레드 생성
		thread.start();

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
				// Sleep메소드 : 일정시간이 경과되길 기다리는 메소드 / 강제로 block상태를 만드는 것을 설정함.
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
