package ex17_15;
// Join 메소드 사용방법
// Join() 메소드를 호출한 스레드가 종료할때 까지 현재의 스레드를 기다리게 한다.

public class JoinEx {
	public static void main(String args[]){
		System.out.println(Thread.currentThread().getName() + " start");
		Runnable r = new MyRunnableTwo();
		
		Thread myThread = new Thread (r);
		myThread.start();
		
		try{
			//myRunnableTwo의 스레드가 종료할때 까지 main 스레드를 기다리게한다.
			myThread.join();
		}catch (InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " end");
	}
}
