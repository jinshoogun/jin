package ex18_02;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample1 {
	public static void main(String args[]) {
		FileWriter writer = null;
		try {
			// FileWriter 생성자 안에 파일을 여는 기능이 있습니다.
			writer = new FileWriter("output.txt"); // 파일을 엽니다.
			// public FileWriter(String fileName) throws IOException
			// FileWriter 생성자는 IOException에러를 발생하기 때문에 IOException 처리

			char arr[] = { '내', '꺼', '인', ' ', '듯', ' ', '내', '꺼', ' ', '아', '닌', ' ', '너' };

			// 파일에 반복해서 문자들을 씁니다.
			for (int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);
			// 위 두문장고 같은 의미
			// writer.write(arr);
		} catch (IOException ioe) {
			System.out.println("파일을 출력할 수 없습니다.");

		} finally {
			try {
				writer.close(); // 파일을 닫습니다.
			} catch (Exception e) {

			}
		}
	}
}
