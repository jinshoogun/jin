package ex19_05;

// Object는 java.io.Serializble 인터페이스를 구현하지 않기 때문에 직렬화 가능 클래스가 아닙니다.
// writeObject 메소드가 IOExcept 발생합니다.
// 해결 방법 : 필드 값의 타입 변경 (Object - > String)

import java.io.*;

public class ObjectOutputExample4 {
	public static void main(String args[]) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output4.dat"));
		
			BBSItem obj = new BBSItem("이석영", "moonlight", "자료 파일입니다.", "첨부파일을 참고하십시오");
			
			obj.addAttachment(new Object());
			//obj.addAttachment("모카자바 500g 1550원");
			System.out.println("전체게시물 수 : " + obj.itemNum);
			System.out.println("글쓴이 : " + obj.writer);
			System.out.println("패스워드 : " + obj.passwd);
			System.out.println("제목 : " + obj.title);
			System.out.println("내용 : " + obj.content);
			System.out.println("첨부 : " + obj.addAttachment);
			out.writeObject(obj); //writeObject 메소드가 IOException 발생
			// 직렬화 대상 필드 중에 하나가 직렬화 할 수 없는 타입의 필드가 있으면 예외처리가 발생해서 객체 전체가 직렬화되지 않게 됩니다.

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
