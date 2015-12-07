package ex11_01;

public class StringExample9 {
	public static void main (String []args){
		String message = "Java program creates many objects.";
		// 메세지 길이 구함
		int len = message.length();
		// 글자수로 갯수를 구합니다. "가나다"의 길이는 3이다.
		// 배열크기는 배열이름 .length로 구합니다. 예) arr.length();
		// 문자열 갯수는 String.length()로 구합니다. 예)message.length();
		// 자료구조에서는 자료구조.size()로 갯수를 구한다. 예) li.size();
		
		System.out.println("총 글자수 = " + len); //len =34;
		System.out.println("====공백의 index 위치 찾기===");
		// message 중에서 ' '를 찾음
		
		for (int n = 0; n <len; n++){
			char c= message.charAt(n); // i번째 문자를 저장한다.
			if (c == ' '){
				System.out.println("index = " + n);
			}
		}// for end 
	}

}
