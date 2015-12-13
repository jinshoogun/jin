package ex18_06;
// 텍스트의 각행에 번호를 매기면서 읽는 클래스
//LineNumberWriter는 없음

import java.io.*;

public class LineNumberReaderExample2 {
	public static void main(String args[]) {
		LineNumberReader reader = null;
		try {
			reader = new LineNumberReader(new FileReader("poem.txt"));
			// 파일로부터 한행씩 읽어서 행번호와 함께 출력합니다.

			while (true) {
				String str = reader.readLine(); //파일로부터 한행씩 읽음
				if (str == null) // 더이상 읽을 데이터가 없는 경우
					break;
				
				int lineno = reader.getLineNumber();
				System.out.println(lineno + ": " + str);
			}
		} catch (FileNotFoundException fnfe) { 
			System.out.println("파일이 존재하지 않습니다.");
			
		} catch (IOException ioe) { 
			System.out.println("파일을 읽을 수가 없습니다.");

		} finally { 
			try{
				reader.close();
	
			} catch(Exception e){ 
			}
		}
	}
}
