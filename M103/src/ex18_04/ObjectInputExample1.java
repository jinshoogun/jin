package ex18_04;
//ObjectInputStream 클래스를 이용하여 객체를 파일로부터 읽는 예
//GregorianCalendar는 직렬화 가능한 클래스 : java.io.Serializable 인터페이스를 구현하는 부분

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObjectInputExample1 {
	public static void main(String args[]) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output.dat"));
			// 파일 엽니다.
			// ObjectInputStream 클래스는 스트림 형태로 읽어들인 객체를 프로그램에서 사용할 수 있는 객체로 만드는
			// 기능의 클래스입니다.
			// 이 클래스는 fileInputStream 클래스와 함께 사용하면 파일에 저장된 객체를 프로그램에서 다시 읽어서 사용할
			// 수 있습니다.
			// fileInputStream 객체를 생성해서 ObjectInputStream 생성자 파라미터로 넘겨줘야 합니다.

			while (true) {

				// 객체를 역직렬화하는 부분
				// readObject 메소드 : 입력된 스트림으로 부터 객체를 만들어서 리턴하는 메소드. 리턴타입
				// (object)
				// 리턴타입 object를 원래 클래스 타입으로 사용하기 위해 캐스트 연산을 해야 합니다.
				// readObject()가 Object형이므로 GregorianCalendar타입으로 형변환해야 합니다.
				GregorianCalendar calendar = (GregorianCalendar) in.readObject();
				int year = calendar.get(Calendar.YEAR);
				int month = calendar.get(calendar.MONTH) + 1;
				int date = calendar.get(calendar.DATE);
				System.out.println(year + "/" + month + "/" + date);
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
