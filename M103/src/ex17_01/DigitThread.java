package ex17_01;
//java.lang.Thread Ŭ������ ��Ŭ������ ����Ŭ������ Thread Ŭ������� ��.
//�����尡 ������ run �޼ҵ�ȿ� �ۼ��ؾ� �Ѵ�.
//public void run()�� �������� �ۼ�

public class DigitThread extends Thread{
	// �������̵� - �������̵� ���ص� ���� X
	// start �޼ҵ忡 ���� �����
	public void run(){
		for (int cnt = 0; cnt <10; cnt++)
			System.out.print(cnt);
	}

}
