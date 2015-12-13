package ex08_16;

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
		if (state != STATE_NORMAL)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = STATE_BORROWED;
		System.out.println("*" + bookTitle + "��(��) �����Ͽ����ϴ�.");
		System.out.println("������ : " + borrower);
		System.out.println("������ : " + date + "\n");

	}

	public void checkIn() { // �ݳ��Ѵ�
		this.borrower = null; // String �⺻���̴� null �ۼ�
		this.checkOutDate = null; // String �⺻���̴� null �ۼ�
		;
		this.state = STATE_NORMAL; // �ݳ����� state = 0
		System.out.println("*" + bookTitle + "��(��) �ݳ��Ͽ����ϴ�.");
	}
}

// �Ķ����� �������, ������ �Ű�����
