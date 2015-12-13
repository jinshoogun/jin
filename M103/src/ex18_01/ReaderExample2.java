package ex18_01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//텍스트 파일을 읽는 프로그램 - 에러 발생
// 해결법 - try - catch문이나  throws Exception을 처리
public class ReaderExample2 {
	public static void main(String args[]) {
		try {
			// fileReader 클래스 안에는 텍스트 파일 (사람이 읽을 수 있는 문자로만 구성된 파일)로부터
			// 데이터를 읽기 위해서는 파일을 열고, 데이터를 읽고, 파일을 닫는 세가지 작업에 필요한 기능들이 모두 들어있습니다.
			// fileReader 생성자를 통해서 파일을 엽니다.
			// FileReader 생성자는 FileNotFoundException 발생 예외처리해주어야 합니다
			// java.io.FileReader.FileReader (String filename) throws Exception

			FileReader reader = new FileReader("poem.txt");
			// C:\workspace\프로젝트명\poem.txt (상대경로를 축약한 내용이다.)
			// 절대 경로 C:\\workspace\\프로젝트명\\poem.txt (상대경로 \ 하나 사용)
			// FileReader reader = new FileReader("F:\\T110E5\\M103\\poem.txt");
			// (절대경로 \\두개 들어간게 차이!)
			// 문자 '\'는 다른 문자와 더해져서 특수한 기능을 수행하는 문자로 자기자신을 나타내고자 할 때는 사용한다.
			// 하나만 사용하면 에러가 발생한다.
			// \n'은 두개의 문자로 이루어져있지만 하나의 문자로 취급된다.
			// '\n'은 커서를 다음 줄 맨 앞으로 옮겨주는 역할을 하는 문자이고, 이와 같은 문자들을 Escape문자라고 한다.

			// === Escope 문자 ===
			// \n - 개행문자
			// \t - 탭키를 누른 것 처음 여러칸을 띄움
			// \ - '\'을 나타낸다.
			// \" - 큰따움표(")를 나타낸다.

			while (true) {
				// int java.io.
				int data = reader.read();
				if (data == -1) // 더이상 읽을 데이터가 없는 경우
					break;
				
				char ch = (char) data;
				System.out.print(ch);
			}
			// void java.io.InputStreamReader.close() throws IOException
			// IOExceptin 발생 - 예외처리를 해줘야 한다.
			reader.close(); // 에러 발생시 파일이 열려있는 채로 프로그램이 끝난다. 수정요
		} catch (FileNotFoundException fnfe) { // 읽고자 하는 파일이 없을때 발생하는 예외처리
			// FileReader 생성자가 발생하는 예외처리
			System.out.println("파일이 존재하지 않습니다.");
			
		} catch (IOException ioe) { // 입출력에 관한 일반적인 오류(ex 하드디스크의 오류)
			// FileReader의 read,close 메소드가 발생하는 예외처리
			System.out.println("파일을 읽을 수가 없습니다.");

		}
	}
}
