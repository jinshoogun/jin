package ex11_09;

import java.util.Random;

public class RandomExample3 {
	public static void main(String args[]) {

		int lotto[] = new int[6]; // �迭�� �������� Ȯ�� �� �� �����ϱ� ����.
		Random r = new Random(); 
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (r.nextInt(45)+1);

			for (int j = 0; j < i; j++) { //�� ������ ���� ���� �ζǰ��� �ߺ��Ǵ��� Ȯ���ϴ� for��
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("����� �λ���ȣ��?");
		for (int k = 0; k < lotto.length; k++) {
			System.out.println(lotto[k] + " ");
			//i, j, k�� �׳� ������ ��쿡 ���и��ϱ� ���ؼ� ���� ������ �����ѰŻ�����
			// 3���� �ٸ��ٴ� ���� �ƴ�!
		}
	}
}
