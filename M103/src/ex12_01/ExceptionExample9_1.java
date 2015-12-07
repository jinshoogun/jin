package ex12_01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//상속관계에  있는 두종류의 Exception을 처리하는 try
//catch문 예외처리 순서가 자식에서 부모순으로 지정
// FileNotFoundException -> IOException

public class ExceptionExample9_1 {
	public static void main(String args[]) {
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();
		} catch (FileNotFoundException e) { // 자식 예외처리 (순서를 부모 예외처리와 바꾸면 안됩니다.)
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) { // 부모 예외처리 (순서를 자식 예외처리와 바꾸면 안됩니다.)
			System.err.println("입출력 에러가 발생하였습니다..");
		}
	}
}