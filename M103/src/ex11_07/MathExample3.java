package ex11_07;

public class MathExample3 {
	public static void main(String args[]) {
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());

		int num;
		// 0���� 9������ ���� ������ ���ϴ� ������ �����
		// ���� : (����ȭ)((���Ѱ� - ���Ѱ�+1)*�����߻���ġ + ���Ѱ�)

		num = (int) (Math.random() * 10);
		System.out.println(num);
	}
}
