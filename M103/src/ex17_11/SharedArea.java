package ex17_11;

// �������� Ŭ����
public class SharedArea {
	Account account1; // �̸��� ����
	Account account2; // ������ ����

	// ����ȭ ���1.
	// �޼��� ����{
	// synchronized (����ȭ�� ��ü �Ǵ� Ŭ������) {
	// �Ӱ迵�� �ڵ�
	// }
	// }
	//
	// ����ȭ ��� 2.�޼ҵ�ȿ� �ִ� ��ɹ� ��ü�� ����ȭ ����̰�, 
	// �׵���ȭ �ҷ��� this ��ü�� ���� ���� ���
	// synchronized �޼ҵ� ���� {
	// �Ӱ迵�� �ڵ�
	// }

	// ����ȭ �޼ҼҼҿ���
	synchronized void transfer(int amount) { // ������ü�� �Ѵ�.
			account1.withdraw(1000000);
			System.out.print("�̸��� ���� : 100���� ����, ");
			account2.deposit(1000000);
			System.out.println("������ ���� : 100���� �Ա�");
	}
	
	// ����ȭ �޼ҼҼҿ���
	synchronized int getTotal(){ //�ܾ� �հ踦 ���Ѵ�.
			return account1.balance + account2.balance;
	}
}
