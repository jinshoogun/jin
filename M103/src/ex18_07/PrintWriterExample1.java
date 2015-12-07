package ex18_07;

import java.io.*;
import java.util.GregorianCalendar;

public class PrintWriterExample1 {
	public static void main(String args[]) {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("output.txt"); // 파일 실행
			writer.println("        ***성적표***          ");

			// 데이터 포맷해서 출력합니다.
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "김지영", 92, 87, 95, 91.3f);
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "박현식", 100, 90, 88, 92.7f);
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "최민재", 75, 88, 85, 82.7f);
			writer.printf("작성일자 : %1$tY년 %1$tm월 %1$td일 %1$tH시 %1$tm분 ", new GregorianCalendar());

		} catch (IOException ioe) {
			System.out.print("파일을 출력할 수 없습니다.");
			
		} finally {
			try {
				writer.close();
			} catch (Exception e) {

			}
		}
	}
}
