package ex17_07;

public class PrintThread extends Thread {
	SharedArea sharedArea;
	public void run(){
		while(sharedArea.isReady != true){
			System.out.println("������");
			continue;
		}
		System.out.println(sharedArea.result); // ���������� �����͸� �����
		
	}

}
