package ex17_10;

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
	// ����ȭ ��� 2.
	// synchronized �޼ҵ� ���� {
	// �Ӱ迵�� �ڵ�
	// }

	void transfer(int amount) { // ������ü�� �Ѵ�.
		synchronized (this) {
			account1.withdraw(1000000);
			System.out.print("�̸��� ���� : 100���� ����, ");
			account2.deposit(1000000);
			System.out.println("������ ���� : 100���� �Ա�");
		}
	}

	int getTotal(){ //�ܾ� �հ踦 ���Ѵ�.
		synchronized (this) {
			return account1.balance + account2.balance;
		}
	}
}
