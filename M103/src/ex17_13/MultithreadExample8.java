package ex17_13;

//notifyAll 메소드 사용예
public class MultithreadExample8 {
	public static void main(String args[]) {
		CalcThread thread1 = new CalcThread();
		PrintThread thread2 = new PrintThread();
		SimplePrintThread thread3 = new SimplePrintThread();
		LuxuryPrintThread thread4 = new LuxuryPrintThread();
		SharedArea obj = new SharedArea();
		
		thread1.sharedArea = obj;
		thread2.sharedArea = obj;
		thread3.sharedArea = obj;
		thread4.sharedArea = obj;
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

	}

}
