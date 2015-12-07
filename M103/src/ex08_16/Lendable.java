package ex08_16;

public interface Lendable {
	final static byte STATE_BORROWED = 1; // 대출중
	final static byte STATE_NORMAL = 0; // 대출되지 않는 상태

	abstract void checkOut(String borrow, String date);

	abstract void checkIn();
}
