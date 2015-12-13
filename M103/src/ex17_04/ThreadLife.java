package ex17_04;
//순서대로 출력되지 않음
public class ThreadLife implements Runnable {
	//오버라이딩 필수
	public void run(){
		for (int i =1; i <3; i++){//thread의 이름과 정수 출력
			System.out.println(Thread.currentThread().getName() + "number = " + 1);
			
		}
	}

	
}
