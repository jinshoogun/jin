package ex12_01;

//unchecked exception�� �ش� - ������ ���� ����
// ����� ���� �߻� - ���� �߻�
public class ExceptionExample2_1 {
	public static void main(String args[]) {
		int num1 = 3, num2 = 0;
		try {
			int result = num1 / num2;
			System.out.println(result);

		} catch (ArithmeticException e) {

			String message = e.getMessage();
			System.err.println(message);
		} finally {
			System.out.println("������� �Ծ��");
		}
	}

}
