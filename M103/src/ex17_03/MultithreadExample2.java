package ex17_03;
// ������ ������� ����Ǵ� ��Ƽ������ ���α׷�
public class MultithreadExample2 {
	public static void main(String args[]){
		// ������ �����带 �����ؼ� �����մϴ�.
		Thread thread1 = new DigitThread();
		Thread thread2 = new DigitThread();
		Thread thread3 = new AlphabetThread();
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
