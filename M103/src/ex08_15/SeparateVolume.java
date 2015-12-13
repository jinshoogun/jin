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

	public void checkOut(String borrower, String date) { // 대출 상태 state = 1
		if (state != 0)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*" + bookTitle + "이(가) 대출하였습니다.");
		System.out.println("대출인 : " + borrower);
		System.out.println("대출일 : " + date + "\n");

	}

	public void checkIn() { // 반납한다
		this.borrower = null; // String 기본값이니 null 작성
		this.checkOutDate = null; // String 기본값이니 null 작성
		;
		this.state = 0; // 반납상태 state = 0
		System.out.println("*" + bookTitle + "이(가) 반납하였습니다.");
	}
}

// 파란색은 멤버변수, 갈색은 매개변수
