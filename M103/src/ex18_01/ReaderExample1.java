package ex18_01;

import java.io.FileReader;

// 텍스트 파일을 읽는 프로그램 - 에러 발생
// 해결법 - try - catch문이나  throws Exception을 처리
public class ReaderExample1 {
	public static void main (String args[]){
		FileReader reader = new FileReader("poem.txt");
		//C:\workspace\프로젝트명\poem.txt (상대경로를 축약한 내용이다.)
		// 절대 경로 C:\\workspace\\프로젝트명\\poem.txt (상대경로 \ 하나 사용)
		// FileReader reader = new FileReader("F:\\T110E5\\M103\\poem.txt"); (절대경로 \\두개 들어간게 차이!)
		//파일을 읽어서 처리하는 부분
		while(true) {
			//파일에 있는 문자 하나를 읽어서 리턴하는 메소드
			int data = reader.read();
			
			if (data ==-1) //더이상 읽을 데이터가 없는 경우
				break;
			
			char ch =  (char) data;
			System.out.println(ch);
		}
		reader.close(); //파일을 닫는다.
		
	}

}
