package ex17_06;

public class PrintThread extends Thread {
	SharedArea sharedArea;
	public void run(){
		System.out.println(sharedArea.result); // ���������� �����͸� �����
	}

}
