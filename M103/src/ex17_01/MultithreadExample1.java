package ex17_01;
// ���ĺ��� ���ڸ� ���ÿ� ����ϴ� ��Ƽ ������ ���α׷�
public class MultithreadExample1 {
	public static void main(String args[]){
		Thread thread = new DigitThread(); //������ ����
		
		//������ ����
		thread.start();
		
		//start(); ���� run()�����մϴ�.
		// -star �޼ҵ�� java.lang.Thread Ŭ������ �޼ҵ�
		// Runnable ���� : ���� ������ Thread�� start�� �ϸ� Runnable ���°� ��.
		// ���� ������ ���� : start() �޼ҵ� ȣ���� ����
		// thread.run(); ��� ȣ���ϴ� ���� �ƴ�
		
		for (char ch = 'A'; ch <='Z'; ch++)
			System.out.print(ch);
		
		
		
	}

}
