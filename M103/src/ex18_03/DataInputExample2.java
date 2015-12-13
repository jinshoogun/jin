package ex18_03;
//DataOutputStream 클래스의  사용예 - 문자열 쓰기
//String 타입의 데이터를 쓰는 메소드 : writeUTF()
//String 타입 외의 다른 객체를 쓰는 기능은 없다.
//다른 타입의 객체를 쓸려면 ObjectOutPutStream 클래스를 사용해야 한다.

import java.io.*;

public class DataInputExample2 {
	public static void main(String args[]) {
		DataInputStream in = null;
		try {
			in = new DataInputStream(new FileInputStream("output.dat"));// 파일 엶.
	
			String data = in.readUTF(); 
				System.out.println(data);
			
		} catch (FileNotFoundException fnfe) { // readInt() 메소드에 의해 파일의 끝에 도달하면  이곳으로 이동
			System.out.println("파일이 존재하지 않습니다.");

		} catch (EOFException eofe) {
			System.out.println("시마이.");
			
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수가 없습니다.");

		} finally {
			try {
				in.close(); // 파일 종료

			} catch (Exception e) { // close메소드가 발생하는 예외처리
			}
		}
	}
}
