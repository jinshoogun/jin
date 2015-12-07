package ex19_05;

// Object는 java.io.Serializble 인터페이스를 구현하지 않기 때문에 직렬화 가능 클래스가 아닙니다.
// writeObject 메소드가 IOExcept 발생합니다.
// 해결 방법 : 필드 값의 타입 변경 (Object - > String)

import java.io.*;

public class ObjectOutputExample5 {
	public static void main(String args[]) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output4.dat"));
		
			BBSItem obj = new BBSItem("이석영", "moonlight", "자료 파일입니다.", "첨부파일을 참고하십시오");
			//addAttachment 메소드의 파라미터로 넘겨준 문자열은 attachment 필드에 대입되는 이 문자열의 타입인 String 클래슨느 직렬화
			//가능한 클래스이기 때문입니다. 
			
			obj.addAttachment("모카자바 500g 1550원");
			System.out.println("전체게시물 수 : " + obj.itemNum);
			System.out.println("글쓴이 : " + obj.writer);
			System.out.println("패스워드 : " + obj.passwd);
			System.out.println("제목 : " + obj.title);
			System.out.println("내용 : " + obj.content);
			System.out.println("첨부 : " + obj.addAttachment);
			out.writeObject(obj); //IOException 에러가 발생하지 않음

		} catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		} finally {
			try {
				out.close();

			} catch (Exception e) {//파일 종료

			}
		}
	}
}
