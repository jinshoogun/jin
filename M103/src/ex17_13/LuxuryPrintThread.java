package ex17_13;
//���̸� �߻ڰ� ����ϴ� Ŭ����
public class LuxuryPrintThread extends Thread {
	SharedArea sharedArea;
	public void run(){
		if (sharedArea.isReady != true){
			try{
				synchronized (sharedArea) {
					sharedArea.wait(); // �ٸ� ������κ��� ��ȣ�� ��ٸ��ϴ�.
				}
			} catch (InterruptedException e){ 
			System.out.println(e.getMessage());
			}
		}
		System.out.println("*** �� = "+ sharedArea.result + " ***");
	}
}
