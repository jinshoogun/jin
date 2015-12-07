package ex17_09;

public class PrintThread extends Thread {

	SharedArea sharedArea;
	PrintThread(SharedArea area) { // 생성자
		sharedArea = area;
	
	}public void run() {
		for (int cnt = 0; cnt < 3; cnt++) {
			synchronized (sharedArea) { //동기화시작
			int sum = sharedArea.account1.balance + sharedArea.account2.balance;
			System.out.println("계좌 잔액 합계 : " + sum);// 동기화 끝
			} try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
