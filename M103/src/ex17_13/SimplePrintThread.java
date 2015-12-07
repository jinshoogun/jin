package ex17_13;

//���̸� �Ҽ��� ���ڸ����� ����ϴ� Ŭ����
public class SimplePrintThread extends Thread {
	SharedArea sharedArea;

	public void run() {
		if (sharedArea.isReady != true) {
			try {
				synchronized (sharedArea) {
					sharedArea.wait(); // �ٸ� ������κ��� ��ȣ�� ��ٸ��ϴ�.
				}
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.printf("%.2f %n", sharedArea.result);
	}
}
