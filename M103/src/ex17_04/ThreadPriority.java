package ex17_04;

//스레드 순위를 부여하지 않는 것
public class ThreadPriority implements Runnable {
	public void run() {
		for (int i =1; i <3; i++){
		// thread의 이름과 정수 출력
		System.out.println(Thread.currentThread().getName() + "number = " + i);
		}
	}

	public static void main(String args[]) {
		ThreadPriority t1 = new ThreadPriority();

		// 첫번째 쓰레드 생성
		Thread first = new Thread(t1, "first1");
		// 두번째 쓰레드 생성
		Thread second = new Thread(t1, "second1");

		// 세번째 쓰레드 생성
		Thread third = new Thread(t1, "third1");
		
		// 쓰레드의 우선순위를 출력하는 부분
		// 프로그램에서 우선순위를 지정하지 않으면 우선순위가 5로 출력됨
		// 최고순위 (MAX_PRIORITY : 10)
		// 순위 미지정 (NORM_PRIORITY : 5)
		// 최저순위(MIN_PRIORITY : 1)
		
		System.out.println("Thread의 우선순위를 출력하는 부분");
		System.out.println("first priority =\t " + first.getPriority());
		System.out.println("second priority =\t " + second.getPriority());
		System.out.println("third priority =\t " + third.getPriority());
		
		first.start();
		second.start();
		third.start();

	}
}
