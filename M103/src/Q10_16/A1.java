package Q10_16;

public class A1 {
	public static void main(String args[]) {
		Thread thread = new Thread(new DigitThread()); // 쓰레드 생성
		thread.start();
	}
}