package ex08_15;

public class SeparateVolume implements Lendable {
	String requestNo;
	String bookTitle;
	String writer;
	String borrower;
	String checkOutDate;
	byte state;

	SeparateVolume(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;

	}

	public void checkOut(String borrower, String date) { // ���� ���� state = 1
		if (state != 0)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*" + bookTitle + "��(��) �����Ͽ����ϴ�.");
		System.out.println("������ : " + borrower);
		System.out.println("������ : " + date + "\n");

	}

	public void checkIn() { // �ݳ��Ѵ�
		this.borrower = null; // String �⺻���̴� null �ۼ�
		this.checkOutDate = null; // String �⺻���̴� null �ۼ�
		;
		this.state = 0; // �ݳ����� state = 0
		System.out.println("*" + bookTitle + "��(��) �ݳ��Ͽ����ϴ�.");
	}
}

// �Ķ����� �������, ������ �Ű�����