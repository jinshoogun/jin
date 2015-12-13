package ex17_04;

//JVM이 스레드에 할당하는 시간과 실행순서는 하드웨어의 성능이나 시스템 환경이나 따라 달라 실행결과는 매번 다른 결과가 발생한다.
public class MultithreadExample2 {
	public static void main(String args[]) {
		ThreadLife t1 = new ThreadLife();

		// 첫번째 쓰레드 생성
		Thread first = new Thread(t1, "first"); // 쓰레드 생성
		// 생성사 형식 : public Thread (Runnable target, String Name)
		// Name : the name of the new Thread

		// 두번째 쓰레드 생성
		Thread second = new Thread(t1, "second");

		// 세번째 쓰레드 생성
		Thread third = new Thread(t1, "third");
		first.start();
		second.start();
		third.start();

	}

}
