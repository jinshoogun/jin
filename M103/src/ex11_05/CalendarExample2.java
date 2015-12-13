package ex11_05;
//생성자 파라미터에 시스템 시계가 아니라 주어진 날짜와 시간을 넘겨주는 예
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

		String sAmPm = amPm == Calendar.AM ? "오전" : "오후";

		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초", year, month, date, sAmPm, hour, min, sec);
		// printf를 사용할 때 주의점은 갯수를 맞추고, d는 정수형, s 문자열 (String)
	}

}
