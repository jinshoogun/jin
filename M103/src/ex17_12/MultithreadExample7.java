package ex17_12;
//notify �޼ҵ�� wait �޼ҵ� ��뿹
// ������ ���̿� ��ȣ�� ���� �ְ� ���� �� �ִ�.
// ����ȭ�� ������� ����ȭ��Ͽ��� �ٸ� �����忡�� ������� �ѱ��� ���Ѵ�.
// �̿� ���� ����ȭ�� ��Ͽ��� ������ ���� ���(������� �ѱ�) �ϱ� ���ؼ� wait(),notify(),notifyAll() �޼ҵ带 ����ؾ��Ѵ�.
//�� �޼ҵ带 ����Ҷ� synchronized ��Ͽ����� �ǹ̰� �ִ�.

public class MultithreadExample7 {
	public static void main(String args[]){
		CalcThread thread1 = new CalcThread();
		PrintThread thread2 = new PrintThread();
		SharedArea obj = new SharedArea();
		thread1.sharedArea = obj;
		thread2.sharedArea = obj;
		thread1.start();
		thread2.start();
	
	}

}
