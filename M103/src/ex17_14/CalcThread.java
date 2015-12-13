package ex17_14;
//파이를 계산하는 쓰레드
public class CalcThread extends Thread {
	SharedArea sharedArea;
	public void run() {
		double total = 0.0;
		// 파이를 계산하는 부분
		for (int cnt = 1; cnt < 100000000; cnt += 2)
			if (cnt / 2 % 2 == 0)
				total += 1.0 / cnt;
			else
				total -= 1.0 / cnt;

		sharedArea.result = total * 4;
		sharedArea.isReady = true;

		synchronized (sharedArea) {
			sharedArea.notify(); 
		}
	}
}
