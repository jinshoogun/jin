package ex17_02;

public class DigitThread extends Thread {
	// �������̵� - �������̵� ���ص� ���� X
	// start �޼ҵ忡 ���� �����
	public void run() {
		for (int cnt = 0; cnt < 10; cnt++)
			System.out.print(cnt);
	}

}
