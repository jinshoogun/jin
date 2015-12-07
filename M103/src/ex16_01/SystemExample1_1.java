package ex16_01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemExample1_1 {
	public static void main(String args[]){
		//System 클래스의 in필드를 가지고 InputStreamReader 객체를 생성한다.
		InputStreamReader reader = new InputStreamReader(System.in);
		
		//키보드로부터 한글짜식 입력받아서 출력하는 일을 마침표(,)가 입력될때까지 반복됩니다.
		try{
			while (true) {
				char  ch = (char) reader.read(); //한글자씩 입력받음
				//int ch = reader.read();
				// 아스키코드로 결과 나옴
//				사람.
//				입력된 문자 : 49324
//				입력된 문자 : 46988
//				입력된 문자 : 46
//				입력된 문자 : 13 (엔터)
//				입력된 문자 : 10 (엔터)
				System.out.println("입력된 문자 : "  + ch);
				if (ch == ',')
					break;
			}
		}
		catch(IOException e) {
			System.out.println("키보드 입력 에러");
			
		}
	}
}




