package ex08_02;

public class Account {

		String accountNo; // ���¹�ȣ
		String ownerName; // �̸�
		int balance; // �ܾ�

		void deposit(int amount) { //����
			balance += amount;

		}

		int withdraw(int amount) throws Exception { //����
			if (balance < amount)
				throw new Exception("�ܾ��� �����մϴ�.");
			balance -= amount;
			return amount;
		}

	}


