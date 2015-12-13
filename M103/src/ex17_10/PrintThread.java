package ex17_10;

public class PrintThread extends Thread {
	SharedArea sharedArea;
	PrintThread(SharedArea area) { // 생성자
		sharedArea = area;

	}public void run() {
		for (int cnt = 0; cnt < 3; cnt++) {
			int sum = sharedArea.getTotal();
			System.out.println("계좌 잔액 합계 : " + sum);// 동기화 끝
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
