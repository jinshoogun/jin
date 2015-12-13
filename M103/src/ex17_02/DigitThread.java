package ex17_02;

public class DigitThread extends Thread {
	// 오버라이딩 - 오버라이딩 안해도 에러 X
	// start 메소드에 의해 실행됨
	public void run() {
		for (int cnt = 0; cnt < 10; cnt++)
			System.out.print(cnt);
	}

}
