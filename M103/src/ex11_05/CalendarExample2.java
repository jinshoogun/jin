package ex11_05;
//������ �Ķ���Ϳ� �ý��� �ð谡 �ƴ϶� �־��� ��¥�� �ð��� �Ѱ��ִ� ��
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample2 {
	public static void main(String args[]) {

		GregorianCalendar calendar = new GregorianCalendar(2002, 7, 1);
		//GregorianCalendar calendar = new GregorianCalendar(2002, 7, 1, 14, 30);
		//GregorianCalendar calendar = new GregorianCalendar(2002, 7, 1, 14, 30, 15);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int date = calendar.get(Calendar.DATE);
		int amPm = calendar.get(Calendar.AM_PM);
		int hour = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);

		String sAmPm = amPm == Calendar.AM ? "����" : "����";

		System.out.printf("%d�� %d�� %d�� %s %d�� %d�� %d��", year, month, date, sAmPm, hour, min, sec);
		// printf�� ����� �� �������� ������ ���߰�, d�� ������, s ���ڿ� (String)
	}

}
