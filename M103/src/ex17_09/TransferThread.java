package ex17_09;

public class TransferThread extends Thread {
	SharedArea sharedArea;

	TransferThread(SharedArea area) {
		sharedArea = area;
		
	}public void run() {
		for (int cnt = 0; cnt < 12; cnt++) {
			synchronized (sharedArea) {// ����ȭ ����
				sharedArea.account1.withdraw(1000000);
				System.out.print("�̸��� ���� : 100���� ����, ");
				sharedArea.account2.deposit(1000000);
				System.out.println("������ ���� : 100���� �Ա�");
			}//����ȭ��
		}
	}
}
