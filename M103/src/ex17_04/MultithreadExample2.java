package ex17_04;

//JVM�� �����忡 �Ҵ��ϴ� �ð��� ��������� �ϵ������ �����̳� �ý��� ȯ���̳� ���� �޶� �������� �Ź� �ٸ� ����� �߻��Ѵ�.
public class MultithreadExample2 {
	public static void main(String args[]) {
		ThreadLife t1 = new ThreadLife();

		// ù��° ������ ����
		Thread first = new Thread(t1, "first"); // ������ ����
		// ������ ���� : public Thread (Runnable target, String Name)
		// Name : the name of the new Thread

		// �ι�° ������ ����
		Thread second = new Thread(t1, "second");

		// ����° ������ ����
		Thread third = new Thread(t1, "third");
		first.start();
		second.start();
		third.start();

	}

}
