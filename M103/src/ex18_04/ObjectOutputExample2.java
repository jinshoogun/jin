package ex18_04;

// StringTokenizer : 객체 직렬화 불가능한 클래스
import java.io.*;
import java.util.*;

public class ObjectOutputExample2 {
	public static void main(String args[]) {
		System.out.println("****프로그램 시작 *****");
		ObjectOutputStream out = null;
		try {
			FileOutputStream Fileout = new FileOutputStream("output.dat");
			out = new ObjectOutputStream(Fileout);
			System.out.println("파일을 열였습니다.");
			
			// 파일로 객체를 출력하였습니다.
		
			out.writeObject(new StringTokenizer("| |", "|"));
			System.out.println("파일로 StringTokenizer 객체를 출력합니다.");

		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");

		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수가 없습니다.");
			
		} finally {
			try {
				out.close(); // 파일 종료
				System.out.println("파일을 닫았습니다.");
			} catch (Exception e) { // close메소드가 발생하는 예외처리
			}
		}
	}
}
