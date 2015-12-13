package ex12_01;

import java.io.FileReader;
import java.io.IOException;

//printStackTrace메소드 사용예

public class ExceptionExample8 {
	public static void main(String args[]) {
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();
		} catch (IOException e) {
			String str = e.getMessage();
			System.err.println(str);
		}
	}
}