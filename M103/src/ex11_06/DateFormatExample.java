package ex11_06;

import java.sql.Timestamp;   
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
	public static void main(String args[]) {
		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sd2 = new SimpleDateFormat("yyyy년 MM월 dd일"); //두개면 08로 표기 하나면 8로 표기

		Date d = new Date(); // 현재 시스템 날짜와 시각
		System.out.println(d);
		System.out.println(new Date());
		System.out.println(sd1.format(d)); // 년 월 일 형태로 출력
		System.out.println(sd2.format(d)); // 년 월 일 형태로 출력

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초 E요일");
		// E : 국가가 한국이라 한국어로 출력, 국가설정을 영어로 하면 영어로 출력

		// 시스템 밀리초 구하기 (국제표준시각 (UTC,GMT))
		// 1970/1/1/0/0/0으로 부터 경과된 시간
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		//위 두문장과 일치
		System.out.println(new Timestamp(System.currentTimeMillis()));
		                                 //레퍼런스 변수
		System.out.println(sdf.format(ts));

	}

}
