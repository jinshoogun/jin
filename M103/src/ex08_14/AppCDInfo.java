package ex08_14;

public class AppCDInfo extends CDInfo implements Lendable {
	// �ΰ��� ���ÿ��� ù��°�� ��Ӱ����ۼ��ϰ� �ι�°�� �������̽� ���
	String borrower;
	String checkOutDate;
	byte state;

	AppCDInfo(String reigsterNo, String title) {
		super(reigsterNo, title);

	}

	public void checkOut(String borrower, String date) {
		if (state != 0)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*" + title + "��(��) �����Ͽ����ϴ�.");
		System.out.println("������ : " + borrower);
		System.out.println("������ : " + date + "\n");
	}

	public void checkIn() { // �ݳ��Ѵ�
		this.borrower = null;
		this.checkOutDate = null;
		;
		this.state = 0; // �ݳ����� state = 0
		System.out.println("*" + title + "��(��) �ݳ��Ͽ����ϴ�.");
	}
}
