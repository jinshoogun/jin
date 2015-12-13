package ex18_03;
//DataOutputStream 클래스의  사용예 - 문자열 쓰기
// String 타입의 데이터를 쓰는 메소드 : writeUTF()
//String 타입 외의 다른 객체를 쓰는 기능은 없다.
//다른 타입의 객체를 쓸려면 ObjectOutPutStream 클래스를 사용해야 한다.

import java.io.*;

public class DataOutputExample2 {
	public static void main(String args[]) {
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(new FileOutputStream("output.dat"));// 파일 열음.


			out.writeUTF("즐거운 월요일입니다.");


		} catch (IOException ioe) { // Exception - IOException
			System.out.println("파일을 출력할 수가 없습니다.");

		} finally { // 파일을 닫는 명령문을 에러와 상관없이 처리하기 위해서 finally 블록에 사용함.
			try {
				out.close(); // 파일 종료

			} catch (Exception e) { // close메소드가 발생하는 예외처리
				// IOException과 NullPointerException처리하기 위한
			}
		}
	}
}
