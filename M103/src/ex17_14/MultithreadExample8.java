package ex17_14;

//notifyAll 메소드 사용예
public class MultithreadExample8 {
	public static void main(String args[]) {
		CalcThread thread1 = new CalcThread();
		PrintThread thread2 = new PrintThread();
		//모니터링 쓰레드 생성
		//Calc쓰레드를 모니터링
		MonitorThread thread3 = new MonitorThread(thread1);
		
		
		//모니터링 쓰레드 생성
		//printThread 모니터링
		//MonitorThread thread3 =new MonitorThread(thread2);
		SharedArea obj = new SharedArea();
		
		thread1.sharedArea = obj;
		thread2.sharedArea = obj;

		thread1.start();
		thread2.start();
		thread3.start();
	}
}
