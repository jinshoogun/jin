package ex17_12;
//���̸� ����ϴ� Ŭ����
public class PrintThread extends Thread {
	SharedArea sharedArea;
	public void run(){
		if (sharedArea.isReady != true){
			try{
				synchronized (sharedArea) {
					sharedArea.wait(); // �ٸ� ������κ��� ��ȣ�� ��ٸ��ϴ�.
				}
			} catch (InterruptedException e){ //wait �޼ҵ尡 �߻��ϴ� �μ��� ó��
			System.out.println(e.getMessage());
			}
		}
		System.out.println(sharedArea.result);
	}
}
