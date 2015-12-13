package ex11_09;

import java.util.Random;

public class RandomExample3 {
	public static void main(String args[]) {

		int lotto[] = new int[6]; // 배열은 값내용을 확인 할 수 있으니깐 사용됨.
		Random r = new Random(); 
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (r.nextInt(45)+1);

			for (int j = 0; j < i; j++) { //이 포문은 전에 나온 로또값이 중복되는지 확인하는 for문
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("당신의 인생번호는?");
		for (int k = 0; k < lotto.length; k++) {
			System.out.println(lotto[k] + " ");
			//i, j, k는 그냥 각각의 경우에 구분만하기 위해서 만든 변수를 정의한거뿐이지
			// 3개가 다르다는 것이 아님!
		}
	}
}
