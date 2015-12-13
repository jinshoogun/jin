package ex11_03;

//StringTokenzier를 이용해서 문자열로부터 토큰을 분리하는 시스템
// 한개의 구획문자(구분자)를 기준으로 토큰을 구분합니다

import java.util.StringTokenizer;

public class StringTokenizerExample2 {
	public static void main(String args[]) {

		StringTokenizer stok = new StringTokenizer("사과,배,복숭아", ",");
	
		while (stok.hasMoreTokens()){
			String str = stok.nextToken();
			System.out.println(str);
		}
	}
}
