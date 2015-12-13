package Q10_12;

import java.util.Random;

public class A1 {
	public static void main(String args[]) {

		int lotto[] = new int[6]; 
		Random r = new Random(); 
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (r.nextInt(45)+1);

			for (int j = 0; j < i; j++) { 
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("당신의 인생번호는?");
		for (int k = 0; k < lotto.length; k++) {
			System.out.println(lotto[k] + " ");

		}
	}
}
