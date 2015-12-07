package ex11_03;

//StringTokenzier를 이용해서 문자열로부터 토큰을 분리하는 시스템
// 한개의 구획문자(구분자)를 기준으로 토큰을 구분합니다

import java.util.StringTokenizer;

public class StringTokenizerExample4 {
	public static void main(String args[]) {

		StringTokenizer stok = new StringTokenizer("사과=10|초콜렛=3|삼페인=1", "=|", true);
	    // true :  구획문자도 토큰으로 추출하도록 만드는 파라미터
		System.out.println("상품이름\t상품수 " );
		
		while (stok.hasMoreTokens()){
			String token = stok.nextToken();
			//System.out.println(token);
			
			if (token.equals("="))
				System.out.print("\t");
			else if (token.equals("|"))
				System.out.print("\n");
			else
				System.out.print(token);
		}
	}
}
