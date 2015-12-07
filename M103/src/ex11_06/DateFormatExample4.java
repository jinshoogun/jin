package ex11_06;
//SimpleDateFormat Ŭ������ ����Ͽ�
//String -> Date������ ��ȯ
// Date -> String ������ ��ȯ��

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
			//String -> Date���� �����ϱ� (����� ����ó�� �Ǿ��ֱ� ������ throws Exception ���� �ʿ� ������)
			System.out.println(changeDate);
			
		} catch (ParseException e){ 
			e.printStackTrace();
		}
		//String -> Date������ ��ȯ�ϱ�
		Date from2 = new Date();
		SimpleDateFormat transFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String to = transFormat2.format(from2);
		System.out.println(to);
	}

}
