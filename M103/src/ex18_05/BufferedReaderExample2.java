package ex18_05;

import java.io.*;


//한꺼번에 여러문자를 읽는 Read 메소드 예
public class BufferedReaderExample2 {
	public static void main(String args[]) {
		BufferedReader reader = null;
		char arr[] = new char [64];
		try {
			reader = new BufferedReader(new FileReader("output.txt"));
			reader.read(arr); //파일에 있는 문자를 담을 char 배열
			
			System.out.println(String.valueOf(arr).trim()); //trim() : 공백제거 
			//public static String valueof(char[] date)
		
		} catch (FileNotFoundException fnfe) { 
			System.out.println("파일이 존재하지 않습니다.");
			
		} catch (IOException ioe) { // Exception - IOException
			System.out.println("파일을 읽을 수가 없습니다.");
			
		} catch (NullPointerException n ) { 
			// Exception - RuntimeException - NullPointerException 예외처리할때 작성해야 될 순서!
			System.out.println("NullPointerException 예외 발생");	

		} finally { // 파일을 닫는 명령문을 에러와 상관없이 처리하기 위해서 finally 블록에 사용함.
			try{
				reader.close();
	
			} catch(Exception e){ //close메소드가 발생하는 예외처리
				// IOException과 NullPointerException처리하기 위한 
			}
		}
	}
}
