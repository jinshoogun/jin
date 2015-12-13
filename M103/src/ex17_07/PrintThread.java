package ex17_07;

public class PrintThread extends Thread {
	SharedArea sharedArea;
	public void run(){
		while(sharedArea.isReady != true){
			System.out.println("실행중");
			continue;
		}
		System.out.println(sharedArea.result); // 공유영역의 데이터를 출력함
		
	}

}
