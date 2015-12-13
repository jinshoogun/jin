package ex11_06;
//SimpleDateFormat 클래스를 사용하여
//String -> Date형으로 변환
// Date -> String 형으로 변환기

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample4 {
	public static void main(String args[]){
		String from = "2015-10-08 10:10:10";
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		try{
			Date changeDate = transFormat.parse(from);
			//String -> Date으로 변경하기 (참고로 예외처리 되어있기 때문에 throws Exception 적을 필요 없으뮤)
			System.out.println(changeDate);
			
		} catch (ParseException e){ 
			e.printStackTrace();
		}
		//String -> Date형으로 변환하기
		Date from2 = new Date();
		SimpleDateFormat transFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String to = transFormat2.format(from2);
		System.out.println(to);
	}

}
