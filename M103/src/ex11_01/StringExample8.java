package ex11_01;

public class StringExample8 {
	public static void main(String args[]){
		String message = "Java program creates many objects.";
		String message2 = "Java programaaaaaaa creates many objects.";			
		// index를 구하는 메소드, 여러개가 있는 경우 가장 먼저 나오는 index를 구한다.
		int index1 = message.indexOf('a');
		
		// 오버로딩 메소드, 아스키 코드 97은 소문자 'a'
		int index2 = message.indexOf(97);
		
		//아스크 코드 65는 대문자 'A'
		int index3 = message.indexOf(65);
		
		System.out.println("a의 위치는 " + index1);
		System.out.println("a의 위치는 " + index2);

		
		int index23 = message.indexOf(65);
		// 'A'가 없을때는 index 값이 -1을 변환한다.
		System.out.println("a의 위치는 " + index23);
		
		// index번호 13번째부터 a를 찾음
		int index33 = message2.indexOf('a', 13); // int형만 사용되나 indexOf는 char하면 자동으로 아스키코드값으로 변환됨.
		System.out.println("13번부터 a의 위치는 " + index33);
		
		//av로 시작하는 index 구하기
		int index4 = message.indexOf("av");
		System.out.println("av로 시작되는 index는 " + index4);
		
		//index 번호 12번째부터 man으로 시작되는 index 찾기
		int index5 = message.indexOf("man", 1);
		System.out.println("12번부터 man 위치는 " + index5);
		
		//java로 시작되는 index 구하기
		int index6 = message.indexOf("java");
		System.out.println("Java의 위치는 " + index6);
	}

}
