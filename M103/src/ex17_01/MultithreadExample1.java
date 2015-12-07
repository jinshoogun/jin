package ex17_01;
// 알파벳과 숫자를 동시에 출력하는 멀티 스레드 프로그램
public class MultithreadExample1 {
	public static void main(String args[]){
		Thread thread = new DigitThread(); //쓰레드 생성
		
		//스레드 실행
		thread.start();
		
		//start(); 통해 run()실행합니다.
		// -star 메소드는 java.lang.Thread 클래스의 메소드
		// Runnable 상태 : 새로 생성한 Thread를 start를 하면 Runnable 상태가 됨.
		// 실행 가능한 상태 : start() 메소드 호출한 상태
		// thread.run(); 라고 호출하는 것이 아님
		
		for (char ch = 'A'; ch <='Z'; ch++)
			System.out.print(ch);
		
		
		
	}

}
