package DateFormatExample5;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateFormatExample6 {
	public static void main(String args[]) {
		GregorianCalendar calendar = new GregorianCalendar();
		printDateTime(calendar, "���� ", "America/New_York");
		printDateTime(calendar, "ȫ�� ", "Asia/Hong_Kong");
		printDateTime(calendar, "�ĸ� ", "Europe/Paris");
	}

	static void printDateTime(GregorianCalendar calendar, String location, String timeZone) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd (E) aa hh:mm");

		dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
		String str = dateFormat.format(calendar.getTime());

		System.out.println(location + str);
	}
}
