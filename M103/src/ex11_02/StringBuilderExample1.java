package ex11_02;

public class StringBuilderExample1 {
	public static void main(String args[]){
		StringBuilder sb = new StringBuilder("동해물과 백두산이 마르고  ");
		
		System.out.println(sb);
		
		// 기존 문자열에서 추가됨
		System.out.println(sb.append("닳도록 보우하사 "));
		
		//index가 19인 곳에 "하느님이 하느님이 "를 삽입
		System.out.println(sb.insert(19, "하느님이 하느님이 "));
		
		//index가 24부터 27까지 문자열 삭제
		System.out.println(sb.delete(24, 28));
		
		// index가 9인 곳에 문자 한개만 삭제
		System.out.println(sb.deleteCharAt(9));
	}

}
