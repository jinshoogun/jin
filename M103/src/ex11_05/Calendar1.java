package ex11_05;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar1 {
	public static void main(String args[]) {
		String[] day = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = new GregorianCalendar();
		int y = c1.get(Calendar.YEAR);
		int m = c1.get(Calendar.MONTH) + 1;
		int d = c1.get(Calendar.DATE);
		int h = c1.get(Calendar.HOUR_OF_DAY);
		int h1 = c1.get(Calendar.HOUR);
		int ap = c1.get(Calendar.AM_PM);
		int mm = c1.get(Calendar.MINUTE);
		int s = c1.get(Calendar.SECOND);
		int day1 = c1.get(Calendar.DAY_OF_WEEK);

		System.out.print(y + "년 " + m + "월 " + d + "일 ");
		if (ap == 0) {
			System.out.print("오전 ");
		} else {
			System.out.print("오후 ");
		}
		System.out.print(h1 + ":" + mm + ":" + s + " ");
		System.out.println(day[day1 - 1] + "입니다.");

	}
}
