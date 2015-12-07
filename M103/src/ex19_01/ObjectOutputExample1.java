package ex19_01;

// ObjectOutputStream 클래스를 이용하여 객체를 파일에 저장하는 예
import java.io.*;
import java.util.GregorianCalendar;

public class ObjectOutputExample1 {
	public static void main(String args[]) {
		ObjectOutputStream out = null;
		try {
			// 파일을 엽니다.
			// ObjectOutputStream 클래서는 객체를 스트림으로 만들어서 출력하는 기능이 있는 클래스
			// 이클래스에는 데이터를 파일로 저장하는 기능이 없기 때문에 fileOutputStream 클래스와 함께 이용해야 한다.
			// fileOutputStream 객체를 생성해서 ObjectOutputStream클래스의 생성자 파라미터로 넘겨주어야
			// 한다.

			out = new ObjectOutputStream(new FileOutputStream("output.dat"));
			// 객체를 직렬화하는 부분
			// writeObject 메소드 : 파리미터로 넘겨준 객체를 스트림으로 만들어서 출력하는 메소드
			// 파라미터로 넘겨진 객체가 파일에 저장합니다.
			// GregorianCalendar객체를 생성해서 파일에 엽니다.
			out.writeObject(new GregorianCalendar(2006, 0, 14));
			out.writeObject(new GregorianCalendar(2006, 0, 15));
			out.writeObject(new GregorianCalendar(2006, 0, 16));

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
