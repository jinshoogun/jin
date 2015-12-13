package ex11_06;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateFormatExample5 {
	public static void main(String args[]){
		GregorianCalendar calendar = new GregorianCalendar();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		
		// 미국, 뉴욕의 TimeZone객체를 가지고 setTimeZone메소드를 호출함.
		dateFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		String str = dateFormat.format(calendar.getTime());
		
		// 아시아, 홍콩의 TimeZone객체를 가지고 setTimeZone메소드를 호출함.
		dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Hong_Kong"));
		String str1 = dateFormat.format(calendar.getTime());
		
		// 유럽, 파리의 TimeZone객체를 가지고 setTimeZone메소드를 호출함.
		dateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
		String str2 = dateFormat.format(calendar.getTime());
		
		System.out.println("뉴옥의 시간 : " + str);
		System.out.println("홍콩의 시간 : " + str1);
		System.out.println("파리의 시간 : " + str2);
	}

}
