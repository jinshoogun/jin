package ex11_05;

// SimpleDateFormatŬ������ ����Ͽ� �� ��¥ ���̸� ���ϴ� ���α׷�
// String -> Date ������ ��ȯ
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample3 {
	public static void main(String args[]) {
		String start = "2015-09-01";
		String end = "2015-10-01";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
//try catch�� �����ϸ� ������....
		try {
			Date beginDate = dateFormat.parse(start);
			// String�� Date�� ��ȯ
			// parse�� 1970/1/1/0/0 ���ĺ��� ������ ��¥�� �и��� ������ �����̵ȴ�.
			Date endDate = dateFormat.parse(end);

			long diff = endDate.getTime() - beginDate.getTime();
			long diffDays = diff / (24 * 60 * 60 * 1000); 
			// 24�ð� 60�� 60�� 1000�и��� = 1��

			System.out.println("��¥ ���� = " + diffDays);

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
