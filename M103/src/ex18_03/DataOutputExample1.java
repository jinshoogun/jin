package ex18_03;
//DataOutputStream 클래스의 사용예

//DataOutputStream 클래스는 기본형 데이터를 바이트 스트링으로 만들어 출력하는 기능의 클래스이다.
//이 클래스는 파일에 데이터를 쓰는 기능이 없ㄱ ㅣ때문에 FileOutPutStream과 함께 사용해야 기본형 데이터를 파일에 쓸 수 있다.

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputExample1 {
	public static void main(String args[]) {
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(new FileOutputStream("output.dat"));// 파일
																			// 열음.
			// java.io.DataOutputStream.DataOutputStream(OutputStream arg0)

			int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			for (int cnt = 0; cnt < arr.length; cnt++)
				out.writeInt(arr[cnt]); // 파일에 int 타입테이터를 씁니다.

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
