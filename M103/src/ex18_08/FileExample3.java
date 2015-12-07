package ex18_08;

import java.io.*;

//file Ŭ������ �̿��Ͽ� ����,���� ���� �� ���� ����
public class FileExample3 {
	public static void main(String args[]) {

		// ���� ����
		File f2 = new File("C:\\newDirectory2");
		if (!f2.exists()) {
			System.out.println("���� ���� ���丮 �̸� : " + f2.getPath());
			f2.mkdir();
		} else {
			System.out.println("�̹� �ִ� ���丮 �̸� : " + f2.getPath());
		}

		// ���� ��ü ���� - �̸� ������ ����� ���� �����ϱ�
		File f = new File("C:\\newDirectory2\\newFile.txt");

		if (f.exists()) {
			System.out.println(f.getPath() + "��ο� " + f.getName() + "������ �ֽ��ϴ�.");

		} else {
			try {
				// IOException �߻�
				// boolean java.io.File.createNewFile() throws Exception
				if (f.createNewFile()) { // ���� ����
					System.out.println(f.getPath() + "�� ���ο� ������ ����������ϴ�.");
				}
			} catch (IOException e) {
				System.out.println("IOException �߻��Ͽ����ϴ�.");
			}
		} 
		
		// ���� Ȥ�� ���丮 ����
	    File f3 = new File("C:\\K\\newFile.txt");
	    if (f3.exists()){
	    	System.out.println(f3.getPath() + "�����Ͽ����ϴ�.");
	    	f3.delete();
	    } else 
	    	System.out.println(f3.getPath() + "��  �����ϰ��� �ϴ� ������ �����ϴ�.");
	    
	    //���� �Ǵ� ���� �̸� ����
	    File src = new File ("C:\\newDirectory2\\newFile.txt");
	    File dest = new File ("C:\\newDirectory2\\dest.txt");
	    File dest2 = new File ("C:\\newDirectory2\\dest2.txt");
	    
	    if (src.exists()) { //C:\\newDirectory2\\newFile.txt�� ������ ��� ����
	    	src.renameTo(dest); //�̸� ����
	    	src.renameTo(dest2); //�̸� ����
	
	    }
	    if(f2.isDirectory()) {// ���丮�� ����� �����
	    	String dir[] = f2.list();
	    	System.out.println("\n \n Dir Content : ======================= \n");
	    	
	    	for (String dirs : dir) {
	    		System.out.println("dirs : " + dirs);
	    	}
	    	
	    }
}
}