package ex18_08;

import java.io.*;

//file 클래스를 이용하여 파일,폴더 생성 및 삭제 변경
public class FileExample3 {
	public static void main(String args[]) {

		// 폴더 생성
		File f2 = new File("C:\\newDirectory2");
		if (!f2.exists()) {
			System.out.println("새로 만든 디렉토리 이름 : " + f2.getPath());
			f2.mkdir();
		} else {
			System.out.println("이미 있는 디렉토리 이름 : " + f2.getPath());
		}

		// 파일 객체 생성 - 미리 폴더는 만들어 놓고 실행하기
		File f = new File("C:\\newDirectory2\\newFile.txt");

		if (f.exists()) {
			System.out.println(f.getPath() + "경로에 " + f.getName() + "파일이 있습니다.");

		} else {
			try {
				// IOException 발생
				// boolean java.io.File.createNewFile() throws Exception
				if (f.createNewFile()) { // 파일 생성
					System.out.println(f.getPath() + "에 새로운 파일이 만들어졌습니다.");
				}
			} catch (IOException e) {
				System.out.println("IOException 발생하였습니다.");
			}
		} 
		
		// 파일 혹은 디렉토리 삭제
	    File f3 = new File("C:\\K\\newFile.txt");
	    if (f3.exists()){
	    	System.out.println(f3.getPath() + "삭제하였습니다.");
	    	f3.delete();
	    } else 
	    	System.out.println(f3.getPath() + "에  삭제하고자 하는 파일이 없습니다.");
	    
	    //파일 또는 폴더 이름 변경
	    File src = new File ("C:\\newDirectory2\\newFile.txt");
	    File dest = new File ("C:\\newDirectory2\\dest.txt");
	    File dest2 = new File ("C:\\newDirectory2\\dest2.txt");
	    
	    if (src.exists()) { //C:\\newDirectory2\\newFile.txt이 존재할 경우 실행
	    	src.renameTo(dest); //이름 변경
	    	src.renameTo(dest2); //이름 변경
	
	    }
	    if(f2.isDirectory()) {// 디렉토리의 목록을 출력함
	    	String dir[] = f2.list();
	    	System.out.println("\n \n Dir Content : ======================= \n");
	    	
	    	for (String dirs : dir) {
	    		System.out.println("dirs : " + dirs);
	    	}
	    	
	    }
}
}