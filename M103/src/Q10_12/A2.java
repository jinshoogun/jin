package Q10_12;

import java.util.Random;

public class A2 {
	public static void main(String args[]) {
		int lotto[] = new int[6];

		Random r = new Random();
		// ���� �ǹ� java.util.Random r = new java.util.Random();

		for (int i = 0; i < lotto.length; i++) {

			// lotto[i] = r.nextInt(46);//0���� 45������ ���� �߻��Ѵ�.
			lotto[i] = r.nextInt(45) + 1; // 1���� 45������ ���� �߻��Ѵ�.

			for (int j = 0; j < i; j++) { // �ߺ� üũ
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



