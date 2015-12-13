package ex17_04;

//������ ������ �ο����� �ʴ� ��
public class ThreadPriority implements Runnable {
	public void run() {
		for (int i =1; i <3; i++){
		// thread�� �̸��� ���� ���
		System.out.println(Thread.currentThread().getName() + "number = " + i);
		}
	}

	public static void main(String args[]) {
		ThreadPriority t1 = new ThreadPriority();

		// ù��° ������ ����
		Thread first = new Thread(t1, "first1");
		// �ι�° ������ ����
		Thread second = new Thread(t1, "second1");

		// ����° ������ ����
		Thread third = new Thread(t1, "third1");
		
		// �������� �켱������ ����ϴ� �κ�
		// ���α׷����� �켱������ �������� ������ �켱������ 5�� ��µ�
		// �ְ���� (MAX_PRIORITY : 10)
		// ���� ������ (NORM_PRIORITY : 5)
		// ��������(MIN_PRIORITY : 1)
		
		System.out.println("Thread�� �켱������ ����ϴ� �κ�");
		System.out.println("first priority =\t " + first.getPriority());
		System.out.println("second priority =\t " + second.getPriority());
		System.out.println("third priority =\t " + third.getPriority());
		
		first.start();
		second.start();
		third.start();

	}
}
