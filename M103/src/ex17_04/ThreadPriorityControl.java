package ex17_04;

//스레드 순위를 부여하지 않는 것
public class ThreadPriorityControl implements Runnable {
	public void run() {
		for (int i =1; i <3; i++){
		// thread의 이름과 정수 출력
		System.out.println(Thread.currentThread().getName() + "number = " + i);
		}
	}

	public static void main(String args[]) {
		ThreadPriorityControl t1 = new ThreadPriorityControl();

		// 첫번째 쓰레드 생성 - 최저순위
		Thread first = new Thread(t1, "first1");
		first.setPriority(Thread.MIN_PRIORITY); //최저순위 지정
		System.out.println("first priority = " + first.getPriority());
		
		// 두번째 쓰레드 생성 - 최고순위
		Thread second = new Thread(t1, "second1");
		second.setPriority(Thread.MAX_PRIORITY); //최대 순위
		System.out.println("second priority = " + second.getPriority());
		
		// 세번째 쓰레드 생성 - 순위 미지정
		Thread third = new Thread(t1, "third1");
		System.out.println("third priority = " + third.getPriority());
		
		
		first.start();
		second.start();
		third.start();
		

	}
}
