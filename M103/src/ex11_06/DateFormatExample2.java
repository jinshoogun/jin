package ex11_06;


// SimpleDateFormat 클래스를 사용하여 날짜와 시간을 포맷하는 프로그램
// SimpleDateFormat 클래스의 format() 메소드의 매개변수로 Date형 필요
// Calendar의 getTime() 메소드를 이용하여 Date형 리턴값을 얻음.
// Calendar-> Date형
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

class DateFormatExample2 {
	public static void main(String args[]) {
		GregorianCalendar calendar = new GregorianCalendar();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 aa HH시 mm분 ss초");
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy년 M월 d일 a h시 m분 s초");
		SimpleDateFormat dateFormat3 = new SimpleDateFormat("yyyy년 M월 d일 E a h시 m분 s초");
		
		String str = dateFormat.format(calendar.getTime());
		//calendar.getTime()의 리턴형은 Date형
		System.out.println(str);
		
		String str2 = dateFormat2.format(calendar.getTime());
		System.out.println(str2);
		
		String str3 = dateFormat3.format(calendar.getTime());
		System.out.println(str3);
		
		Date changeDate = calendar.getTime();
		System.out.println(changeDate);

	}

}
