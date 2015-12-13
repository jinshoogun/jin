package ex11_07;

public class MathExample3_1 {
	public static void main(String args[]) {

		int num[] = new int[6]; // 배열은 값내용을 확인 할 수 있으니깐 사용됨.
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) { //이 포문은 전에 나온 로또값이 중복되는지 확인하는 for문
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
