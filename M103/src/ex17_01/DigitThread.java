package ex17_01;
//java.lang.Thread 클래스와 이클래스의 서브클래스를 Thread 클래스라고 함.
//스레드가 할일을 run 메소드안에 작성해야 한다.
//public void run()의 형식으로 작성

public class DigitThread extends Thread{
	// 오버라이딩 - 오버라이딩 안해도 에러 X
	// start 메소드에 의해 실행됨
	public void run(){
		for (int cnt = 0; cnt <10; cnt++)
			System.out.print(cnt);
	}

}
