package Q10_12;

import java.util.Random;

public class A2 {
	public static void main(String args[]) {
		int lotto[] = new int[6];

		Random r = new Random();
		// 같은 의미 java.util.Random r = new java.util.Random();

		for (int i = 0; i < lotto.length; i++) {

			// lotto[i] = r.nextInt(46);//0부터 45까지의 난수 발생한다.
			lotto[i] = r.nextInt(45) + 1; // 1부터 45까지의 난수 발생한다.

			for (int j = 0; j < i; j++) { // 중복 체크
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

		for (int k = 0; k < lotto.length; k++)
			System.out.print(lotto[k] + "\t");
	}
}



