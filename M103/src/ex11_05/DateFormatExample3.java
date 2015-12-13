package ex11_05;

// SimpleDateFormat클래스를 사용하여 두 날짜 차이를 구하는 프로그램
// String -> Date 형으로 변환
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample3 {
	public static void main(String args[]) {
		String start = "2015-09-01";
		String end = "2015-10-01";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
//try catch로 사용안하면 에러가....
		try {
			Date beginDate = dateFormat.parse(start);
			// String을 Date로 변환
			// parse는 1970/1/1/0/0 이후부터 지정된 날짜와 밀리초 갯수로 리턴이된다.
			Date endDate = dateFormat.parse(end);

			long diff = endDate.getTime() - beginDate.getTime();
			long diffDays = diff / (24 * 60 * 60 * 1000); 
			// 24시간 60분 60초 1000밀리초 = 1일

			System.out.println("날짜 차이 = " + diffDays);

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
