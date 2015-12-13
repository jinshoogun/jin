package ex17_14;

// 다른 쓰레드를 모니터링하는 쓰레드
public class MonitorThread extends Thread {
	Thread thread;

	MonitorThread(Thread thread) { // 생성자
		this.thread = thread;
	}

	// 모니터링 대상 스레드의 상태를 2초마다 한번씩 출력합니다.
	public void run() {
		while (true) {
			Thread.State state = thread.getState();
			System.out.println("쓰레드의 상태 : " + state);
			if (state == Thread.State.TERMINATED)
				break;

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
