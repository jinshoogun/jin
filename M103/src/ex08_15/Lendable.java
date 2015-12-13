package ex08_15;

interface Lendable {
	abstract void checkOut(String borrower, String date); // 대출한다.

	abstract void checkIn(); // 반납한다.

}
