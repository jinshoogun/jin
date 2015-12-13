package ex17_14;
//���̸� ����ϴ� Ŭ����
public class PrintThread extends Thread {
	SharedArea sharedArea;
	public void run(){
		if (sharedArea.isReady != true){
			try{
				synchronized (sharedArea) {
					sharedArea.wait();
				}
			} catch (InterruptedException e){
			System.out.println(e.getMessage());
			}
		}
		System.out.println(sharedArea.result);
	}
}
