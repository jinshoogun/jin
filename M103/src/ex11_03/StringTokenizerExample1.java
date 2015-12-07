package ex11_03;

//StringTokenzier를 이용해서 문자열로부터 토큰을 분리하는 시스템
// 공백문자를 기준으로 토큰을 구분합니다.

import java.util.StringTokenizer;

public class StringTokenizerExample1 {
	public static void main(String args[]) {

		StringTokenizer stok = new StringTokenizer("사과 배 복숭아");
		String s1 = stok.nextToken();
		System.out.println(s1);

		String s2 = stok.nextToken();
		System.out.println(s2);

		String s3 = stok.nextToken();
		System.out.println(s3);
		
		//런타임 에러 발생 - 추출한 토큰이 더 이상 없음 (그리고 에러)
		//String s4 = stok.nextToken();
		//System.out.println(s4);
		
		System.out.println("=============================================");
		
		StringTokenizer stok2 = new StringTokenizer ("사과 배 복숭아");
		while (stok2.hasMoreTokens()){ //토큰이 있을때만 반복하기
			String str = stok2.nextToken(); // 문자열로부터 토큰을 추출
			System.out.println(str);
		}
		
		
		
		
		
		
	}

}
