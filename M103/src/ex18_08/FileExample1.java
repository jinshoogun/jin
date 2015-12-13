package ex18_08;

import java.io.*;
import java.util.GregorianCalendar;

//현재 디렉토리의 서브디렉토리와 파일 목록을 출력하는 프로그램
// File 클래스 : 파일 관리기능을 갖는 클래스 (폴더 관리기능도 갖고 있음)
//%-25s : 25칸을 왼쪽으로 정렬
//%1$tF : YYYY-mm-dd 포맷의 날짜
//%1$tT : HH:MM:SS 포맷

public class FileExample1 {
	public static void main(String args[]){
		File file = new File(".");// 현재 폴더 경로명을 가지고  File 객체를 생성
		File arr[] = file.listFiles(); // 서브폴더와 파일 목록을 가져옴
		
		for (int cnt = 0; cnt < arr.length; cnt++){
			String name = arr[cnt].getName(); //이름 리턴
			if (arr[cnt].isFile()) // 파일이면 true 아니면 false
				System.out.printf("%-25s %7d \t", name, arr[cnt].length());
			    // arr[cnt].length() 파일의 크기 구하기
			
			else 
				System.out.printf("%-25s <DIR> \t", name);
			
			long time = arr[cnt].lastModified(); //최종 수정일시를 리턴
			
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTimeInMillis(time); //1970년 1월 1일 0시 0분 0초 기점으로 밀리세컨드 값을 구한다.
			System.out.printf ("%1$tF %1$tT \n", calendar);
		}
	}

}
