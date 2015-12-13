package ex17_15;
// Join �޼ҵ� �����
// Join() �޼ҵ带 ȣ���� �����尡 �����Ҷ� ���� ������ �����带 ��ٸ��� �Ѵ�.

public class JoinEx {
	public static void main(String args[]){
		System.out.println(Thread.currentThread().getName() + " start");
		Runnable r = new MyRunnableTwo();
		
		Thread myThread = new Thread (r);
		myThread.start();
		
		try{
			//myRunnableTwo�� �����尡 �����Ҷ� ���� main �����带 ��ٸ����Ѵ�.
			myThread.join();
		}catch (InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " end");
	}
}
