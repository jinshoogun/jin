package ex18_02;
//FileOutputStream 클래스를 이용하여 바이트 데이터를 파일에 쓰는 프로그램
//Output.dat를 열어서 확인해보기 - 파일내용은 문자 데이터가 아니기 때문에 내용을 확인 할 수 없다.
//write 메소드는 파라미터를 바이트 데이터로 취급합니다.
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutPutStreamExample1 {
	public static void main(String args[]) {
		FileOutputStream out = null;
		try {
			
			out = new FileOutputStream("output.dat"); // 파일을 엽니다.
			byte arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

			// 파일에 반복해서 byte타입 데이터를 씁니다.
			for (int cnt = 0; cnt < arr.length; cnt++)
				out.write(arr[cnt]);
			// 위 두문장고 같은 의미
			// writer.write(arr);
		} catch (IOException ioe) {
			System.out.println("파일을 출력할 수 없습니다.");

		} finally {
			try {
				out.close(); // 파일을 닫습니다.
			} catch (Exception e) {

			}
		}
	}
}
