package ex17_04;
//������� ��µ��� ����
public class ThreadLife implements Runnable {
	//�������̵� �ʼ�
	public void run(){
		for (int i =1; i <3; i++){//thread�� �̸��� ���� ���
			System.out.println(Thread.currentThread().getName() + "number = " + 1);
			
		}
	}

	
}
