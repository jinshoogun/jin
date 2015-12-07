package ex11_01;
//substring(int beginIndex) : begin부터 문자열 끝까지 부분 문자열 리턴
//substring(int beginIndex, endIndex) : begin부터 end-1까지 부분 문자열 리턴

public class StringExample6 {
	public static void main(String args[]) {
		String str = "뇌를 자극하는 자바";
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7));
	}
}
