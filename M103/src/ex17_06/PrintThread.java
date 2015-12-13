package ex17_06;

public class PrintThread extends Thread {
	SharedArea sharedArea;
	public void run(){
		System.out.println(sharedArea.result); // 공유영역의 데이터를 출력함
	}

}
