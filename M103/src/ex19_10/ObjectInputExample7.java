package ex19_10;
// Rectangle 객체를 역직렬화하는 프로그램
import java.io.*;

public class ObjectInputExample7 {
	public static void main(String args[]) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output7.dat"));

			while (true) {
				Rectangle obj = (Rectangle) in.readObject();
				System.out.println("넓이 : " + obj.width);
				System.out.println("높이 : " + obj.height);
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");

		} catch (EOFException eofe) {// 파일로부터 더이상 읽을 객체가 없을때 발생하는 예외처리를 합니다.
			System.out.println("시마이.");

		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());

		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
			
		} finally {
			try {
				in.close(); // 파일 종료

			} catch (Exception e) { // close메소드가 발생하는 예외처리
			}
		}
	}
}
