package ex17_11;

public class PrintThread extends Thread {
	SharedArea sharedArea;
	PrintThread(SharedArea area) { // ������
		sharedArea = area;

	}public void run() {
		for (int cnt = 0; cnt < 3; cnt++) {
			int sum = sharedArea.getTotal();
			System.out.println("���� �ܾ� �հ� : " + sum);// ����ȭ ��
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
