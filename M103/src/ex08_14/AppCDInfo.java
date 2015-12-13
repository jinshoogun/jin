package ex08_14;

public class AppCDInfo extends CDInfo implements Lendable {
	// 두개를 사용시에는 첫번째는 상속관계작성하고 두번째에 인터페이스 사용
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
		System.out.println("*" + title + "이(가) 대출하였습니다.");
		System.out.println("대출인 : " + borrower);
		System.out.println("대출일 : " + date + "\n");
	}

	public void checkIn() { // 반납한다
		this.borrower = null;
		this.checkOutDate = null;
		;
		this.state = 0; // 반납상태 state = 0
		System.out.println("*" + title + "이(가) 반납하였습니다.");
	}
}
