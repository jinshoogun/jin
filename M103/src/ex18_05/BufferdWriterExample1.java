package ex18_05;

import java.io.*;

public class BufferdWriterExample1 {
	public static void main(String args[]) {
		BufferedWriter writer = null;
		try {

			writer = new BufferedWriter(new FileWriter("output.txt"));

			char arr[] = { '내', '꺼', '인', ' ', '듯', ' ', '내', '꺼', ' ', '아', '닌', ' ', '같', '은', ' ', '너' };

			for (int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);

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
