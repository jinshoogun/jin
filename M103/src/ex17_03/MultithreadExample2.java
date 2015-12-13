package ex17_03;
// 세개의 쓰레드로 실행되는 멀티쓰레드 프로그램
public class MultithreadExample2 {
	public static void main(String args[]){
		// 세개의 스레드를 생성해서 시작합니다.
		Thread thread1 = new DigitThread();
		Thread thread2 = new DigitThread();
		Thread thread3 = new AlphabetThread();
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
