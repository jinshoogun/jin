package ex05_03;

public class While01 {
	public static void main(String args[]) {
		System.out.println("==1������==.");
		int i = 1;
		while (i <= 20) {
			System.out.println(i);
			i = i + 1;
		}
		System.out.println("==Ȧ�����==");
		i = 1;
		while (i <= 20) {
			System.out.println(i);
			i = i + 2;
		}
		System.out.println("==¦�����==");
		i = 2;
		while (i <= 20) {
			System.out.println(i);
			i = i + 2;
		}
		System.out.println("==20���� 3�ǹ�� ���==");
		i = 3;
		while (i <= 20) {
			System.out.println(i);
			i = i + 3;
		}
		System.out.println("==1~10������ ��==");
		int sum = 0;
		i = 1;
		while (i <= 10) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println(sum);
		System.out.println("==1~10���� Ȧ���� ��==");
		sum = 0;
		i = 1;
		while (i <= 10) {
			sum = sum + i;
			i = i + 2;
			
		}
		System.out.println(sum);
		System.out.println("==1~10���� ¦���� ��==");
		
		sum = 0;
		i = 2;
		while (i <= 10) {
			sum = sum + i;
			i = i + 2;
			
		}
		System.out.println(sum);
	}
}
