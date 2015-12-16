package test.action;

import java.io.FileInputStream;
import java.io.InputStream;

public class DownloadAction {
	private InputStream inputStream;
    private String fileName;
	public String execute() throws Exception {
		inputStream = new FileInputStream("c:\\test\\"+fileName);
		return "success";
	}

	public InputStream getInputStream() {
		return inputStream;
	}
	public void setFileName (String name){
		this.fileName = name;
	}
	public String getFileName(){
		return fileName;
	}
	
}
