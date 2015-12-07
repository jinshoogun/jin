package ex17_12;
//notify 메소드와 wait 메소드 사용예
// 쓰레드 사이에 신호를 직접 주고 받을 수 있다.
// 동기화된 스레드는 동기화블록에서 다른 스레드에게 제어권을 넘기지 못한다.
// 이와 같이 동기화된 블록에서 스레드 간의 통신(제어권을 넘김) 하기 위해서 wait(),notify(),notifyAll() 메소드를 사용해야한다.
//이 메소드를 사용할때 synchronized 블록에서만 의미가 있다.

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
