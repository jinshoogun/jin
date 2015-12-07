package ex18_08;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//file Ŭ������ �̿��Ͽ� �ӽ������� �����ϴ� ���
public class FileExample2 {
	public static void main(String args[]){
		FileWriter writer = null;
		try {
			//createTempFile() : �ӽ����� ���� �޼ҵ� (���� �޼ҵ�)
			//createNewFile() : ���ϻ��� �޼ҵ�
			//delete() : ������ �����ϴ� �޼ҵ�
			//mkdir() : ���丮 ����
			
			
			//new File("C:\\K") : K������ ���� �� �����մϴ�.
			//Tmp�� �����ϰ� txt�� ������ �ӽ������� C:\K ���丮�� �����մϴ�.
			File file = File.createTempFile("tmp", "txt", new File("C:\\K"));
			
			//java.io.FilterWriter(File arg0) throws IOException
			writer = new FileWriter(file); //FileWriter �����ڸ� �̿��ؼ� File�� ���ϴ�.
			writer.write('��');
			writer.write('��');
			writer.write('!');
			writer.write('~');
			
		} catch(IOException ioe) {
			System.out.println("�ӽ����Ͽ� ���� �����ϴ�.");
			
		} finally {
			try {
				writer.close();
			} catch (Exception e){
				
			}
		}
		
	}

}
