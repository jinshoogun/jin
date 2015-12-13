package ex18_03;
//DataOutputStream 클래스의 사용예
//DataOutputStream 클래스는 기본형 데이터를 바이트 스트링으로 만들어 출력하는 기능의 클래스이다.
//이 클래스는 파일에 데이터를 쓰는 기능이 없ㄱ ㅣ때문에 FileOutPutStream과 함께 사용해야 기본형 데이터를 파일에 쓸 수 있다.

import java.io.*;

public class DataInputExample1 {
	public static void main(String args[]) {
		DataInputStream in = null;
		try {
			in = new DataInputStream(new FileInputStream("output.dat"));// 파일 엶.
			// public DataInputStream(InputStream in)
			
			// 파일로부터 정수를 읽어서 출력합니다.
			while (true) {
				int data = in.readInt(); // 데이터를 읽다가 파일 끝을 만나면 EOFException
				System.out.println(data);
			}

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
