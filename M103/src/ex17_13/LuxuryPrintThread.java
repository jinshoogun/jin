package ex17_13;
//파이를 야쁘게 출력하는 클래스
public class LuxuryPrintThread extends Thread {
	SharedArea sharedArea;
	public void run(){
		if (sharedArea.isReady != true){
			try{
				synchronized (sharedArea) {
					sharedArea.wait(); // 다른 쓰레드로부터 신호를 기다립니다.
				}
			} catch (InterruptedException e){ 
			System.out.println(e.getMessage());
			}
		}
		System.out.println("*** π = "+ sharedArea.result + " ***");
	}
}
