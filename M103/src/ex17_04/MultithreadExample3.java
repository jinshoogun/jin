package ex17_04;

public class MultithreadExample3 {
	public static void main(String args[]) {
		// Runnable 인터페이스를 구현하는 클래스의 객체를 생성하여 Thread 생성자의 파라미터를 사용한다.
		Thread thread = new Thread(new SmallLetters()); // 쓰레드 생성
		thread.start();

		char arr[] = { 'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅅ', 'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅠ', 'ㅎ' };

		for (char ch : arr)
			System.out.println(ch);
	}

}
