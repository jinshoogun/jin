package test.action;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;

public class HelloAction {
	private File save; //���� 
	private String contentType;
	private String fileName;

	public String execute() { // �ڹ��� main �޼ҿ�������
		// test �޼ҿ��带 ȣ���ϰ� ���� ���? web.xml action name="hello"
		// class="test.action.HelloAction" method ="test">�� �߰� �۾� �ǽ��ϸ� �˴ϴ�.
		File copyFile = new File("c:\\test\\" + fileName); //������
		try {
			FileUtils.copyFile(save, copyFile); // test���Ϸ� ������ ����
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "success"; // return�� �־�� �ǰ� �⺻�� success�� �Ǿ�� �մϴ�.
		// ��ΰ� ���ۼ� struts.xml���� �ۼ�
		// return �̸��� �ٲٰ� ���� ���? web.xml <result name = "ok">�� �߰� �۾� �ǽ��ϸ� �˴ϴ�.
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
