package ex11_07;

public class MathExample3_1 {
	public static void main(String args[]) {

		int num[] = new int[6]; // �迭�� �������� Ȯ�� �� �� �����ϱ� ����.
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) { //�� ������ ���� ���� �ζǰ��� �ߺ��Ǵ��� Ȯ���ϴ� for��
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		}

		for (int k = 0; k < num.length; k++) {
			System.out.println(num[k] + " ");
		}
	}
}
