package ex18_08;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//file 클래스를 이용하여 임시파일을 생성하는 방법
public class FileExample2 {
	public static void main(String args[]){
		FileWriter writer = null;
		try {
			//createTempFile() : 임시파일 생성 메소드 (정적 메소드)
			//createNewFile() : 파일생성 메소드
			//delete() : 파일을 삭제하는 메소드
			//mkdir() : 디렉토리 생성
			
			
			//new File("C:\\K") : K폴더를 만든 뒤 실행합니다.
			//Tmp로 시작하고 txt로 끝나는 임시파일을 C:\K 디렉토리에 생성합니다.
			File file = File.createTempFile("tmp", "txt", new File("C:\\K"));
			
			//java.io.FilterWriter(File arg0) throws IOException
			writer = new FileWriter(file); //FileWriter 생성자를 이용해서 File을 엽니다.
			writer.write('자');
			writer.write('바');
			writer.write('!');
			writer.write('~');
			
		} catch(IOException ioe) {
			System.out.println("임시파일에 쓸수 없습니다.");
			
		} finally {
			try {
				writer.close();
			} catch (Exception e){
				
			}
		}
		
	}

}
