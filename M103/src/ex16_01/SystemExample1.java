package ex16_01;
// 키보드로부터 문자를 입력받는 프로그램
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemExample1 {
	public static void main(String args[]){
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			String str = reader.readLine();// 키보드로부터 한 줄을 입력받음
			System.out.println("입력된 문자열 : " + str);
			
		}catch(IOException e) {
			System.out.println("키보드 입력 에러");
		}
	}
}




