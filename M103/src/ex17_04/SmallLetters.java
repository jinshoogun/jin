package ex17_04;
//Runnable 인터페이스를 이용한 멀티 쓰레드 프로그램
public class SmallLetters implements Runnable{
	public void run(){
		for (char ch=  'A'; ch <= 'Z'; ch++){
			System.out.println(ch);
		}
	}

}
