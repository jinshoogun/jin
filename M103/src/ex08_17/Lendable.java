package ex08_17;

public interface Lendable {
	abstract void checkOut(String borrow, String date) throws Exception;
	abstract void checkIn();
}
