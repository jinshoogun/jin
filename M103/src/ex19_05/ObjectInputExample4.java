package ex19_05;

import java.io.*;

public class ObjectInputExample4 {
	public static void main(String args[]) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output3.dat"));

			while (true) {
				BBSItem obj = (BBSItem) in.readObject(); //객체를 역직렬화하는 부분
				System.out.println("전체게시물 수 : " + obj.itemNum); // 게시물의 수 - 정적필드는 직렬화 대상이 아님
				System.out.println("글쓴이 : " + obj.writer);
				System.out.println("패스워드 : " + obj.passwd); //transient 인스턴스 필드는 직렬화 대상이 아닙니다.
				System.out.println("제목 : " + obj.title);
				System.out.println("내용 : " + obj.content);
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");

		} catch (EOFException eofe) {// 파일로부터 더이상 읽을 객체가 없을때 발생하는 예외처리를 합니다.
			System.out.println("시마이.");

		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수가 없습니다.");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스가 존재하지 않습니다..");
			
		} finally {
			try {
				in.close(); // 파일 종료

			} catch (Exception e) { // close메소드가 발생하는 예외처리
			}
		}
	}
}
