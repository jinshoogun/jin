package ex17_14;

//notifyAll �޼ҵ� ��뿹
public class MultithreadExample8 {
	public static void main(String args[]) {
		CalcThread thread1 = new CalcThread();
		PrintThread thread2 = new PrintThread();
		//����͸� ������ ����
		//Calc�����带 ����͸�
		MonitorThread thread3 = new MonitorThread(thread1);
		
		
		//����͸� ������ ����
		//printThread ����͸�
		//MonitorThread thread3 =new MonitorThread(thread2);
		SharedArea obj = new SharedArea();
		
		thread1.sharedArea = obj;
		thread2.sharedArea = obj;

		thread1.start();
		thread2.start();
		thread3.start();
	}
}
