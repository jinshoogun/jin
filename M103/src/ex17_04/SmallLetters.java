package ex17_04;
//Runnable �������̽��� �̿��� ��Ƽ ������ ���α׷�
public class SmallLetters implements Runnable{
	public void run(){
		for (char ch=  'A'; ch <= 'Z'; ch++){
			System.out.println(ch);
		}
	}

}
