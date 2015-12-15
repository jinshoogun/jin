package test.action;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;

public class HelloAction {
	private File save; //원본 
	private String contentType;
	private String fileName;

	public String execute() { // 자바의 main 메소오오오드
		// test 메소오드를 호출하고 싶을 경우? web.xml action name="hello"
		// class="test.action.HelloAction" method ="test">를 추가 작업 실시하면 됩니다.
		File copyFile = new File("c:\\test\\" + fileName); //저장경로
		try {
			FileUtils.copyFile(save, copyFile); // test파일로 파일을 복사
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "success"; // return을 넣어야 되고 기본값 success로 되어야 합니다.
		// 경로값 미작성 struts.xml에서 작성
		// return 이름을 바꾸고 싶을 경우? web.xml <result name = "ok">를 추가 작업 실시하면 됩니다.
	}

	public void setSave(File save) {
		this.save = save;
	}

	public void setSaveContentType(String contentType) {
		this.contentType = contentType;
	}

	public void setSaveFileName(String fileName) {
		this.fileName = fileName;
	}
}
