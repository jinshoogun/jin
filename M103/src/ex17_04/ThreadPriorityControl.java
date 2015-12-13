package ex17_04;

//������ ������ �ο����� �ʴ� ��
public class ThreadPriorityControl implements Runnable {
	public void run() {
		for (int i =1; i <3; i++){
		// thread�� �̸��� ���� ���
		System.out.println(Thread.currentThread().getName() + "number = " + i);
		}
	}

	public static void main(String args[]) {
		ThreadPriorityControl t1 = new ThreadPriorityControl();

		// ù��° ������ ���� - ��������
		Thread first = new Thread(t1, "first1");
		first.setPriority(Thread.MIN_PRIORITY); //�������� ����
		System.out.println("first priority = " + first.getPriority());
		
		// �ι�° ������ ���� - �ְ����
		Thread second = new Thread(t1, "second1");
		second.setPriority(Thread.MAX_PRIORITY); //�ִ� ����
		System.out.println("second priority = " + second.getPriority());
		
		// ����° ������ ���� - ���� ������
		Thread third = new Thread(t1, "third1");
		System.out.println("third priority = " + third.getPriority());
		
		
		first.start();
		second.start();
		third.start();
		

	}
}
