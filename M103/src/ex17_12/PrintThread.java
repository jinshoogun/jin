package ex17_12;
//파이를 출력하는 클래스
public class PrintThread extends Thread {
	SharedArea sharedArea;
	public void run(){
		if (sharedArea.isReady != true){
			try{
				synchronized (sharedArea) {
					sharedArea.wait(); // 다른 쓰레드로부터 신호를 기다립니다.
				}
			} catch (InterruptedException e){ //wait 메소드가 발생하는 인셉션 처리
			System.out.println(e.getMessage());
			}
		}
		System.out.println(sharedArea.result);
	}
}
