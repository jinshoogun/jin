package ex08_16;

public interface Lendable {
	final static byte STATE_BORROWED = 1; // ������
	final static byte STATE_NORMAL = 0; // ������� �ʴ� ����

	abstract void checkOut(String borrow, String date);

	abstract void checkIn();
}
